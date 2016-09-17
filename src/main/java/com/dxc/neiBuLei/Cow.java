package com.dxc.neiBuLei;

/**
 * Created by duanxiangchao on 2015/7/14.
 */
public class Cow {

    private double weight;

    public Cow(){}

    public Cow(double weight){
        this.weight = weight;
    }

    //静态内部类
    private class CowLeg{
        private double length;
        private String color;

        public CowLeg(){}
        public CowLeg(double length,String color){
            this.color = color;
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        //非晶态内部类的实力方法
        public void info(){
            System.out.println("当前牛腿颜色是："+ color + "，高：" + length);
            System.out.println("本牛腿所在奶牛中："+ weight);
        }

    }

    public void test(){
        CowLeg cl = new CowLeg(1.12 , "黑白相间");
        cl.info();
    }

    public static void main(String [] arg){
        Cow cow =new Cow(378.9);
        cow.test();
    }


}
