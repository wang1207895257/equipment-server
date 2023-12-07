package com.equipment.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.equipment.model.po.EquipmentRecord;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface EquipmentRecordMapper extends BaseMapper<EquipmentRecord> {
    @Delete({
        "delete from equipment_record",
        "where record_id = #{recordId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String recordId);

    @Insert({
        "insert into equipment_record (record_id, record_code, ",
        "record_name, equipment_code, ",
        "equipment_name, classify_code, ",
        "classify_name, product_date, ",
        "acquisition_date, product_company, ",
        "maintenance_company, equipment_status, ",
        "person_charge, storage_place, ",
        "remark)",
        "values (#{recordId,jdbcType=VARCHAR}, #{recordCode,jdbcType=VARCHAR}, ",
        "#{recordName,jdbcType=VARCHAR}, #{equipmentCode,jdbcType=VARCHAR}, ",
        "#{equipmentName,jdbcType=VARCHAR}, #{classifyCode,jdbcType=VARCHAR}, ",
        "#{classifyName,jdbcType=VARCHAR}, #{productDate,jdbcType=DATE}, ",
        "#{acquisitionDate,jdbcType=DATE}, #{productCompany,jdbcType=VARCHAR}, ",
        "#{maintenanceCompany,jdbcType=VARCHAR}, #{equipmentStatus,jdbcType=VARCHAR}, ",
        "#{personCharge,jdbcType=VARCHAR}, #{storagePlace,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(EquipmentRecord record);

    @Select({
        "select",
        "record_id, record_code, record_name, equipment_code, equipment_name, classify_code, ",
        "classify_name, product_date, acquisition_date, product_company, maintenance_company, ",
        "equipment_status, person_charge, storage_place, remark",
        "from equipment_record",
        "where record_id = #{recordId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="record_code", property="recordCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="record_name", property="recordName", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_code", property="equipmentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_name", property="equipmentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="classify_code", property="classifyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="classify_name", property="classifyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_date", property="productDate", jdbcType=JdbcType.DATE),
        @Result(column="acquisition_date", property="acquisitionDate", jdbcType=JdbcType.DATE),
        @Result(column="product_company", property="productCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="maintenance_company", property="maintenanceCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_status", property="equipmentStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_charge", property="personCharge", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_place", property="storagePlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    EquipmentRecord selectByPrimaryKey(String recordId);

    @Update({
        "update equipment_record",
        "set record_code = #{recordCode,jdbcType=VARCHAR},",
          "record_name = #{recordName,jdbcType=VARCHAR},",
          "equipment_code = #{equipmentCode,jdbcType=VARCHAR},",
          "equipment_name = #{equipmentName,jdbcType=VARCHAR},",
          "classify_code = #{classifyCode,jdbcType=VARCHAR},",
          "classify_name = #{classifyName,jdbcType=VARCHAR},",
          "product_date = #{productDate,jdbcType=DATE},",
          "acquisition_date = #{acquisitionDate,jdbcType=DATE},",
          "product_company = #{productCompany,jdbcType=VARCHAR},",
          "maintenance_company = #{maintenanceCompany,jdbcType=VARCHAR},",
          "equipment_status = #{equipmentStatus,jdbcType=VARCHAR},",
          "person_charge = #{personCharge,jdbcType=VARCHAR},",
          "storage_place = #{storagePlace,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where record_id = #{recordId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(EquipmentRecord record);
}