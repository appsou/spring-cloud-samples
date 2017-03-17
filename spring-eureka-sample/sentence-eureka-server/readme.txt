Spring Cloud Eureka 模块提供的功能是被动式的服务发现.

服务发现就像聊天室一个,每个用户来的时候去服务器上注册,这样他的好友们就能看到你,你同时也将获取好友的上线列表.
在微服务中,服务就相当于聊天室的用户,而服务注册中心就像聊天室服务器一样,目前服务发现的解决方案有Eureka,Consul,Etcd,Zookeeper,SmartStack,等等

Eureka Client通过HTTP(或者TCP,UDP)去Eureka Server注册和获取服务列表,为了高可用一般会有多个Eureka Server组成集群.Eureka会移除那些心跳检查未到达的服务.