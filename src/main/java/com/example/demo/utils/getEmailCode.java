package com.example.demo.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.Map;

public class getEmailCode {
    public static String getEmailCode(String email){
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("http://tinso.onbotics.cn/sendEmailCode?email="+email);

            CloseableHttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            String responseBody = EntityUtils.toString(entity);

            System.out.println("Response Code: " + response.getStatusLine().getStatusCode());
            System.out.println("Response: " + responseBody);

            httpClient.close();
            return  responseBody;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0";
    }

    public static void main(String[] args) {
        getEmailCode("497080553@qq.com");
    }
}
