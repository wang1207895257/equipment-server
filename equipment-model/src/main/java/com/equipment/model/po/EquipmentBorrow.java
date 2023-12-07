package com.equipment.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * equipment_borrow
 */
@Getter
@Setter
@TableName("equipment_borrow")
public class EquipmentBorrow {
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

    /**
     * 主键id
     * @return borrow_id 主键id
     */
    public String getBorrowId() {
        return borrowId;
    }

    /**
     * 主键id
     * @param borrowId 主键id
     */
    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId == null ? null : borrowId.trim();
    }

    /**
     * 借用编号
     * @return borrow_code 借用编号
     */
    public String getBorrowCode() {
        return borrowCode;
    }

    /**
     * 借用编号
     * @param borrowCode 借用编号
     */
    public void setBorrowCode(String borrowCode) {
        this.borrowCode = borrowCode == null ? null : borrowCode.trim();
    }

    /**
     * 设备台账编号
     * @return record_code 设备台账编号
     */
    public String getRecordCode() {
        return recordCode;
    }

    /**
     * 设备台账编号
     * @param recordCode 设备台账编号
     */
    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode == null ? null : recordCode.trim();
    }

    /**
     * 设备借用日期
     * @return borrow_date 设备借用日期
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * 设备借用日期
     * @param borrowDate 设备借用日期
     */
    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
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
     * 借用部门
     * @return borrow_target_dept 借用部门
     */
    public String getBorrowTargetDept() {
        return borrowTargetDept;
    }

    /**
     * 借用部门
     * @param borrowTargetDept 借用部门
     */
    public void setBorrowTargetDept(String borrowTargetDept) {
        this.borrowTargetDept = borrowTargetDept == null ? null : borrowTargetDept.trim();
    }

    /**
     * 借用人
     * @return borrow_person 借用人
     */
    public String getBorrowPerson() {
        return borrowPerson;
    }

    /**
     * 借用人
     * @param borrowPerson 借用人
     */
    public void setBorrowPerson(String borrowPerson) {
        this.borrowPerson = borrowPerson == null ? null : borrowPerson.trim();
    }

    /**
     * 借出部门
     * @return borrow_source_dept 借出部门
     */
    public String getBorrowSourceDept() {
        return borrowSourceDept;
    }

    /**
     * 借出部门
     * @param borrowSourceDept 借出部门
     */
    public void setBorrowSourceDept(String borrowSourceDept) {
        this.borrowSourceDept = borrowSourceDept == null ? null : borrowSourceDept.trim();
    }

    /**
     * 设备状态
     * @return equipment_status 设备状态
     */
    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * 设备状态
     * @param equipmentStatus 设备状态
     */
    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus == null ? null : equipmentStatus.trim();
    }

    /**
     * 预计归还日期
     * @return estimated_return_date 预计归还日期
     */
    public Date getEstimatedReturnDate() {
        return estimatedReturnDate;
    }

    /**
     * 预计归还日期
     * @param estimatedReturnDate 预计归还日期
     */
    public void setEstimatedReturnDate(Date estimatedReturnDate) {
        this.estimatedReturnDate = estimatedReturnDate;
    }

    /**
     * 归还日期
     * @return return_date 归还日期
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * 归还日期
     * @param returnDate 归还日期
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
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