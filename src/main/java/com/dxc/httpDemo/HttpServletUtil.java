package com.dxc.httpDemo;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * Created by duanxiangchao on 2015/7/10.
 */
public class HttpServletUtil {

    private static CloseableHttpClient httpClient;
    private static RequestConfig.Builder requestConfig = RequestConfig.custom().setSocketTimeout(3600);

}
