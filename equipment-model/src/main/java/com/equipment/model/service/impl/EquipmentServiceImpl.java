package com.equipment.model.service.impl;

import com.equipment.model.mapper.EquipmentMapper;
import com.equipment.model.po.Equipment;
import com.equipment.model.service.IEquipmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author wangzf-c
 * @date 2023/12/6
 */
@Service
public class EquipmentServiceImpl extends ServiceImpl<EquipmentMapper, Equipment> implements IEquipmentService {
}
