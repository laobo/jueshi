package com.simhash;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * @author zhangcheng
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

//		if (args.length != 2) {
//			System.err.println("Usage: inputfile outputfile");
//			return;
//		}
		long start = System.nanoTime();
		// Creates SimHash object.
		Simhash simHash = new Simhash(new BinaryWordSeg());

		// DocHashes is a list that will contain all of the calculated hashes.
		ArrayList<Long> docHashes = Lists.newArrayList();

		// Maps 12-bit key with the documents matching the partial hash
		Map<BitSet, HashSet<Integer>> hashIndex = Maps.newHashMap();

		// Read the documents. (Each line represents a document).
		List<String> docs = Lists.newArrayList();
		docs.add("一住行窝几十年，蓬头长日走如颠！");
		docs.add("一住行窝几十年，蓬头长日走如颠");
		docs.add("一个颇为戏剧化的细节是，就在乐清强奸杀人案被光的前一天（8月24日），滴滴刚刚成立了用户体验服务发展平台。由原客服副总裁黄金红（现已被免职）主管，向品质出行事业群负责人付强汇报。然而成立仅24小时，这个用于提升用户安全和体验的部门就遭遇了前所未有的打击。");
		docs.add("一个颇为戏剧化的细节是，就在乐清强奸杀人案被曝光的前一天（8月24日），滴滴刚刚成立了用户体验服务发展平台。由原客服副总裁黄金红（现已被免职）主管，向品质出行事业群负责人付强汇报。然而成立仅24小时，这个致力于提升用户安全和体验的部门就遭遇了前所未有的打击。");
		docs.add("qwerqewrqwrwerqwrwrwerqwreqwrqwerqwreqwerqwreqwrwqre");
		docs.add("qwerqewrqwrwerqwrwrwerqwreqwrqwerqwreqwerqwreqwrwqr");

		int idx = 0;

		System.out.println("Start to build index...");
		for (String doc : docs) {
			// Calculate the document hash.
			long docHash = simHash.simhash64(doc);
			System.out.println("Document=[" + doc + "] Hash=[" + docHash + "]");

			// Store the document hash in a list.
			docHashes.add(docHash);

			// StringBuilder keyBuilder = new StringBuilder(12);
			BitSet key = new BitSet(12);

			int step = 0;

			for (int i = 0; i < 64; ++i) {
				key.set(step, ((docHash >> i) & 1) == 1);
				if (step++ == 12) {
					/*
					 * a) Separates the hash in 12-bit keys. b) This value will
					 * be a key in hashIndex. c) hashIndex will contain sets of
					 * documents matching each key (12-bits).
					 */
					if (hashIndex.containsKey(key)) {
						hashIndex.get(key).add(idx);
					} else {
						HashSet<Integer> vector = new HashSet<Integer>();
						vector.add(idx);
						hashIndex.put(key, vector);
					}
					step = 0;
					key = new BitSet(12); // reset key holder.
				}
			}
			++idx;
		}
		System.out.println("Index has been built.");
		File output = new File("/Users/laobo/out.txt");
		idx = 0;
		BitSet bits = new BitSet(docs.size());

		for (String doc : docs) {
			// For each document.

			if (bits.get(idx)) {
				++idx;
				continue;
			}

			// Calculates document hash.
			long docHash = simHash.simhash64(doc);
			BitSet key = new BitSet(12);

			int step = 0;
			HashSet<Integer> docSimilarCandidates = Sets.newHashSet();
			for (int i = 0; i < 64; ++i) {
				key.set(step, ((docHash >> i) & 1) == 1);

				if (step++ == 12) {
					/*
					 * a) Separates the hash in 12-bit keys. b) This value will
					 * be a key in hashIndex. c) hashIndex will contain sets of
					 * documents matching each key (12-bits).
					 */
					if (hashIndex.containsKey(key)) {
						docSimilarCandidates.addAll(hashIndex.get(key));
					}
					step = 0;
					key = new BitSet(12);
				}
			}
			List<Integer> similarDocs = Lists.newLinkedList();
			Map<Integer, Integer> docDistances = Maps.newHashMap();
			for (Integer i : docSimilarCandidates) {
				int dist = simHash.hammingDistance(docHash, docHashes.get(i));
				if (dist <= 3) {
					similarDocs.add(i);
					bits.set(i);
					docDistances.put(i, dist);
				}
			}
			if (!similarDocs.isEmpty()) {
				Files.append("Documents similar as [" + doc + "]:\n", output, Charsets.UTF_8);
				for (int i : similarDocs) {
					if (i == idx)
						continue;
					Files.append("[" + docs.get(i) + "]\tDistance=[" + docDistances.get(i) + "]\n", output, Charsets.UTF_8);
				}
				Files.append("End\n", output, Charsets.UTF_8);
			}
			bits.set(idx);
			++idx;
		}

		System.out.println("Elapsed time: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));
	}

	private static List<String> readDocs(String[] args) throws IOException {
		return Files.readLines(new File(args[0]), Charsets.UTF_8);
	}
}
