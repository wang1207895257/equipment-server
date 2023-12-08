package com.equipment.controller;

import com.equipment.model.dto.EquipmentRecordDTO;
import com.equipment.model.dto.EquipmentRecordListDTO;
import com.equipment.model.po.EquipmentRecord;
import com.equipment.model.service.IEquipmentRecordService;
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
@Api(value = "设备仪器台账管理", tags = {"设备仪器台账管理"})
@RestController
@RequestMapping("equipment/record")
@Slf4j
public class EquipmentRecordController {

    @Autowired
    private IEquipmentRecordService equipmentRecordService;

    @PostMapping("getEquipmentRecordList")
    public List<EquipmentRecord> getEquipmentRecordList(@RequestBody EquipmentRecordListDTO dto) {
        return equipmentRecordService.lambdaQuery()
                .eq(EquipmentRecord::getEquipmentCode, dto.getEquipmentCode())
                .like(StringUtils.isNotBlank(dto.getKeyWord()),EquipmentRecord::getEquipmentName,dto.getKeyWord())
                .list();
    }

    @GetMapping("getEquipmentRecord")
    public EquipmentRecord getEquipment(@RequestParam("equipmentRecordId") String equipmentRecordId) {
        return equipmentRecordService.getById(equipmentRecordId);
    }

    @PostMapping("saveOrUpdateEquipmentRecord")
    public Boolean saveOrUpdateEquipment(@RequestBody EquipmentRecordDTO dto) {
        EquipmentRecord info = new EquipmentRecord();
        BeanUtils.copyProperties(dto, info);
        return equipmentRecordService.updateById(info);
    }

    @GetMapping("delEquipmentRecord")
    public Boolean delEquipmentRecord(@RequestParam("equipmentRecordId") String equipmentRecordId) {
        return equipmentRecordService.removeById(equipmentRecordId);
    }
}
