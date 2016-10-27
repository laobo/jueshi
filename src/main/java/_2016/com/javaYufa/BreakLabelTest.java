package _2016.com.javaYufa;

/**
 * Created by duanxiangchao on 16/10/27.
 */
public class BreakLabelTest {

    public static void main(String[] arg){

        testLabel();

    }

    /**
     * break跳出当前循环，label标签跳出所有循环
     */
    private static void testLabel(){
        label:
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + "+" + j + "  ");
                if(j == 3)
                    break label;
            }
            System.out.println();
        }
    }

}
