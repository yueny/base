# BASE

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
<a href="">
  <img alt="Coverity Scan Build Status" src="https://img.shields.io/coverity/scan/8244.svg"/>
</a>


所有项目和基础组件的依赖包。
包含base-core、yueny-parent

## **base-core**
   > 管理maven、仓库等信息， 独立依赖.
  
   [![core](https://file-vague.codealy.com/code/yueny/base/base-core.jpg)]()
   
  
## **yueny-parent**
   > 依赖 base-core; 
   > 管理第三方插件的版本信息;
   
   [![yueny](https://file-vague.codealy.com/code/yueny/base/yueny-parent.jpg)]()
   
  			
## **boot-parent**
   * 继承了 spring-boot-starter-parent 1.5.3.RELEASE
   * 不依赖 base-core
   * 管理第三方插件的版本信息;
   
   [![boot](https://file-vague.codealy.com/code/yueny/base/boot-parent.jpg)]()

 