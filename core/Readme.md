## 只包含distributionManagement， pluginManagement， repositories等
```
<parent>
	<groupId>com.whosly</groupId>
	<artifactId>base-core</artifactId>
	<version>xxxxx</version>
</parent>
```

##  版本发布历史

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
   
+ 1.4.0-SNAPSHOT
   - profile nexus remove maven-javadoc-plugin plugin
   