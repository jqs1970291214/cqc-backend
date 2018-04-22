# cqc backend 
创青春微信移动网站后端
 
## instruction
- spring-boot 1.5
- jpa
- 使用lombok插件，需要在ide安装一下
- 建表语句在createtable.sql
- 后台入口/index
- session存储登录状态，避免重复登录

## 碰到的坑
- JPA自动生成的主键策略auto不稳定
- 跨域问题
- 拦截器配置问题
- session丢失（每次ajax使用的sessionid不同造成登录状态丢失）
- jar打包部署问题
- 其他
## 待完善
- 日志系统
- swagger框架
- 登录拦截器
- jpa优化
- session过期时间调整
- 未使用足够thymeleaf特性 
- git上传精简（ignore）
- 服务器端maven联动github自动部署

##### 2018/4/13
##### author: junqson mengxin

