package com.example.demo.utils.WebSocket;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class getChatInfo {
    public static String getId(){
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("https://open.chat.onbotics.cn/chat/chatLogin");

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
    public static String logout(String id){
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("https://open.chat.onbotics.cn/chat/chatLogout?id="+id);

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
    public static String getChatInfo(String id,
                                     String content){
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet("https://open.chat.onbotics.cn/chat/getChatInfo?id="+id+
            "&content="+content);

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
        System.out.println(getId());
    }
}
