package com.test;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/**
 * 描述：
 *
 * @author lianyf
 * @date 2018-06-28 11:43
 */
public class EncryptUtil {

    private static final String DEFAULT_URL_ENCODING = "UTF-8";
    private static final int DEFAULT_AES_KEYSIZE = 128;

    /**
     * 使用AES加密原始字符串.
     *
     * @param input 原始输入字符数组
     * @param key 符合AES要求的密钥
     */
    public static String aesEncrypt(String input, String key) {
        try {
            byte[] encrypt = aes(input.getBytes(DEFAULT_URL_ENCODING), decodeHex(key), Cipher.ENCRYPT_MODE);
            return encodeHex(encrypt);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /**
     * 使用AES解密字符串, 返回原始字符串.
     *
     * @param input Hex编码的加密字符串
     * @param key 符合AES要求的密钥
     */
    public static String aesDecrypt(String input, String key) {
        try {
            if(null==input||"".equals(input.trim())) {
                return "";
            }
            byte[] decrypt = aes(decodeHex(input), decodeHex(key), Cipher.DECRYPT_MODE);
            return new String(decrypt, DEFAULT_URL_ENCODING);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /**
     * 使用AES加密或解密无编码的原始字节数组, 返回无编码的字节数组结果.
     *
     * @param input 原始字节数组
     * @param key 符合AES要求的密钥
     * @param mode Cipher.ENCRYPT_MODE 或 Cipher.DECRYPT_MODE
     */
    private static byte[] aes(byte[] input, byte[] key, int mode) {
        try {
            SecretKey secretKey = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(mode, secretKey);
            return cipher.doFinal(input);
        } catch (GeneralSecurityException e) {
            System.out.println("AES加密或解密异常：" + e);
        }
        return null;
    }

    /**
     * Hex编码.
     */
    public static String encodeHex(byte[] input) {
        return new String(Hex.encodeHex(input));
    }

    /**
     * Hex解码.
     */
    public static byte[] decodeHex(String input) {
        try {
            return Hex.decodeHex(input.toCharArray());
        } catch (DecoderException e) {
            System.out.println("Hex解码异常：" + e);
        }
        return null;
    }

    /**
     * 生成AES密钥,返回字节数组, 默认长度为128位(16字节).
     */
    public static String generateAesKeyString() {
        return new String(Hex.encodeHex(generateAesKey(DEFAULT_AES_KEYSIZE)));
    }

    /**
     * 生成AES密钥,可选长度为128,192,256位.
     */
    public static byte[] generateAesKey(int keysize) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(keysize);
            SecretKey secretKey = keyGenerator.generateKey();
            return secretKey.getEncoded();
        } catch (GeneralSecurityException e) {
            System.out.println("生成AES密钥异常：" + e);
        }
        return null;
    }

    public static void main(String[] args) {
        String aeskey = generateAesKeyString();

        String src = "这是一个测试";
        System.out.println("秘钥：" + aeskey);

        String encryptStr = aesEncrypt(src, aeskey);
        System.out.println("原字符串：" + aeskey);
        System.out.println("加密后字符串：" + encryptStr);
        String decryptStr = aesDecrypt(encryptStr, aeskey);
        System.out.println("解密后字符串：" + decryptStr);

    }
}
