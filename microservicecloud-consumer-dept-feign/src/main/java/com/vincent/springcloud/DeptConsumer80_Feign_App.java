package com.vincent.springcloud;

import com.vincent.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/12/12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.vincent.springcloud"})
@ComponentScan("com.vincent.springcloud")
public class DeptConsumer80_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
