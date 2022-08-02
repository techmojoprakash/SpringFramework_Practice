package com.spring_ioc.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MobileConfig {

    // one plus
    @Bean
    Mobile getOneplusMobile() {
        return new Oneplus();
    }

    // samsung
    @Bean(name = "samsung")
    Mobile getSamsungMobile() {
        return new Samsung();
    }

}
