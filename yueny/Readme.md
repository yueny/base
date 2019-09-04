## 内部使用 parent
<parent>
	<groupId>com.yueny.base</groupId>
	<artifactId>parent</artifactId>
	<version>1.1.1-RELEASE</version>
</parent>
	
## 外部使用 parent
<parent>
	<groupId>com.yueny.base</groupId>
	<artifactId>parento</artifactId>
	<version>1.1.1-RELEASE</version>
</parent>

## 1.0.0-SNAPSHOT/RELEASE
版本创建

## 1.1.0-SNAPSHOT/RELEASE
增加org.easymock#easymock
增加com.alibaba.rocketmq#rocketmq-srvutil
增加net.sf.ehcache#ehcache-web
升级org.quartz-scheduler#quartz 2.1.6 为 2.2.2
增加org.quartz-scheduler#quartz-jobs
修改org.springframework#spring-test[scope=test]
增加eu.bitwalker#UserAgentUtils 1.19
增加com.google.inject#guice 3.0

## 1.1.1-SNAPSHOT/RELEASE
仓库地址由ip改为域名
pom groupId由com.yueny 改为 com.yueny.base
增加 com.google.auto.service#auto-service 1.0-rc1
增加 com.squareup#javapoet 1.1.0
spring.version 由4.0.6.RELEASE升级为 4.2.5.RELEASE
增加 org.springframework#spring-jms 4.2.5.RELEASE
增加 org.apache.activemq#activemq-spring 5.8.0
增加 com.jcraft#jsch 0.1.53
增加 org.eclipse.jetty#jetty-server 9.3.6.v20151106
增加 javax.validation#validation-api 1.0.0.GA
增加 com.github.sgroschupf#zkclient 0.1
增加 com.nurkiewicz.asyncretry#asyncretry 0.0.7
升级 javax.validation#validation-api 1.0.0GA 为 1.1.0.Final
增加 com.netflix.hystrix#hystrix-core 1.3.16
增加 com.netflix.hystrix#hystrix-javanica 1.3.16
增加 com.netflix.hystrix#hystrix-metrics-event-stream 1.1.2
增加 org.apache.curator#apache-curator 3.2.0
增加 org.apache.curator#curator-recipes 3.2.0
增加 org.apache.curator#curator-framework 3.2.0
增加 org.apache.curator#curator-client 3.2.0
增加 net.sf.ezmorph#ezmorph 1.0.6
升级 mysql#mysql-connector-java 5.1.26 为 5.1.37
升级 com.alibaba#druid 1.0.14 为 1.0.16
升级 org.mybatis#mybatis 3.2.3 为 3.3.0
升级 org.mybatis#mybatis-spring 1.2.1 为 1.2.3
升级 commons-fileupload#commons-fileupload 1.3 为 1.3.1
升级 javax.servlet#javax.servlet-api 3.0.1 为 3.1.0
增加 org.jsoup#jsoup 1.8.3
增加 org.apache.shiro#shiro-core 1.2.4
增加 org.apache.shiro#shiro-web 1.2.4
增加 org.apache.shiro#shiro-spring 1.2.4
增加 net.sf.json-lib#json-lib 2.3
增加 javax.servlet.jsp#javax.servlet.jsp-api 2.3.1
增加 org.apache.lucene#lucene-core 5.3.1
增加 org.apache.lucene#lucene-analyzers-common 5.3.1
增加 org.apache.lucene#lucene-analyzers-smartcn 5.3.1
增加 org.apache.lucene#lucene-queryparser 5.3.1
增加 org.apache.lucene#lucene-highlighter 5.3.1
增加 cglib.cglib 2.2
升级 org.aspectj#aspectjrt 1.7.3 为 1.8.9
升级spring 4.2.5.RELEASE 为 4.3.3.RELEASE
升级 spring.security.version 4.0.4.RELEASE 为 4.1.3.RELEASE
升级 junit 4.11 为 4.12
升级 org.springframework.data#spring-data-redis 1.6.0.RELEASE 为 1.7.5.RELEASE
升级 freemark为2.3.23
升级 quartz为2.3.0
升级com.alibaba#druid 1.0.16 为 1.0.18
增加org.nutz#nutz 1.r.59
增加com.lmax#disruptor 3.3.6
升级com.alibaba#fastjson 1.2.4 为 1.2.8

## 1.1.2-SNAPSHOT/RELEASE
升级 maven-compiler-plugin版本3.1为3.6.1
升级 maven-deploy-plugin版本2.7为2.8.2
升级 maven-surefire-plugin版本2.17为2.20
升级 maven-jar-plugin版本2.4为3.0.2
升级 maven-assembly-plugin版本2.4为3.0.0
升级 maven-eclipse-plugin版本2.7为2.10
升级 maven-release-plugin版本2.5为2.5.3
升级 maven-javadoc-plugin版本2.9.1为2.10.4

# 1.1.3-SNAPSHOT/RELEASE
artifactId 改为  yueny-parent

# 1.1.4-SNAPSHOT/RELEASE
增加mockito.core.version
升级hibernate-validator为5.3.5.Final
增加servlet-api
增加logback.ext.spring及logback
增加spring-batch-core
增加rxjava
升级junit由4.8改为 4.12

# 1.1.5-SNAPSHOT/RELEASE
升级 spring.security.version 4.0.4.RELEASE 为 4.1.3.RELEASE
增加 commons-codec 为 1.10
增加 org.springframework#spring-aspects 为 4.3.3.RELEASE

# 1.1.6之后 见 base/Readme.md