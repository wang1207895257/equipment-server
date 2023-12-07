package com.equipment.model.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.equipment.model.mapper.EquipmentBorrowMapper;
import com.equipment.model.po.EquipmentBorrow;
import com.equipment.model.service.IEquipmentBorrowService;
import org.springframework.stereotype.Service;

/**
 * @author wangzf-c
 * @date 2023/12/6
 */
@Service
public class EquipmentBorrowServiceImpl extends ServiceImpl<EquipmentBorrowMapper, EquipmentBorrow> implements IEquipmentBorrowService {
}
