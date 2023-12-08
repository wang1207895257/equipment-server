package com.equipment.model.dto;

import lombok.Data;

/**
 * equipment
 */
@Data
public class EquipmentDTO {
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