package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class LowLevelServiceFacilities {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private int id;
    private int buildingId;
    private Integer type;
    private Double correspondingServiceHeight;
    private Integer roomForKneesAndFeet;
    private Double roomForKneesAndFeetHeight;
    private Double roomForKneesAndFeetWidth;
    private Double roomForKneesAndFeetDepth25;
    private Double roomForKneesAndFeetDepthOther;
    private Date createTime;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
}