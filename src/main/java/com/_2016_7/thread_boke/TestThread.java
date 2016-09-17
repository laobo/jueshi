package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/11.
 */
public class TestThread {

    public static void main(String[] str){


        //testTicket1();
        testTicket2();


    }


    //测试类的实现方式
    public static void testThread(){
        Thread1 t1 = new Thread1("t1");
        new Thread(t1).start();

        Thread2 t2 = new Thread2();
        t2.start();
    }

    public static void testTicket1(){
        TicketThread1 t1 = new TicketThread1();
        TicketThread1 t2 = new TicketThread1();
        TicketThread1 t3 = new TicketThread1();
        t1.start();
        t2.start();
        t3.start();
    }

    public static void testTicket2(){
        TicketThread2 ticketThread2 = new TicketThread2();
        new Thread(ticketThread2).start();
        new Thread(ticketThread2).start();
        new Thread(ticketThread2).start();
    }

}
