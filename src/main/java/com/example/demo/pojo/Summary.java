package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class Summary {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    private Integer id;
    private Integer buildingId;
    private Integer gateInstalled; // 场所内部是否设置闸机
    private Integer wheelchairGate; // 紧邻闸机处是否设置供乘轮椅者通行的出入口
    private Double wheelchairGateWidth; // 乘轮椅者通行出入口净宽
    private Double maximumWidthOfAllGates; // 所有闸机中最大通行净宽
    private Integer accessibleToiletsListBeforeModification; // 场所内每层是否分别设置1个满足无障碍要求的男、女公共卫生间（厕所）或在男、女公共卫生间（厕所）附近至少设置一个独立的无障碍厕所(修改前）
    private String accessibleToiletsListAfterModification; // 场所内每层是否分别设置1个满足无障碍要求的男、女公共卫生间（厕所）或在男、女公共卫生间（厕所）附近至少设置一个独立的无障碍厕所(修改后）
    private Date createTime;
    private int userId;
    private String remarks;
    private int noFacilities;
    private int status;
    private String rejection;
    private Date updateTime;
}