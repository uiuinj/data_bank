package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.ClassificationMapper;
import com.example.demo.mapper.GoodKindMapper;
import com.example.demo.mapper.ZoneMapper;
import com.example.demo.pojo.game.Classification;
import com.example.demo.pojo.game.GoodKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ClassificationController {
    @Autowired
    ClassificationMapper classificationMapper;
    @Autowired
    ZoneMapper zoneMapper;
    @Autowired
    GoodKindMapper goodKindMapper;
    @GetMapping("/api/classification/getClassification")
    public Map getClassification(@RequestParam int gameId){
        return Map.of("code",1,"data",
                classificationMapper.selectOne(new QueryWrapper<Classification>().eq("game_id",gameId)));
    }
    @GetMapping("/api/classification/getKinds")
    public Map getKinds(){
        return Map.of("code",1,
                "data",Map.of("zone",zoneMapper.selectList(new QueryWrapper<>()),"goodKind",
                        goodKindMapper.selectList(new QueryWrapper<>())));
    }
}
