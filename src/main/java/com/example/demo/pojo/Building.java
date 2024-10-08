package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import java.util.Date;

@Data
public class Building {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private String name;
    private Integer buildingTypeId;
    private String province;
    private String city;
    private String area;
    private String address;
    private double lng;
    private double lat;
    private Date createTime;
    private Integer level;
    private Integer pid;
    private String remark;
    private Integer score;
    private Integer creatorId; // 假设字段名是 creator_id，Java 中变量名通常不使用下划线
    private  Integer status;

    // 根据需要，可以添加构造函数、toString 方法、equals 和 hashCode 方法等
}
