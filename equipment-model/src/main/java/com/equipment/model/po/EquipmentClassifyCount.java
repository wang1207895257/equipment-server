package com.equipment.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * equipment_classify_count
 */
@Getter
@Setter
@TableName("equipment_classify_count")
public class EquipmentClassifyCount {
    /**
     * 分类id
     */
    private String classifyId;

    /**
     * 分类编号
     */
    private String classifyCode;

    /**
     * 分类名称
     */
    private String classifyName;

    /**
     * 新增数量
     */
    private Integer newCount;

    /**
     * 调入数量
     */
    private Integer callInCount;

    /**
     * 调出数量
     */
    private Integer callOutCount;

    /**
     * 租出数量
     */
    private Integer leasedCount;

    /**
     * 收回数量
     */
    private Integer recoveredCount;

    /**
     * 故障数量
     */
    private Integer breakdownCount;

    /**
     * 销账数量
     */
    private Integer writtenOffCount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 分类id
     * @return classify_id 分类id
     */
    public String getClassifyId() {
        return classifyId;
    }

    /**
     * 分类id
     * @param classifyId 分类id
     */
    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId == null ? null : classifyId.trim();
    }

    /**
     * 分类编号
     * @return classify_code 分类编号
     */
    public String getClassifyCode() {
        return classifyCode;
    }

    /**
     * 分类编号
     * @param classifyCode 分类编号
     */
    public void setClassifyCode(String classifyCode) {
        this.classifyCode = classifyCode == null ? null : classifyCode.trim();
    }

    /**
     * 分类名称
     * @return classify_name 分类名称
     */
    public String getClassifyName() {
        return classifyName;
    }

    /**
     * 分类名称
     * @param classifyName 分类名称
     */
    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    /**
     * 新增数量
     * @return new_count 新增数量
     */
    public Integer getNewCount() {
        return newCount;
    }

    /**
     * 新增数量
     * @param newCount 新增数量
     */
    public void setNewCount(Integer newCount) {
        this.newCount = newCount;
    }

    /**
     * 调入数量
     * @return call_in_count 调入数量
     */
    public Integer getCallInCount() {
        return callInCount;
    }

    /**
     * 调入数量
     * @param callInCount 调入数量
     */
    public void setCallInCount(Integer callInCount) {
        this.callInCount = callInCount;
    }

    /**
     * 调出数量
     * @return call_out_count 调出数量
     */
    public Integer getCallOutCount() {
        return callOutCount;
    }

    /**
     * 调出数量
     * @param callOutCount 调出数量
     */
    public void setCallOutCount(Integer callOutCount) {
        this.callOutCount = callOutCount;
    }

    /**
     * 租出数量
     * @return leased_count 租出数量
     */
    public Integer getLeasedCount() {
        return leasedCount;
    }

    /**
     * 租出数量
     * @param leasedCount 租出数量
     */
    public void setLeasedCount(Integer leasedCount) {
        this.leasedCount = leasedCount;
    }

    /**
     * 收回数量
     * @return recovered_count 收回数量
     */
    public Integer getRecoveredCount() {
        return recoveredCount;
    }

    /**
     * 收回数量
     * @param recoveredCount 收回数量
     */
    public void setRecoveredCount(Integer recoveredCount) {
        this.recoveredCount = recoveredCount;
    }

    /**
     * 故障数量
     * @return breakdown_count 故障数量
     */
    public Integer getBreakdownCount() {
        return breakdownCount;
    }

    /**
     * 故障数量
     * @param breakdownCount 故障数量
     */
    public void setBreakdownCount(Integer breakdownCount) {
        this.breakdownCount = breakdownCount;
    }

    /**
     * 销账数量
     * @return written_off_count 销账数量
     */
    public Integer getWrittenOffCount() {
        return writtenOffCount;
    }

    /**
     * 销账数量
     * @param writtenOffCount 销账数量
     */
    public void setWrittenOffCount(Integer writtenOffCount) {
        this.writtenOffCount = writtenOffCount;
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