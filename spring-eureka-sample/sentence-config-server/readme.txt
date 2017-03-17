一个Application中不只是代码,还需要连接资源和其它应用,经常有很多需要外部设置的项去调整Application行为,
如切换不同的数据库,i18n国际化 等.应用中的会经常见到的xml,properties,yml等就是配置信息.

常见的实现信息配置的方法:

硬编码(缺点:需要修改代码,风险大)
放在xml等配置文件中,和应用一起打包(缺点:需要重新打包和重启)
文件系统中(缺点:依赖操作系统等)
环境变量(缺点:有大量的配置需要人工设置到环境变量中,不便于管理,且依赖平台)
云端存储(缺点:与其他应用耦合)Spring Cloud Config 就是云端存储配置信息的,它具有中心化,版本控制,支持动态更新,平台独立,语言独立等特性.

创建一个Config Server步骤:
1.创建应用,并添加spring-boot-starter-parent,spring-cloud-config-server等依赖
2.创建class,添加@EnableConfigServer,@SpringBootApplication注解
3.在git上创建配置文件
4.工程配置文件application.yml
  配置spring.cloud.config.server.git.uri为"https://github.com/"YOUR-GITHUB-ID"/"YOUR-REPOSITORY-NAME""
  并设置端口server.port为8080