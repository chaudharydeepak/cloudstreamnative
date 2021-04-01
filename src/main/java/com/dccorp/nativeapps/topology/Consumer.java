package com.dccorp.nativeapps.topology;

import com.dccorp.nativeapps.domain.Person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class Consumer {

    @Bean
    public java.util.function.Consumer<Person> appConsumer() {
        log.info("***** initialied appConsumer *****");
        return person -> log.info("Data received from customer-1..." + person);
    }
}
