package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GameController {
    @Autowired
    GameMapper gameMapper;
    @GetMapping("/api/getGames")
    public Map getGames(){
        return Map.of("code",1,"data",gameMapper.selectList(new QueryWrapper<>()));
    }
}
