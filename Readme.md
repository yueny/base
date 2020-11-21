# BASE

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
<a href="">
  <img alt="Coverity Scan Build Status" src="https://img.shields.io/coverity/scan/8244.svg"/>
</a>


所有项目和基础组件的依赖包。
包含base-core、yueny-parent

[![依赖图](https://github.com/yueny/base/blob/1.3.0/base_依赖图.png)]()

## **base-core**
   > 管理maven、仓库等信息， 独立依赖.
  
   [![tree/master/core](https://file-vague.codealy.com/code/yueny/base/base-core.jpg)]()
   
###  版本发布历史
   + 1.1.3 SNAPSHOT/RELEASE
      - artifactId 改为 base-core
   + 1.1.4-SNAPSHOT/RELEASE
      - 增加maven.eclipse.plugin.version
      - 增加maven.codehaus.mojo.version
      - 增加maven.codehaus.sonar.version
      - 增加lombok-maven-plugin
      - 增加jacoco-maven-plugin
      - 增加maven-resources-plugin
      - 新增maven-war-plugin
   + 1.1.6-SNAPSHOT/RELEASE
      - 增加 scm 插件
      - 增加 scm 配置
      - 变更最新的maven仓库地址
   + 1.2.0-SNAPSHOT/RELEASE
      - 自定义新的nexus服务地址
   + 1.3.0-RELEASE
      - 增加新的 profile 分支，本地为 nexus， 远程仓库为 sonatype-oss-nexus
      
   更多见 <core> 子目录
  
## **yueny-parent**
   > 依赖 base-core; 
   > 管理第三方插件的版本信息;
   
   [![yueny](https://file-vague.codealy.com/code/yueny/base/yueny-parent.jpg)]()
   
   
### 版本发布历史
 + 1.0.0-SNAPSHOT/RELEASE
    - 版本创建
 + 1.1.0-SNAPSHOT/RELEASE
    - 增加org.easymock#easymock
    - 增加com.alibaba.rocketmq#rocketmq-srvutil
    - 增加net.sf.ehcache#ehcache-web
    - 升级org.quartz-scheduler#quartz 2.1.6 为 2.2.2
    - 增加org.quartz-scheduler#quartz-jobs
    - 修改org.springframework#spring-test[scope=test]
    - 增加eu.bitwalker#UserAgentUtils 1.19
    - 增加com.google.inject#guice 3.0
        
 + 1.1.1-SNAPSHOT/RELEASE
    - 仓库地址由ip改为域名
    - pom groupId由com.yueny 改为 com.yueny.base
    - 增加 com.google.auto.service#auto-service 1.0-rc1
    - 增加 com.squareup#javapoet 1.1.0
    - spring.version 由4.0.6.RELEASE升级为 4.2.5.RELEASE
    - 增加 org.springframework#spring-jms 4.2.5.RELEASE
    - 增加 org.apache.activemq#activemq-spring 5.8.0
    - 增加 com.jcraft#jsch 0.1.53
    - 增加 org.eclipse.jetty#jetty-server 9.3.6.v20151106
    - 增加 javax.validation#validation-api 1.0.0.GA
    
   更多见 <yueny> 子目录
  			
## **boot-parent**
   * 继承了 spring-boot-starter-parent 1.5.3.RELEASE
   * 不依赖 base-core
   * 管理第三方插件的版本信息;
   
   [![boot](https://file-vague.codealy.com/code/yueny/base/boot-parent.jpg)]()
   

   更多见 <boot> 子目录