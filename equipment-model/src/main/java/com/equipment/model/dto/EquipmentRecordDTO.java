package com.equipment.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * equipment_record
 */
@Data
public class EquipmentRecordDTO {
    /**
     * 台账id
     */
    private String recordId;

    /**
     * 台账编号
     */
    private String recordCode;

    /**
     * 台账名称
     */
    private String recordName;

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
     * 生产日期
     */
    private Date productDate;

    /**
     * 购置日期
     */
    private Date acquisitionDate;

    /**
     * 供应厂商
     */
    private String productCompany;

    /**
     * 维修厂商
     */
    private String maintenanceCompany;

    /**
     * 设备状态
     */
    private String equipmentStatus;

    /**
     * 负责人
     */
    private String personCharge;

    /**
     * 存放位置
     */
    private String storagePlace;

    /**
     * 备注
     */
    private String remark;
}