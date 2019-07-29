package org.shop.configuration;

import org.shop.logging.LogByInvocationMainMethodsAOP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPLoggerConfiguration {
    @Bean
    public LogByInvocationMainMethodsAOP logByInvocationMainMethodsAOP(){
        return new LogByInvocationMainMethodsAOP();
    }
}
