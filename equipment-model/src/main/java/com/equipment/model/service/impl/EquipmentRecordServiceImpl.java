package com.equipment.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.equipment.model.mapper.EquipmentRecordMapper;
import com.equipment.model.po.EquipmentRecord;
import com.equipment.model.service.IEquipmentRecordService;
import org.springframework.stereotype.Service;

/**
 * @author wangzf-c
 * @date 2023/12/6
 */
@Service
public class EquipmentRecordServiceImpl extends ServiceImpl<EquipmentRecordMapper, EquipmentRecord> implements IEquipmentRecordService {
}
