package org.shop.configuration;

import org.shop.annotations.annotationsHandlers.InjectRandomIntAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

public class CustomBeansPostProcessorConfiguration {
    @Bean
    public BeanPostProcessor injectRandomIntAnnotationBeanPostProcessor(){
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }
}
