package com.excoding.module.common.service;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@DubboService(version = "1.0.0")
@Component
public class BaseProviderService<String> implements BaseService<String>{


    @Value("${dubbo.application.name}")
    private String value;

    @Override
    public String doSomeThing(String value) {
        this.value = value;
        return this.value;
    }
}
