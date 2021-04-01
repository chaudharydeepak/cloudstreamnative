package com.dccorp.nativeapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@TypeHint(types = org.springframework.cloud.stream.annotation.EnableBinding.class, access = AccessBits.FULL_REFLECTION)
public class NativeCloudStreamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeCloudStreamsApplication.class, args);
    }
}
