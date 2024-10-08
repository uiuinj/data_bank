package com.example.demo.utils;


import com.alibaba.fastjson2.JSONObject;
import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.tea.TeaException;
import com.aliyun.teaopenapi.models.Config;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Tigger
 * @date 2022/9/12 15:15
 */
@Slf4j
@Component
public class SendMessage {



    /**
     * description: 使用AK&SK初始化账号Client
     *
     * @param accessKeyId accessKeyId
     * @param accessKeySecret accessKeySecret
     * @return com.aliyun.dysmsapi20170525.Client
     * @author Tigger
     */
    public static Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的 AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的 AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new Client(config);
    }

    /**
     * description: 发送短信
     *
     * @param sendPhoneNumber 发送账号
     * @return java.lang.String
     * @author Tigger
     */
    private String getRandCode(int count) {
        return String.valueOf((int)((Math.random()*9+1)* Math.pow(10,count-1)));
    }
    public String sendMessage(String sendPhoneNumber) throws Exception {
        // 替换成自己的
        String accesskeyId = "1";
        String accesskeySecret = "2";

        Client client = SendCodeMessage.createClient(accesskeyId, accesskeySecret);
        String randCode = getRandCode(6);
        JSONObject jsonObject = new JSONObject(1);
        jsonObject.put("code", randCode);
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setSignName("无障碍地图")
                .setTemplateCode(
                        "SMS_192340583")
                .setPhoneNumbers(sendPhoneNumber)
                .setTemplateParam(jsonObject.toJSONString());
        RuntimeOptions runtime = new RuntimeOptions();

        try {
            // 复制代码运行请自行打印 API 的返回值
            SendSmsResponse sendSmsResponse = client.sendSmsWithOptions(sendSmsRequest, runtime);
            // 获取返回体code
            System.out.println(sendSmsResponse);
            String code = sendSmsResponse.getBody().getCode();
            // 获取返回体状态
            Integer statusCode = sendSmsResponse.getStatusCode();
            System.out.println(code);
            System.out.println(statusCode);
        } catch (TeaException error) {
            // 如有需要，请打印 error
            log.info(Common.assertAsString(error.message));
        } catch (Exception errorMsg) {
            TeaException error = new TeaException(errorMsg.getMessage(), errorMsg);
            // 如有需要，请打印 error
            log.info(Common.assertAsString(error.message));
        }
        return randCode;
    }

    public static void main(String[] args) throws Exception {
        SendMessage sendCodeMessage=new SendMessage();
        String a=sendCodeMessage.sendMessage("13233081383");
        System.out.println("sssss");
        System.out.println(a);
    }
}


