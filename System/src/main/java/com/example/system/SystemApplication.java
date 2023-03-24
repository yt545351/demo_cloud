package com.example.system;

import com.example.system.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 系统应用程序
 *
 * @author laughlook
 * @date 2022/07/21
 */
@SpringBootApplication
//@EnableEurekaClient
@Slf4j
@EnableFeignClients
@EnableSwagger2
@EnableScheduling
@EnableAsync
public class SystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        log.info("-----------------System启动-----------------");
    }

    @Autowired
    private TestService testService;

    @Override
    public void run(String... args) throws Exception {
//        testService.testNum(1000);
    }
}
