package org.shop.configuration;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceBeansConfiguration.class)
public class DataInitializersBeansConfiguration {

    @Bean
    public DataInitializer dataInitializer(){
        return new DataInitializer();
    }

    @Bean
    public ProductInitializer productInitializer(ProductService productService){
        return new ProductInitializer(productService);
    }

    @Bean
    public ProposalInitializer proposalInitializer(){
        return new ProposalInitializer();
    }

    @Bean
    public SellerInitializer sellerInitializer(){
        return new SellerInitializer();
    }

    @Bean
    public UserInitializer userInitializer(UserService userService){
        return new UserInitializer(userService);
    }



}
