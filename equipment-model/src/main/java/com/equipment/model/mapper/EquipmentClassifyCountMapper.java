package com.equipment.model.mapper;

import com.equipment.model.po.EquipmentClassifyCount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface EquipmentClassifyCountMapper extends BaseMapper<EquipmentClassifyCount> {
    @Delete({
        "delete from equipment_classify_count",
        "where classify_id = #{classifyId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String classifyId);

    @Insert({
        "insert into equipment_classify_count (classify_id, classify_code, ",
        "classify_name, new_count, ",
        "call_in_count, call_out_count, ",
        "leased_count, recovered_count, ",
        "breakdown_count, written_off_count, ",
        "remark)",
        "values (#{classifyId,jdbcType=VARCHAR}, #{classifyCode,jdbcType=VARCHAR}, ",
        "#{classifyName,jdbcType=VARCHAR}, #{newCount,jdbcType=INTEGER}, ",
        "#{callInCount,jdbcType=INTEGER}, #{callOutCount,jdbcType=INTEGER}, ",
        "#{leasedCount,jdbcType=INTEGER}, #{recoveredCount,jdbcType=INTEGER}, ",
        "#{breakdownCount,jdbcType=INTEGER}, #{writtenOffCount,jdbcType=INTEGER}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(EquipmentClassifyCount record);

    @Select({
        "select",
        "classify_id, classify_code, classify_name, new_count, call_in_count, call_out_count, ",
        "leased_count, recovered_count, breakdown_count, written_off_count, remark",
        "from equipment_classify_count",
        "where classify_id = #{classifyId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="classify_id", property="classifyId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="classify_code", property="classifyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="classify_name", property="classifyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="new_count", property="newCount", jdbcType=JdbcType.INTEGER),
        @Result(column="call_in_count", property="callInCount", jdbcType=JdbcType.INTEGER),
        @Result(column="call_out_count", property="callOutCount", jdbcType=JdbcType.INTEGER),
        @Result(column="leased_count", property="leasedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="recovered_count", property="recoveredCount", jdbcType=JdbcType.INTEGER),
        @Result(column="breakdown_count", property="breakdownCount", jdbcType=JdbcType.INTEGER),
        @Result(column="written_off_count", property="writtenOffCount", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    EquipmentClassifyCount selectByPrimaryKey(String classifyId);

    @Update({
        "update equipment_classify_count",
        "set classify_code = #{classifyCode,jdbcType=VARCHAR},",
          "classify_name = #{classifyName,jdbcType=VARCHAR},",
          "new_count = #{newCount,jdbcType=INTEGER},",
          "call_in_count = #{callInCount,jdbcType=INTEGER},",
          "call_out_count = #{callOutCount,jdbcType=INTEGER},",
          "leased_count = #{leasedCount,jdbcType=INTEGER},",
          "recovered_count = #{recoveredCount,jdbcType=INTEGER},",
          "breakdown_count = #{breakdownCount,jdbcType=INTEGER},",
          "written_off_count = #{writtenOffCount,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where classify_id = #{classifyId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(EquipmentClassifyCount record);
}