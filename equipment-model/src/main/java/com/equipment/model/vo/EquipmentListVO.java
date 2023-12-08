package com.equipment.model.vo;

import com.equipment.model.po.Equipment;
import lombok.Data;

import java.util.List;

/**
 * @author wangzf-c
 * @date 2023/12/7
 */
@Data
public class EquipmentListVO {

    private int page = 1;

    private int total = 1;

    private List<Equipment> equipments;
}
