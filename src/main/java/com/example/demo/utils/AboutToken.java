package com.example.demo.utils;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class AboutToken {
    public String getToken(String userId){
        long appId = 1096212156L;    // 由即构提供
        String secretKey = "0a5b22b2b996da8b8c0dc633a9d20ced";  // 由即构提供
//        String userId = "test_user";    // 用户 ID，同一 appId 下全网唯一
        int effectiveTimeInSeconds = 300;   // 有效时间，单位：秒

        JSONObject payloadData = new JSONObject();
        payloadData.put("room_id", "demo"); // 房间id，限制用户只能登录特定房间，必输。
        JSONObject privilege = new JSONObject();
        //是否允许登录房间 1 允许 0关闭
        privilege.put(TokenServerAssistant.PrivilegeKeyLogin, TokenServerAssistant.PrivilegeEnable);
        //是否允许推流    1 允许 0关闭
        privilege.put(TokenServerAssistant.PrivilegeKeyPublish, TokenServerAssistant.PrivilegeDisable);
        payloadData.put("privilege", privilege); // 必输，登录房间、推流两个权限位必须赋值其中一个或两个。
        payloadData.put("stream_id_list", null); // 流列表，非必输
        String payload = payloadData.toJSONString();

        TokenServerAssistant.VERBOSE = false;    // 调试时，置为 true, 可在控制台输出更多信息；正式运行时，最好置为 false
        TokenServerAssistant.TokenInfo token = TokenServerAssistant.generateToken04(appId,  userId, secretKey, effectiveTimeInSeconds, payload);
        System.out.println(token.data);
        return token.data;
    }

    public static void main(String[] args) {
        AboutToken aboutToken=new AboutToken();
        System.out.println(aboutToken.getToken("observer"));
    }

}
