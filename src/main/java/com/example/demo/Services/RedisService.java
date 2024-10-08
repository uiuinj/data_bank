package com.example.demo.Services;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class RedisService {

    private final RedisTemplate<String, Object> redisTemplate;


    public RedisService(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }



    public void saveToRedis(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getFromRedis(String key) {
        return redisTemplate.opsForValue().get(key);
    }
    public void deleteFromRedis(String key) {
        redisTemplate.delete(key);
    }
    public void saveToRedisWithSecond(String key, Object value, long expirationInSeconds) {
        redisTemplate.opsForValue().set(key, value);
        redisTemplate.expire(key, expirationInSeconds, TimeUnit.SECONDS);
    }


//    public void extendTime(long )
}

