package com._2016_7.threadlocal;

import com._2016_7.testthread1.Test;

/**
 * Created by duanxiangchao on 2016/7/21.
 */
public class SequenceNumber {

    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
        @Override
        public Integer initialValue() {
            return 0;
        }
    };

    public int getNextNum(){
        seqNum.set(seqNum.get() + 1);
        return  seqNum.get();
    }

    public static void main(String[] str){
        SequenceNumber sequenceNumber = new SequenceNumber();
        TestClient testClient1 = new TestClient(sequenceNumber);
        TestClient testClient2 = new TestClient(sequenceNumber);
        TestClient testClient3 = new TestClient(sequenceNumber);

        testClient1.start();
        testClient2.start();
        testClient3.start();

    }

    private static class TestClient extends Thread{
        private SequenceNumber sequenceNumber;

        public TestClient(SequenceNumber sequenceNumber){
            this.sequenceNumber = sequenceNumber;
        }

        @Override
        public void run() {
            for(int i = 0; i < 3; i++){
                System.out.println(Thread.currentThread().getName() + ":" + sequenceNumber.getNextNum());
            }
        }
    }

}
