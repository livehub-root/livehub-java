-- 菜单 SQL
INSERT INTO sys_menu (menu_name, parent_id, order_num, url, target, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('任务管理', '0', '1', '#', 'menuItem', 'M', '0', '', 'fa fa-tasks', 'admin', '2019-11-21 15:41:11', 'admin', '2019-11-21 15:41:37', '');

-- 按钮父菜单ID
SELECT @pid := LAST_INSERT_ID();

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务列表', @pid, '1', '/system/task', 'C', '0', 'system:task:view', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '任务列表菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务列表查询', @parentId, '1',  '#',  'F', '0', 'system:task:list',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务列表新增', @parentId, '2',  '#',  'F', '0', 'system:task:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务列表修改', @parentId, '3',  '#',  'F', '0', 'system:task:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务列表删除', @parentId, '4',  '#',  'F', '0', 'system:task:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务列表导出', @parentId, '5',  '#',  'F', '0', 'system:task:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
