package com.dccorp.nativeapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
//@TypeHint(types = org.springframework.integration.config.IntegrationConfigurationBeanFactoryPostProcessor.class, access = AccessBits.FULL_REFLECTION)
public class NativeCloudStreamsApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeCloudStreamsApplication.class, args);
    }
}
