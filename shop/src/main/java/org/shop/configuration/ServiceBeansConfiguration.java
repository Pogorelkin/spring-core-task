package org.shop.configuration;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeansConfiguration {
    @Autowired
    RepositoryBeansConfigurations repositoryBeansConfigurations;


    @Bean
    public ItemService itemService() {
        return new ItemServiceImpl(repositoryBeansConfigurations.itemMapRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl(repositoryBeansConfigurations.productRepository());
    }

    @Bean
    public ProposalService proposalService() {
        return new ProposalServiceImpl(repositoryBeansConfigurations.proposalRepository());
    }

    @Bean
    public SellerService sellerService() {
        return new SellerServiceImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
