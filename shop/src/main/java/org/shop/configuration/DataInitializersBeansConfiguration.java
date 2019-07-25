package org.shop.configuration;

import org.shop.*;
import org.shop.common.Sellers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataInitializersBeansConfiguration {

    @Autowired
    ServiceBeansConfiguration serviceBeansConfiguration;


    @Bean
    public DataInitializer dataInitializer() {
        return new DataInitializer();
    }

    @Bean
    public ProductInitializer productInitializer() {
        return new ProductInitializer(serviceBeansConfiguration.productService());
    }

    @Bean
    public ProposalInitializer proposalInitializer() {
        return new ProposalInitializer();
    }

    public Map<Long, String> sellerNames() {
        Map<Long, String> sellers = new HashMap<>();
        sellers.put(1L, Sellers.AMAZON);
        sellers.put(2L, Sellers.SAMSUNG);

        return sellers;
    }


    @Bean
    public SellerInitializer sellerInitializer() {
        return new SellerInitializer(sellerNames());
    }

    @Bean
    public UserInitializer userInitializer() {
        return new UserInitializer(serviceBeansConfiguration.userService());
    }


}
