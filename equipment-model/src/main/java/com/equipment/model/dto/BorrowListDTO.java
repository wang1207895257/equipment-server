package com.equipment.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * equipment_record
 */
@Data
public class BorrowListDTO extends PageDTO {

    // 台账编号
    private String recordCode;

    // 发起租借人员编号
    private String userCode;
}