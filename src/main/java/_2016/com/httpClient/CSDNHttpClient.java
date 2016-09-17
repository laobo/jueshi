package _2016.com.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

/**
 * Created by duanxiangchao on 2016/8/18.
 */
public class CSDNHttpClient {

    public static void main(String[] arg){

        for(int i=0; i<10; i++) {
            try {
                HttpClient httpclient = new DefaultHttpClient();
                HttpGet httpget = new HttpGet("http://blog.csdn.net/afterlife_qiye/article/details/49699675");
                HttpResponse response = null;
                response = httpclient.execute(httpget);
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    InputStream instream = null;
                    instream = entity.getContent();
                    int l;
                    byte[] tmp = new byte[2048];
                    while ((l = instream.read(tmp)) != -1) {
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
