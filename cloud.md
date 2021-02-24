注意：
1、dependencyManagement和dependencies
(1)dependencyManagement只用在父pom文件中
(2)dependencyManagement只声明依赖，并不实现引入，子项目需要显示的声明需要用的依赖
(3)如果不在子项目中声明依赖，是不会从父项目中继承下来的；只有在子项目中写了该依赖项，并且么有指定具体版本，
才会从父项目中继承该项，并且version和scope都读取自父pom
（4）如果子项目中指定了版本号，会使用子项目中的版本号
2、微服务模块
    1、建module
    2、改pom
    3、写yml
    4、主启动 :PaymentMain8001.class
    5、业务类：
        （1）建表sql
        （2）entities：实体类，Json封装体CommonResult
        （3）dao
        （4）service
        （5）contoller
3、代码构建
    1、约定》配置》编码
    2：步骤：
        （1）new project
        （2）聚合总父工程名字
        （3）maven选版本
        （4）工程名字
        （5）字符编码 file encodings：utf-8
        （6）注解生效激活  Preferences | Build, Execution, Deployment | Compiler | Annotation Processors
        （7）Java编译版本选8 Preferences | Build, Execution, Deployment | Compiler | Java Compiler
        （8）File Type过滤 Preferences | Editor | File Types
1、业务类
（1）建表sql
（2）entities：实体类，Json封装体CommonResult(前端看是否是404等情况)
（3）dao（与数据库交互，mapper）
（4）service
（5）contoller
2、热部署
（1）添加热部署依赖。devtools
（2）在父pom中添加一个plugin：spring-boot-maven-plugin
(3)开启自动编译：Preferences | Build, Execution, Deployment | Compiler-》ADBC通通打勾
（4）commonf+shift+alt+/ ->registry->compiler.automake.allow.when.app.running
->actionSystem.assertFocusAccessFromEdt
这两个打上勾勾
（5）重启idea

2、RestTemplate提供了多种便捷访问远程Http服务的方法
是一种简单便捷的访问restful服务模版类，是Spring提供的用于访问Rest服务的客户端模版工具集

3、工程重构cloud-api-commons
(1)新建module-》cloud-api-commons
(2)pom修改
(3)entities实体类
(4)maven命令-》clean-》install
(5)module80和8001分别改造：去掉实体类，pom中引入
        <dependency><!--引入自己定义的api通用包，可以使用Payment支付Entity-->
        <groupId>com.itcc.springcloud</groupId>
        <artifactId>cloud-api-commons</artifactId>
        <version>${project.version}</version>
        </dependency>


















