package com.equipment.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * equipment_borrow
 */
@Data
public class EquipmentBorrowDTO {
    /**
     * 主键id
     */
    private String borrowId;

    /**
     * 借用编号
     */
    private String borrowCode;

    /**
     * 设备台账编号
     */
    private String recordCode;

    /**
     * 设备借用日期
     */
    private Date borrowDate;

    /**
     * 审核人
     */
    private String reviewer;

    /**
     * 审核日期
     */
    private Date reviewerDate;

    /**
     * 借用部门
     */
    private String borrowTargetDept;

    /**
     * 借用人
     */
    private String borrowPerson;

    /**
     * 借出部门
     */
    private String borrowSourceDept;

    /**
     * 设备状态
     */
    private String equipmentStatus;

    /**
     * 预计归还日期
     */
    private Date estimatedReturnDate;

    /**
     * 归还日期
     */
    private Date returnDate;

    /**
     * 备注
     */
    private String remark;
}