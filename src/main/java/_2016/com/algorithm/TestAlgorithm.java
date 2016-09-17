package _2016.com.algorithm;

/**
 * Created by duanxiangchao on 2016/8/9.
 */
public class TestAlgorithm {

    public static void main(String arg[]){

        //九九乘法
        test9X9();
        //阶乘
        System.out.println(factorial(5));
        //累加
        System.out.println(sum(100));


    }

    /**
     * 99乘法表
     */
    private static void test9X9(){
        System.out.println("=============================九九乘法表================================");
        for(int i = 1; i < 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "X" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================================================================");
    }

    /**
     * 阶乘
     * @param num
     * @return
     */
    private static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    private static int sum(int num){
        if(num == 0){
            return 0;
        }
        return num + sum(num-1);
    }


}
