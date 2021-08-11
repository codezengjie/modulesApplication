package com.excoding.module.provider;

import com.excoding.module.common.service.BaseService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class DubboAutoConfigurationConsumerBootstrap {

    @DubboReference(version = "1.0.0")
    private BaseService<String> baseService;

    public static void main(String[] args) {
        SpringApplication.run(DubboAutoConfigurationConsumerBootstrap.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            System.out.println(baseService.doSomeThing("mercyblitz"));
        };
    }
}
