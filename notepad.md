#spring boot 项目笔记

##1.构建

###1.1 使用flyway插件
pom.xm导入plugin

在resources 目录下创建db.migration.xxx.sql

运行mvn flyway:migrate 执行脚本

###1.2 使用mybatis generator 插件
pom.xml导入plugin

在resources目录下创建generator文件

执行mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate自动生成持久层代码及文件

###1.3 导入thymeleaf模板引擎
导入后自动添加一个默认的viewResolver classpath:templates/

配置静态资源不拦截

[配置热部署](https://www.cnblogs.com/aligege/p/9195544.html)

###1.4 application.properties配置
配置项目名

配置端口号

配置数据库信息
