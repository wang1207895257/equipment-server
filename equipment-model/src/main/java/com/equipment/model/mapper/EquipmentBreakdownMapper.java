package com.equipment.model.mapper;

import com.equipment.model.po.EquipmentBreakdown;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface EquipmentBreakdownMapper extends BaseMapper<EquipmentBreakdown> {
    @Delete({
        "delete from equipment_breakdown",
        "where breakdown_id = #{breakdownId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String breakdownId);

    @Insert({
        "insert into equipment_breakdown (breakdown_id, breakdown_code, ",
        "equipment_code, breakdown_reason, ",
        "maintain_unit, reviewer, ",
        "reviewer_date, send_maintain_person, ",
        "maintain_end_date, remark)",
        "values (#{breakdownId,jdbcType=VARCHAR}, #{breakdownCode,jdbcType=VARCHAR}, ",
        "#{equipmentCode,jdbcType=VARCHAR}, #{breakdownReason,jdbcType=VARCHAR}, ",
        "#{maintainUnit,jdbcType=VARCHAR}, #{reviewer,jdbcType=VARCHAR}, ",
        "#{reviewerDate,jdbcType=DATE}, #{sendMaintainPerson,jdbcType=VARCHAR}, ",
        "#{maintainEndDate,jdbcType=DATE}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(EquipmentBreakdown record);

    @Select({
        "select",
        "breakdown_id, breakdown_code, equipment_code, breakdown_reason, maintain_unit, ",
        "reviewer, reviewer_date, send_maintain_person, maintain_end_date, remark",
        "from equipment_breakdown",
        "where breakdown_id = #{breakdownId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="breakdown_id", property="breakdownId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="breakdown_code", property="breakdownCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_code", property="equipmentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="breakdown_reason", property="breakdownReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="maintain_unit", property="maintainUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="reviewer", property="reviewer", jdbcType=JdbcType.VARCHAR),
        @Result(column="reviewer_date", property="reviewerDate", jdbcType=JdbcType.DATE),
        @Result(column="send_maintain_person", property="sendMaintainPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="maintain_end_date", property="maintainEndDate", jdbcType=JdbcType.DATE),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    EquipmentBreakdown selectByPrimaryKey(String breakdownId);

    @Update({
        "update equipment_breakdown",
        "set breakdown_code = #{breakdownCode,jdbcType=VARCHAR},",
          "equipment_code = #{equipmentCode,jdbcType=VARCHAR},",
          "breakdown_reason = #{breakdownReason,jdbcType=VARCHAR},",
          "maintain_unit = #{maintainUnit,jdbcType=VARCHAR},",
          "reviewer = #{reviewer,jdbcType=VARCHAR},",
          "reviewer_date = #{reviewerDate,jdbcType=DATE},",
          "send_maintain_person = #{sendMaintainPerson,jdbcType=VARCHAR},",
          "maintain_end_date = #{maintainEndDate,jdbcType=DATE},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where breakdown_id = #{breakdownId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(EquipmentBreakdown record);
}