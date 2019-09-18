package com.example.springbootexamplebegin.config;

import com.example.springbootexamplebegin.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhouzhaoping
 * @description:
 * @date: 2019-09-18
 */

/**
 *  @Configuration: 指明当前类是一个配置类，替代之前的Spring配置文件
 */
@Configuration
public class MyAppConfig {

    // 将方法返回的对象添加到Spring容器中，方法名就是这个组件的id
    // <bean id="helloService" class=".."></bean>
    @Bean
    public HelloService helloService() {
        System.out.println("将组件helloService添加到Spring容器中.");
        return new HelloService();
    }

}
