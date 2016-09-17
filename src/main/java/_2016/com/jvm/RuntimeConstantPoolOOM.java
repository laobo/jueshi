package _2016.com.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -XX:PermSize = 10M -XX:MaxPermSize = 10M
 * Created by duanxiangchao on 2016/9/11.
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] arg){
        //使用list保持常量池的引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        //10M的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true){
            list.add(String.valueOf(i ++).intern());
        }
    }

}
