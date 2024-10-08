package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class DeviceImage {
    @TableId(type = IdType.AUTO) // 指定 ID 字段为自增
    int id;
    int deviceId;
    String imageUrl;
    int deviceTypeId;

}
