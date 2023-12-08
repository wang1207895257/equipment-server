package com.equipment.controller;

import com.equipment.model.dto.EquipmentDTO;
import com.equipment.model.dto.PageDTO;
import com.equipment.model.po.Equipment;
import com.equipment.model.service.IEquipmentService;
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
@Api(value = "设备仪器管理", tags = {"设备仪器管理"})
@RestController
@RequestMapping("equipment")
@Slf4j
public class EquipmentController {

    @Autowired
    private IEquipmentService equipmentService;

    @PostMapping("getEquipmentList")
    public List<Equipment> getEquipmentList(@RequestBody PageDTO dto) {
        return equipmentService.lambdaQuery()
                .like(StringUtils.isNotBlank(dto.getKeyWord()),Equipment::getEquipmentName,dto.getKeyWord())
                .list();
    }

    @GetMapping("getEquipment")
    public Equipment getEquipment(@RequestParam("equipmentId") String equipmentId) {
        return equipmentService.getById(equipmentId);
    }

    @PostMapping("saveOrUpdateEquipment")
    public Boolean saveOrUpdateEquipment(@RequestBody EquipmentDTO dto) {
        Equipment equipment = new Equipment();
        BeanUtils.copyProperties(dto, equipment);
        return equipmentService.updateById(equipment);
    }

    @GetMapping("delEquipment")
    public Boolean delEquipment(@RequestParam("equipmentId") String equipmentId) {
        return equipmentService.removeById(equipmentId);
    }
}
