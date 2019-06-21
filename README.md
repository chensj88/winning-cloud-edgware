# winning-cloud

#### 介绍
spring cloud 组件整合使用项目

Spring Boot：1.5.21.RELEASE

Spring Cloud：Edgware.SR6

Spring Boot Admin：1.5.7


```xml
 <modules>
    <module>netflix-cloud-module</module>
    <module>winning-admin-module</module>
    <module>winning-cloud-service</module>
</modules>
```
### 模块说明

netflix-cloud-module:
 * Eureka注册中心
 * OpenFeign客户端
 * Ribbon客户端
 * Zuul网关
 
winning-admin-module：
 * Spring Admin Server：微服务监控
 * zipkin server：链路数据记录，保存在elasticsearch中
 * turbine monitor：Hystrix监控
 
winning-cloud-service
 * netflix-eureka-client 服务提供者
