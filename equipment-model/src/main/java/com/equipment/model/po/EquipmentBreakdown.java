package com.equipment.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * equipment_breakdown
 */
@Getter
@Setter
@TableName("equipment_breakdown")
public class EquipmentBreakdown {
    /**
     * 主键id
     */
    private String breakdownId;

    /**
     * 单据编号
     */
    private String breakdownCode;

    /**
     * 台账编号
     */
    private String recordCode;

    /**
     * 设备故障原因
     */
    private String breakdownReason;

    /**
     * 维修单位
     */
    private String maintainUnit;

    /**
     * 审核人
     */
    private String reviewer;

    /**
     * 审核日期
     */
    private Date reviewerDate;

    /**
     * 送修人
     */
    private String sendMaintainPerson;

    /**
     * 维修完成日期
     */
    private Date maintainEndDate;

    /**
     * 备注
     */
    private String remark;
}