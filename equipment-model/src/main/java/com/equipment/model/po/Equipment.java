package com.equipment.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * equipment
 */
@Getter
@Setter
@TableName("equipment")
public class Equipment {
    /**
     * 设备id
     */
    private String equipmentId;

    /**
     * 设备编号
     */
    private String equipmentCode;

    /**
     * 设备名称
     */
    private String equipmentName;

    /**
     * 分类编号
     */
    private String classifyCode;

    /**
     * 分类名称
     */
    private String classifyName;

    /**
     * 备注
     */
    private String remark;
}