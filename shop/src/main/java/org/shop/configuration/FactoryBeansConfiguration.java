package org.shop.configuration;

import org.shop.repository.UserRepository;
import org.shop.repository.factory.UserRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeansConfiguration {
    @Bean
    public UserRepositoryFactory userRepository(){
        return new UserRepositoryFactory();
    }
}
