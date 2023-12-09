package com.equipment.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * equipment_classify_count
 */
@Getter
@Setter
@TableName("equipment_classify_count")
public class EquipmentClassifyCount {
    /**
     * 分类id
     */
    private String classifyId;

    /**
     * 分类编号
     */
    private String classifyCode;

    /**
     * 分类名称
     */
    private String classifyName;

    /**
     * 新增数量
     */
    private Integer newCount;

    /**
     * 调入数量
     */
    private Integer callInCount;

    /**
     * 调出数量
     */
    private Integer callOutCount;

    /**
     * 租出数量
     */
    private Integer leasedCount;

    /**
     * 收回数量
     */
    private Integer recoveredCount;

    /**
     * 故障数量
     */
    private Integer breakdownCount;

    /**
     * 销账数量
     */
    private Integer writtenOffCount;

    /**
     * 备注
     */
    private String remark;
}