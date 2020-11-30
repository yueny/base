# BASE
================
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
<a href="">
  <img alt="Coverity Scan Build Status" src="https://img.shields.io/coverity/scan/8244.svg"/>
</a>


所有项目和基础组件的依赖包。

包含
* **base-core**
   * 管理maven、仓库等信息， 独立依赖.
   
   [![base-core](https://file-vague.codealy.com/code/yueny/base/base-core.jpg)]()
   
   * 版本发布历史
     + <version>1.1.5-RELEASE</version> 最新稳定版
     + 1.1.6-SNAPSHOT/RELEASE
       - 增加 scm 插件
       - 增加 scm 配置
       - 变更最新的maven仓库地址
       
* **yueny-parent**
   * 继承了 base-core;
   * 依赖 base-core
   * 管理第三方插件的版本信息;
   
   [![yueny-parent](https://file-vague.codealy.com/code/yueny/base/yueny-parent.jpg)]()
   
   * 版本发布历史
        + <version>1.1.5-RELEASE</version> 最新稳定版
        + <version>1.1.6-SNAPSHOT/RELEASE</version> 
          - 升级 com.alibaba#fastjson 由 1.1.31 改为 1.2.58 [https://blog.csdn.net/yaofeiNO1/article/details/76377080?utm_source=blogxgwz8]
          - 升级 logback 由 1.1.11 改为 1.2.3 [https://jira.qos.ch/browse/LOGBACK-1378]
          - 升级 com.fasterxml.jackson.core#* 由 2.7.5 改为 2.9.5
          - 升级 logback.ext.spring 由 0.1.1 改为 0.1.4
          - 升级 slf4j 由 1.7.5 改为 1.7.25
          - 升级 com.google.guava 由15.0 改为 27.0.1-jre
          - 升级 lombok 由 1.16.8 改为 1.16.16
          - 升级 apache.commons.lang3由3.3.2改为 3.9
          - 升级 spring.redis.version由 1.7.5.RELEASE 为 1.7.11.RELEASE
          - 升级 org.freemarker由 2.3.23为 2.3.28
          - base-core 升级为 1.1.6-SNAPSHOT
          - 升级 alibaba.druid 由 1.0.13 为 1.1.16
          - 升级 mysql-connector-java 由 5.1.37 为 8.0.11
          - 增加 javax.persistence-api 2.2.
                「注意:与persistence-api不兼容，必须二选一」
                「注意:javax.persistence-api 新版本， persistence-api老版本」
          - 变更最新的maven仓库地址
        			
* **boot-parent**
   * 继承了 spring-boot-starter-parent 1.5.3.RELEASE
   * 不依赖 base-core
   * 管理第三方插件的版本信息;
   
   [![boot-parent](https://file-vague.codealy.com/code/yueny/base/boot-parent.jpg)]()

   * 版本发布历史
        + <version>1.1.5-RELEASE</version> 最新稳定版



# 同步历史
20190703 V1.1.5 已同步