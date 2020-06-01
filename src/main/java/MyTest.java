import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * Created by duanxiangchao on 2018/9/4
 */
public class MyTest {

    public static void main(String[] args) throws UnknownHostException {

//        test1();

    }




    private static void test1() throws UnknownHostException {
        String st = "1,2,3,4";
        st = st.substring(st.lastIndexOf(",") + 1, st.length());
        System.out.println(st);

        InetAddress addr = InetAddress.getLocalHost();
        String ip=addr.getHostAddress().toString(); //获取本机ip
        String hostName=addr.getHostName().toString(); //获取本机计算机名称
        System.out.println(ip);
        System.out.println(hostName);
    }

}
