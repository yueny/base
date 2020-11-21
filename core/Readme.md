## 只包含distributionManagement， pluginManagement， repositories等
<parent>
	<groupId>com.yueny.base</groupId>
	<artifactId>core</artifactId>
	<version>xxxxx</version>
</parent>

# 1.1.3 SNAPSHOT/RELEASE
artifactId 改为 base-core

# 1.1.4-SNAPSHOT/RELEASE
增加maven.eclipse.plugin.version
增加maven.codehaus.mojo.version
增加maven.codehaus.sonar.version
增加lombok-maven-plugin
增加jacoco-maven-plugin
增加maven-resources-plugin
新增maven-war-plugin

# 1.2.0-SNAPSHOT/RELEASE
自定义新的nexus服务地址

# 1.3.0-SNAPSHOT/RELEASE
增加新的 profile 分支，本地为 nexus， 远程仓库为 sonatype-oss-nexus



