package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.FormMapper;
import com.example.demo.pojo.game.Filter;
import com.example.demo.pojo.game.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FormController {
    @Autowired
    FormMapper formMapper;
    @PostMapping("/form/addForm")
    public Map addForm(@RequestBody Form form){
        System.out.println(form);
        form.setCreateTime(new Date());
        formMapper.insert(form);
        return Map.of("code",1);
    }
    @PostMapping("/form/getDoodList")
    public Map getDoodList(@RequestParam int gameId,
                           @RequestParam int page,
                           @RequestParam(defaultValue = "10") int size,
                           @RequestBody Filter filter){
        System.out.println(page);
        System.out.println(gameId);
        System.out.println(filter);
        Page<Form> page1=new Page<>(page,size);
        QueryWrapper<Form> wrapper=new QueryWrapper<Form>().eq("game_id",gameId).eq("is_delete",0);
        if(filter.getZone()!=0){
            wrapper.eq("zone",filter.getZone());
        }
        if(filter.getGoodKind()!=0){
            wrapper.eq("classification",filter.getGoodKind());
        }
        IPage<Form> iPage=formMapper.selectPage(page1,wrapper);
        System.out.println(iPage.getRecords());
        return Map.of("code",1,"data",iPage);
    }
    @GetMapping("/form/getGoodListByUserId")
    public Map getDoodListByUserId(@RequestParam int userId,
                           @RequestParam int page,
                           @RequestParam(defaultValue = "10") int size){
        System.out.println(page);
        System.out.println(userId);
        Page<Form> page1=new Page<>(page,size);

        IPage<Form> iPage=formMapper.selectPage(page1,new QueryWrapper<Form>()
                .eq("user_id",userId)
                .eq("is_delete",0)
                .orderByDesc("create_time"));
        System.out.println(iPage.getRecords());
        return Map.of("code",1,"data",iPage);
    }
    @GetMapping("/form/deleteGood")
    public Map deleteGood(@RequestParam int goodId){
        System.out.println("delete");
        System.out.println(goodId);
        formMapper.updateDeleteById(goodId,1);
        return Map.of("code",1);
    }
}
