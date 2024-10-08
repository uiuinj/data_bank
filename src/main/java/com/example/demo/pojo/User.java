package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

@Data
public class User {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private int id;
    private String username;
    private String password;
    private Date createTime;
    private Integer status;
    private String phone;
    @TableField(exist = false)
    private String code;
    private int role;
}
