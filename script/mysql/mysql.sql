DROP TABLE IF EXISTS `equipment`;
create table equipment (
    equipment_id varchar(32) not null comment '设备id',
    equipment_code varchar(32) not null comment '设备编号',
    equipment_name varchar(32) not null comment '设备名称',
    classify_code varchar(32) not null comment '分类编号',
    classify_name varchar(32) not null comment '分类名称',
    remark varchar(100) not null comment '备注',
    PRIMARY KEY (`equipment_id`)
) comment '设备仪器表';

DROP TABLE IF EXISTS `equipment_record`;
create table equipment_record (
    record_id varchar(32) not null comment '台账id',
    record_code varchar(32) not null comment '台账编号',
    record_name varchar(32) not null comment '台账名称',
    equipment_code varchar(32) not null comment '设备编号',
    equipment_name varchar(32) not null comment '设备名称',
    classify_code varchar(32) not null comment '分类编号',
    classify_name varchar(32) not null comment '分类名称',
    product_date date not null comment '生产日期',
    acquisition_date date not null comment '购置日期',
    product_company varchar(32) not null comment '供应厂商',
    maintenance_company varchar(32) not null comment '维修厂商',
    equipment_status varchar(13) not null comment '设备状态',
    person_charge varchar(32) not null comment '负责人',
    storage_place varchar(32) not null comment '存放位置',
    remark varchar(100) not null comment '备注',
    PRIMARY KEY (`record_id`)
) comment '设备台账表';


DROP TABLE IF EXISTS `equipment_borrow`;
create table equipment_borrow (
    borrow_id varchar(32) not null comment '主键id',
    borrow_code varchar(32) not null comment '借用编号',
    record_code varchar(32) not null comment '设备台账编号',
    borrow_date date not null comment '设备借用日期',
    reviewer varchar(32) not null comment '审核人',
    reviewer_date date not null comment '审核日期',
    borrow_target_dept varchar(32) not null comment '借用部门',
    borrow_person varchar(32) not null comment '借用人',
    borrow_source_dept varchar(32) not null comment '借出部门',
    equipment_status varchar(13) not null comment '设备状态',
    estimated_return_date date not null comment '预计归还日期',
    return_date date not null comment '归还日期',
    remark varchar(100) not null comment '备注',
    PRIMARY KEY (`borrow_id`)
) comment '设备借用表';

drop table if exists equipment_breakdown;
create table equipment_breakdown (
    breakdown_id varchar(32) not null comment '主键id',
    breakdown_code varchar(32) not null comment '单据编号',
    record_code varchar(32) not null comment '台账编号',
    breakdown_reason varchar(100) not null comment '设备故障原因',
    maintain_unit varchar(32) not null comment '维修单位',
    reviewer varchar(32) not null comment '审核人',
    reviewer_date date not null comment '审核日期',
    send_maintain_person varchar(32) not null comment '送修人',
    maintain_end_date date default null comment '维修完成日期',
    remark varchar(100) not null comment '备注',
    PRIMARY KEY (`breakdown_id`)
) comment '设备故障维修表';


drop table if exists equipment_classify_count;
create table equipment_classify_count (
    classify_id varchar(32) not null comment '分类id',
    classify_code varchar(32) not null comment '分类编号',
    classify_name varchar(32) not null comment '分类名称',
    new_count int not null default 0 comment '新增数量',
    call_in_count int not null default 0 comment '调入数量',
    call_out_count int not null default 0 comment '调出数量',
    leased_count int not null default 0 comment '租出数量',
    recovered_count int not null default 0 comment '收回数量',
    breakdown_count int not null default 0 comment '故障数量',
    written_off_count int not null default 0 comment '销账数量',
    remark varchar(100) not null comment '备注',
    PRIMARY KEY (`classify_id`)
) comment '设备分类综合统计表';