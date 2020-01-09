DROP TABLE IF EXISTS lh_task;
CREATE TABLE `lh_task` (
  `task_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='任务信息表';

DROP TABLE IF EXISTS lh_equipment;
CREATE TABLE `lh_equipment` (
  `equipment_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '设备ID',
  `equipment_no` varchar(100) DEFAULT '' COMMENT '设备编号',
  `registration_ode` varchar(100) DEFAULT '' COMMENT '注册码',
  `token` varchar(100) DEFAULT '' COMMENT 'token',
  `location` varchar(100) DEFAULT '' COMMENT '地理位置',
  `device_name` varchar(100) DEFAULT '' COMMENT '设备名称',
  `device_type` varchar(100) DEFAULT '' COMMENT '设备类型',
  `vender_id` varchar(100) DEFAULT '' COMMENT '供应商ID',
  `vender_name` varchar(100) DEFAULT '' COMMENT '供应商名称',
  `model_number` varchar(100) DEFAULT '' COMMENT '设备型号',
  `firmware_version` varchar(100) DEFAULT '' COMMENT '固件版本',
  `firmware_date` datetime DEFAULT NULL COMMENT '固件更新日期',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`equipment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='设备信息表';

-- tdengine 表，这里是虚拟表
DROP TABLE IF EXISTS lhc_height;
CREATE TABLE `lhc_height` (
  `ts` timestamp NOT NULL  COMMENT '时间',
  `oid` varchar(24) DEFAULT '' COMMENT '对象编号',
  `height` smallint DEFAULT 0 COMMENT '高度',
  `did` bigint DEFAULT 0 COMMENT '设备编号',
  PRIMARY KEY (`ts`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='高度信息表';

DROP TABLE IF EXISTS lhc_weight;
CREATE TABLE `lhc_weight` (
  `ts` timestamp NOT NULL  COMMENT '时间',
  `oid` varchar(24) DEFAULT '' COMMENT '对象编号',
  `weight` int DEFAULT 0 COMMENT '体重',
  `did` bigint DEFAULT 0 COMMENT '设备编号',
  PRIMARY KEY (`ts`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体重信息表';
