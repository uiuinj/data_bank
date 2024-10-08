package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Toilet {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer buildingId;
    private Integer genderAllowed; // 什么性别可进入该空间 0仅女，1仅男，2男女都可进入
    private Integer isMultifunctionalTable; // 是否有多功能台
    private Integer externalEmergencyRelease; // 是否采用门外可紧急开启的门闩
    private Integer isToiletAvailable; // 是否有坐便器
    private Integer anLShapedGrabBar; // 坐便器附近是否设置了两端均固定于墙面的L形抓杆
    @TableField("L_shaped_grab_bar_height")
    private Double barHeight; // L形抓杆水平部分距坐便器的上沿高度
    @TableField("L_horizontal_part")
    private Double partHeight;//L形抓杆水平部分离地高度
    private Double measureTheFlatness; // L形抓杆水平部分长度
    private Double lengthOfTheVertical; // L形抓杆竖向部分距离坐便器前端长度
    private Double verticalPartOfTheLShaped; // L形抓杆竖向部分顶部距地面高度
    private Integer rotatableFlatSafetyGrab; // 轮椅接近坐便器一侧是否设置水平安全抓杆(1可旋转，2固定式，3无）
    private Double heightOfTheUpperEdge; // 水平抓杆上沿高度
    private Double upperEdgeOfTheFlat; // 水平抓杆上沿长度
    private Integer paperDispenser; // 是否有取纸器
    private Integer paperDispenserLocated; // 取纸器是否设在坐便器的侧前方
    private Double heightOfThePaperFeeder; // 取纸器高度
    private Double heightOfTheToilet; // 坐便器所在厕所/厕位空间长度
    private Double widthOfTheToilet; // 坐便器所在厕所/厕位空间宽度
    private Integer washbasinAvailable; // 是否有洗手盆
    private Integer mirrorInstalled; // 洗手盆上方是否安装镜子
    private Double distanceBetweenTheBottom; // 镜子反光面的底端距地面的高度
    private Integer handlebarOrInductionTypePneumatic; // 水龙头是否采用杠杆式水龙头或感应式自动出水方式
    private Double distanceBetweenThePlatform; // 台面距地面高度
    private Double mouthAndTheSideWall; // 水嘴中心距侧墙最小距离
    private Double kneeAndFootSpaceHeight; // 洗手盆下部容膝容脚空间高度
    private Double kneeAndFootSpaceWeight; // 洗手盆下部容膝容脚空间宽度
    private Double kneeAndFootSpaceBelow25cm; // 容膝容脚空间距地面25cm下方的进深
    private Double depthOfOtherParts; // 容膝容脚空间其他部分的进深
    private Integer hangingHook; // 是否有挂衣钩
    private Double hangingHookHeight; // 挂衣钩距地面高度
    private Integer rescueCallButton; // 是否有救助呼叫按钮
    private Double rescueCallButtonHeight; // 救助呼叫按钮可操作面，距地面高度
    private Integer accessibleSign; // 是否设置无障碍标志
    private Integer accessibleGuide; // 是否有纳入室内外环境的标识系统的无障碍标识
    private Integer urinals; // 是否有小便器
    private Integer horizontalSafetyGrabBars; // 小便器两侧是否设置水平安全抓杆
    private Double horizontalSafetyGrabBarsLength; // 两侧水平抓杆长度
    private Double horizontalSafetyGrabBarsHeight; // 两侧水平抓杆距地面高度
    private Integer supportingGrabBars; // 小便器上部是否设置支撑安全抓杆
    private Double supportingGrabBarsHeight; // 小便器上部安全抓杆距地面高度
    private Double urinalBottomHeight; // 小便器下口距地面高度
    private Double wheelchairTurningDiameter; // 轮椅回转空间直径
    private String description;
    private Date createTime;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
    private Date updateTime;
}
