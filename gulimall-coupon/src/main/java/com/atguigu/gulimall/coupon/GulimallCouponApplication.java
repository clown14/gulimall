package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 *
 * 1） 引入依赖
 * 2） 创建一个bootstrap.properties
 *      spring.application.name=gulimall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3)  需要给配置中心默认添加一个数据集 gulimall-coupon.properties。应用名.properti
 * 4） 给应用名.properties添加配置
 * 5） 动态获取配置
 *      @RefreshScope
 *      @Value
 *      如果配置中心和当前应用配置文件都配置了相同的项，优先使用配置中心
 *
 * 2、细节
 *  1）命名空间：用作配置隔离。（一般每个微服务一个命名空间）
 *      默认public。默认新增的配置都在public空间下
 *      开发、测试、开发可以用命名空间分割。properties每个空间有一份。
 *      在bootstrap.properties里配置（测试完去掉，学习不需要）
 *          可以选择对应的命名空间 # 写上对应环境的命名空间ID
 *          spring.cloud.nacos.config.namespace=b176a68a-6800-4648-833b-be10be8bab00
 *      也可以为每个微服务配置一个命名空间，微服务互相隔离
 *  2）配置集：一组相关或不相关配置项的集合。
 *  3）配置集ID：类似于配置文件名，即Data ID
 *  4）配置分组：默认所有的配置集都属于DEFAULT_GROUP。双十一，618，双十二
 *      更改配置分组
 *      spring.cloud.nacos.config.group=DEFAULT_GROUP
 *  最终方案：每个微服务创建自己的命名空间，然后使用配置分组区分环境（dev/test/prod）
 */

@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
