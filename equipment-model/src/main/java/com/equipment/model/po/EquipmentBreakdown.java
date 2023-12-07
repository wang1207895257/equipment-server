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

    /**
     * 主键id
     * @return breakdown_id 主键id
     */
    public String getBreakdownId() {
        return breakdownId;
    }

    /**
     * 主键id
     * @param breakdownId 主键id
     */
    public void setBreakdownId(String breakdownId) {
        this.breakdownId = breakdownId == null ? null : breakdownId.trim();
    }

    /**
     * 单据编号
     * @return breakdown_code 单据编号
     */
    public String getBreakdownCode() {
        return breakdownCode;
    }

    /**
     * 单据编号
     * @param breakdownCode 单据编号
     */
    public void setBreakdownCode(String breakdownCode) {
        this.breakdownCode = breakdownCode == null ? null : breakdownCode.trim();
    }

    /**
     * 台账编号
     * @return record_code 台账编号
     */
    public String getRecordCode() {
        return recordCode;
    }

    /**
     * 台账编号
     * @param recordCode 台账编号
     */
    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode == null ? null : recordCode.trim();
    }

    /**
     * 设备故障原因
     * @return breakdown_reason 设备故障原因
     */
    public String getBreakdownReason() {
        return breakdownReason;
    }

    /**
     * 设备故障原因
     * @param breakdownReason 设备故障原因
     */
    public void setBreakdownReason(String breakdownReason) {
        this.breakdownReason = breakdownReason == null ? null : breakdownReason.trim();
    }

    /**
     * 维修单位
     * @return maintain_unit 维修单位
     */
    public String getMaintainUnit() {
        return maintainUnit;
    }

    /**
     * 维修单位
     * @param maintainUnit 维修单位
     */
    public void setMaintainUnit(String maintainUnit) {
        this.maintainUnit = maintainUnit == null ? null : maintainUnit.trim();
    }

    /**
     * 审核人
     * @return reviewer 审核人
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * 审核人
     * @param reviewer 审核人
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer == null ? null : reviewer.trim();
    }

    /**
     * 审核日期
     * @return reviewer_date 审核日期
     */
    public Date getReviewerDate() {
        return reviewerDate;
    }

    /**
     * 审核日期
     * @param reviewerDate 审核日期
     */
    public void setReviewerDate(Date reviewerDate) {
        this.reviewerDate = reviewerDate;
    }

    /**
     * 送修人
     * @return send_maintain_person 送修人
     */
    public String getSendMaintainPerson() {
        return sendMaintainPerson;
    }

    /**
     * 送修人
     * @param sendMaintainPerson 送修人
     */
    public void setSendMaintainPerson(String sendMaintainPerson) {
        this.sendMaintainPerson = sendMaintainPerson == null ? null : sendMaintainPerson.trim();
    }

    /**
     * 维修完成日期
     * @return maintain_end_date 维修完成日期
     */
    public Date getMaintainEndDate() {
        return maintainEndDate;
    }

    /**
     * 维修完成日期
     * @param maintainEndDate 维修完成日期
     */
    public void setMaintainEndDate(Date maintainEndDate) {
        this.maintainEndDate = maintainEndDate;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}