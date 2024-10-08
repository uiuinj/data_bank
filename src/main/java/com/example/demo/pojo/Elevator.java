package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Elevator {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer buildingId;
    private Double wheelchairTurningSpace; // 电梯门前轮椅回转空间直径
    private Double depthOfTheWaiting; // 建筑的候梯厅深度
    private Integer callButton; // 是否有呼叫按钮（电梯外面的按钮）
    private Integer promptTactilePaving; // 呼叫按钮前是否设置提示盲道
    private Double heightOfTheCall; // 呼叫按钮的中心距地面高度
    private Double theSideWall; // 距内转角处侧墙距离
    private int isWall;//呼梯按钮侧是否有一堵墙
    private Integer buttonMarked; // 按钮是否设置盲文标志
    private Integer elevatorOperation; // 是否电梯运行显示装置
    private Integer arrivalSoundSystem; // 是否有抵达音响
    private Double carDepth; // 轿厢深度
    private Double carWidth; // 轿厢宽度
    private Integer isMirrorMaterial; // 是否设置镜面材料
    private Double mirrorMaterialHeight; // 镜面材料离地高度
    private Integer armrestSetUp; // 是否设置扶手
    private Integer emergencyCallButton; // 是否有紧急通话按钮
    private Integer brailleOnTheButtons; // 轿厢内部按钮上是否有盲文
    private Double widthOfElevatorDoor; // 电梯门通行净宽
    private Integer accessibleElevatorInstalled; // 设有电梯时，是否至少设置1部无障碍电梯
    private Integer accessibleSign; // 是否设置无障碍标志
    private Integer accessibleGuide; // 是否有纳入室内外环境的标识系统的无障碍标识
    private Date createTime;
    private String description;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
    private Date updateTime;
}
