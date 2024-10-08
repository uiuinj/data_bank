package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class AccessibleParkingSpace {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer buildingId;
    private Double wheelchairAccessWidth; // 无障碍停车位一侧，轮椅通道宽度
    private Double heightDifference; // 轮椅通道与其所服务的停车位高差值
    private int isHeight;
    private Integer heightDifferenceOfThePedestrian; // 人行通道有高差处是否设置缘石坡道，与无障碍通道衔接
    private Integer motorVehicleParkingSpaces; // 无障碍机动车停车位的地面是否设置停车线
    private Integer accessibleGuide; // 是否设置引导标识
    private Double parkingSpaceLength; // 停车位长度(不含通道线）
    private Double parkingSpaceWidth; // 停车位宽度(不含通道线）
    private Integer accessibleSign; // 无障碍机动车停车位的地面是否设置无障碍标志
    private Integer accessibleLine; // 无障碍机动车停车位的地面是否设置轮椅通道线
    private String description;
    private Date createTime;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
    private Date updateTime;

}