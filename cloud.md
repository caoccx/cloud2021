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
    4、主启动
    5、业务类
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


















