package com.equipment.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * equipment_record
 */
@Getter
@Setter
@TableName("equipment_record")
public class EquipmentRecord {
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

    /**
     * 台账id
     * @return record_id 台账id
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * 台账id
     * @param recordId 台账id
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
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
     * 台账名称
     * @return record_name 台账名称
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * 台账名称
     * @param recordName 台账名称
     */
    public void setRecordName(String recordName) {
        this.recordName = recordName == null ? null : recordName.trim();
    }

    /**
     * 设备编号
     * @return equipment_code 设备编号
     */
    public String getEquipmentCode() {
        return equipmentCode;
    }

    /**
     * 设备编号
     * @param equipmentCode 设备编号
     */
    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode == null ? null : equipmentCode.trim();
    }

    /**
     * 设备名称
     * @return equipment_name 设备名称
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * 设备名称
     * @param equipmentName 设备名称
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
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
     * 生产日期
     * @return product_date 生产日期
     */
    public Date getProductDate() {
        return productDate;
    }

    /**
     * 生产日期
     * @param productDate 生产日期
     */
    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    /**
     * 购置日期
     * @return acquisition_date 购置日期
     */
    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * 购置日期
     * @param acquisitionDate 购置日期
     */
    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    /**
     * 供应厂商
     * @return product_company 供应厂商
     */
    public String getProductCompany() {
        return productCompany;
    }

    /**
     * 供应厂商
     * @param productCompany 供应厂商
     */
    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany == null ? null : productCompany.trim();
    }

    /**
     * 维修厂商
     * @return maintenance_company 维修厂商
     */
    public String getMaintenanceCompany() {
        return maintenanceCompany;
    }

    /**
     * 维修厂商
     * @param maintenanceCompany 维修厂商
     */
    public void setMaintenanceCompany(String maintenanceCompany) {
        this.maintenanceCompany = maintenanceCompany == null ? null : maintenanceCompany.trim();
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
     * 负责人
     * @return person_charge 负责人
     */
    public String getPersonCharge() {
        return personCharge;
    }

    /**
     * 负责人
     * @param personCharge 负责人
     */
    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge == null ? null : personCharge.trim();
    }

    /**
     * 存放位置
     * @return storage_place 存放位置
     */
    public String getStoragePlace() {
        return storagePlace;
    }

    /**
     * 存放位置
     * @param storagePlace 存放位置
     */
    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace == null ? null : storagePlace.trim();
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