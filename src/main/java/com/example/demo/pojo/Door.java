package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Door {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private int id;
    private Integer deviceId;
    private Integer deviceTypeId;
    private Integer doorOpeningMethod; // 1手动门，2电动门
    private Double centerOfTheOperatingComponent; // 电动门的操作部件的中心距地面高度，没有操作部件置-1
    private Integer isProtectiveMeasures; // 全玻璃门是否采取防护措施
    private Integer antiCollisionWarningMeasure; // 全玻璃门是否醒目的防撞提示措施
    private Integer glassPartition; // 全玻璃门开启扇左右两侧是否为玻璃隔断
    private Integer doorVisuallyDistinct; // 全玻璃门是否与玻璃隔断在视觉上显著区分开
    private Integer eyeCatchingCollision; // 玻璃隔断是否采取醒目的防撞提示措施
    private Integer revolvingDoorUsed; // 是否使用旋转门
    private Double widthOfTheDoorPassage; // 门的通行净宽
    private Integer isHeightDifference; // 门前是否有高差
    private Double heightDifference; // 门前高差大小
    private Integer slopeExcessiveSet; // 是否设置斜面过度
    private Double slopeTransitionLength; // 斜面过度长度
    private Double slopeTransitionWidth; // 斜面过度宽度
    private String facilityType; // 所属设施type
    private Integer materialOfTheDoor; // 门的材质：1全玻璃门，2其他
    private Integer doorOpeningOrientation; // 1向内，2向外，3平移
    private Integer occupiesThisAreaOfSpace; // 门是否可能占用此范围空间（仅出入口）
    private Integer platformSet; // 门前是否设置平台（仅出入口）
    private Double depthOfThePlatform; // 门完全开启状态下，平台的净深度（仅出入口）
    private Integer minimumOpeningTime; // 电梯门完全开启最小保持时间（仅电梯)
    private Date createTime;
    private String description;
}
