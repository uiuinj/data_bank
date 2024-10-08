package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class TactilePaving {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer buildingId;
    private Integer isOccupied; // 盲道铺设是否避开障碍物，是否被占用
    private String description;
    private Date createTime;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
    private Date updateTime;
}
