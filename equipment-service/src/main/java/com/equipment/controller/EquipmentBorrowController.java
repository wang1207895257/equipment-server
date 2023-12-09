package com.equipment.controller;

import com.equipment.model.dto.BorrowListDTO;
import com.equipment.model.dto.EquipmentBorrowDTO;
import com.equipment.model.po.EquipmentBorrow;
import com.equipment.model.service.IEquipmentBorrowService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangzf-c
 * @date 2023/12/7
 */
@Api(value = "设备仪器租借管理", tags = {"设备仪器租借管理"})
@RestController
@RequestMapping("equipment/borrow")
@Slf4j
public class EquipmentBorrowController {

    @Autowired
    private IEquipmentBorrowService equipmentBorrowService;

    // 根据用户信息和台账编号查询租借列表
    @PostMapping("getEquipmentBorrowList")
    public List<EquipmentBorrow> getEquipmentRecordList(@RequestBody BorrowListDTO dto) {
        return equipmentBorrowService.lambdaQuery()
                .eq(EquipmentBorrow::getRecordCode, dto.getRecordCode())
                .eq(EquipmentBorrow::getBorrowPerson, dto.getUserCode())
                .like(StringUtils.isNotBlank(dto.getKeyWord()), EquipmentBorrow::getBorrowCode, dto.getKeyWord())
                .list();
    }

    // 获取租借信息详情
    @GetMapping("getEquipmentBorrow")
    public EquipmentBorrow getEquipmentBorrow(@RequestParam("borrowId") String borrowId) {
        return equipmentBorrowService.getById(borrowId);
    }

    @PostMapping("saveOrUpdateEquipmentBorrow")
    public Boolean saveOrUpdateEquipment(@RequestBody EquipmentBorrowDTO dto) {
        EquipmentBorrow equipment = new EquipmentBorrow();
        BeanUtils.copyProperties(dto, equipment);
        return equipmentBorrowService.updateById(equipment);
    }

    @GetMapping("delEquipment")
    public Boolean delEquipment(@RequestParam("equipmentId") String equipmentId) {
        return equipmentBorrowService.removeById(equipmentId);
    }
}
