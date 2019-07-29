package org.shop.configuration;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.shop.common.Sellers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataInitializersBeansConfiguration {
    @Bean
    public DataInitializer dataInitializer() {
        return new DataInitializer();
    }

    @Bean
    public ProductInitializer productInitializer(ProductService productService) {
        return new ProductInitializer(productService);
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
    public UserInitializer userInitializer(UserService userService) {
        return new UserInitializer(userService);
    }


}
