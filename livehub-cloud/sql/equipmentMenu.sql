-- 菜单 SQL
INSERT INTO sys_menu (menu_name, parent_id, order_num, url, target, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('设备管理', '0', '1', '#', 'menuItem', 'M', '0', '', 'fa fa-cogs', 'admin', '2019-11-21 15:45:14', 'admin', '2019-11-21 15:46:43', '');

-- 按钮父菜单ID
SELECT @pid := LAST_INSERT_ID();

insert into sys_menu (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备信息', @pid, '1', '/system/equipment', 'C', '0', 'system:equipment:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '设备信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备信息查询', @parentId, '1',  '#',  'F', '0', 'system:equipment:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备信息新增', @parentId, '2',  '#',  'F', '0', 'system:equipment:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备信息修改', @parentId, '3',  '#',  'F', '0', 'system:equipment:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备信息删除', @parentId, '4',  '#',  'F', '0', 'system:equipment:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url,menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('设备信息导出', @parentId, '5',  '#',  'F', '0', 'system:equipment:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
