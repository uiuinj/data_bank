package com.example.demo.pojo.game;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

/**
 * FormPOJO类对应数据库中的form表
 */
@Data
public class Form {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer userId;
    private Integer gameId; // 假设字段名为game_id，Java中通常使用驼峰命名法
    private String images;
    private String description;
    private Integer price;
    private Date createTime;
    private Integer isDelete;
    private String title;
    private int zone;
    private int classification;
}
