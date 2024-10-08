package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class EntranceAndExit {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer buildingId;
    private Integer entranceAndExitType; // 1平坡，2坡道，3仅台阶
    private Double widthOfWheelchairRamps;
    private Double startingWidthOfTheWheelchairRamp;
    private Double endingWidthOfTheWheelchairRamp;
    private Integer occupiesThisAreaOfSpace; // 是否有物体可能占用此范围空间
    private Double heightOfWheelchairRamp;
    private Double longitudinalSlopeLength;
    private Integer aboutHandrails; // 是否两侧设置扶手，坡道与休息平台的扶手保持连贯
    private Integer safetyBarrier; // 轮椅坡道的临空侧是否采取安全阻挡措施
    private Integer restPlatform; // 是否设置休息平台
    private Double widthOfRestPlatform;
    private Integer airborne; // 坡道是否某侧临空（先问）
    private Integer rainCanopySetUp; // 是否设置雨篷
    private Integer accessibleSign; // 是否设置无障碍标志
    private Integer accessibleGuide; // 是否有纳入室内外环境的标识系统的无障碍标识
    @TableField(exist = false)
    private String row_data;
    private double lat;
    private double lng;
    private String description;//位置描述
    private Date createTime;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
    private Date updateTime;
}