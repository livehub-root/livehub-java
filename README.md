## LiveHub

## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 在线体验
- lmaster.top:8080
- admin/admin123

## Run

```shell script
# 简单运行
java -Dlogback.configurationFile=/home/java/logback.xml  -jar livehub-admin.jar
# 后台运行并挂起 因为有日志，所以输出到黑洞
nohup java -Dlogback.configurationFile=/home/java/logback.xml  -jar livehub-admin.jar >/dev/null &
```
## 更新
2020-01-14
- 添加 jwt ，为设备登录提供支持
- 设备登录接口

2020-01-10
- 更新 Cloud 下 Height 、Weight
- 数据库 equipment 表更新，前台页面更新

2020-01-09
- 重写 Cloud 下的实例，采用 lombok 技术
- 修改 equipment 的 fields

2020-01-07
- [Alibaba Java Code Guidelines](https://github.com/alibaba/p3c) 代码规范化
- [CVE-2018-18531](https://github.com/advisories/GHSA-8q89-pwhh-7wfq) 安全漏洞，库更新过



