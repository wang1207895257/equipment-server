package com.equipment.model.mapper;

import com.equipment.model.po.EquipmentBorrow;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface EquipmentBorrowMapper extends BaseMapper<EquipmentBorrow> {
    @Delete({
        "delete from equipment_borrow",
        "where borrow_id = #{borrowId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String borrowId);

    @Insert({
        "insert into equipment_borrow (borrow_id, borrow_code, ",
        "equipment_code, borrow_date, ",
        "reviewer, reviewer_date, ",
        "borrow_target_dept, borrow_person, ",
        "borrow_source_dept, equipment_status, ",
        "estimated_return_date, return_date, ",
        "remark)",
        "values (#{borrowId,jdbcType=VARCHAR}, #{borrowCode,jdbcType=VARCHAR}, ",
        "#{equipmentCode,jdbcType=VARCHAR}, #{borrowDate,jdbcType=DATE}, ",
        "#{reviewer,jdbcType=VARCHAR}, #{reviewerDate,jdbcType=DATE}, ",
        "#{borrowTargetDept,jdbcType=VARCHAR}, #{borrowPerson,jdbcType=VARCHAR}, ",
        "#{borrowSourceDept,jdbcType=VARCHAR}, #{equipmentStatus,jdbcType=VARCHAR}, ",
        "#{estimatedReturnDate,jdbcType=DATE}, #{returnDate,jdbcType=DATE}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(EquipmentBorrow record);

    @Select({
        "select",
        "borrow_id, borrow_code, equipment_code, borrow_date, reviewer, reviewer_date, ",
        "borrow_target_dept, borrow_person, borrow_source_dept, equipment_status, estimated_return_date, ",
        "return_date, remark",
        "from equipment_borrow",
        "where borrow_id = #{borrowId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="borrow_id", property="borrowId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="borrow_code", property="borrowCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_code", property="equipmentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="borrow_date", property="borrowDate", jdbcType=JdbcType.DATE),
        @Result(column="reviewer", property="reviewer", jdbcType=JdbcType.VARCHAR),
        @Result(column="reviewer_date", property="reviewerDate", jdbcType=JdbcType.DATE),
        @Result(column="borrow_target_dept", property="borrowTargetDept", jdbcType=JdbcType.VARCHAR),
        @Result(column="borrow_person", property="borrowPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="borrow_source_dept", property="borrowSourceDept", jdbcType=JdbcType.VARCHAR),
        @Result(column="equipment_status", property="equipmentStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="estimated_return_date", property="estimatedReturnDate", jdbcType=JdbcType.DATE),
        @Result(column="return_date", property="returnDate", jdbcType=JdbcType.DATE),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    EquipmentBorrow selectByPrimaryKey(String borrowId);

    @Update({
        "update equipment_borrow",
        "set borrow_code = #{borrowCode,jdbcType=VARCHAR},",
          "equipment_code = #{equipmentCode,jdbcType=VARCHAR},",
          "borrow_date = #{borrowDate,jdbcType=DATE},",
          "reviewer = #{reviewer,jdbcType=VARCHAR},",
          "reviewer_date = #{reviewerDate,jdbcType=DATE},",
          "borrow_target_dept = #{borrowTargetDept,jdbcType=VARCHAR},",
          "borrow_person = #{borrowPerson,jdbcType=VARCHAR},",
          "borrow_source_dept = #{borrowSourceDept,jdbcType=VARCHAR},",
          "equipment_status = #{equipmentStatus,jdbcType=VARCHAR},",
          "estimated_return_date = #{estimatedReturnDate,jdbcType=DATE},",
          "return_date = #{returnDate,jdbcType=DATE},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where borrow_id = #{borrowId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(EquipmentBorrow record);
}