package org.shop.configuration;


import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("initialSequence.properties")
public class RepositoryBeansConfigurations {
    @Bean
    public UserRepositoryFactory userRepository() {
        return new UserRepositoryFactory();
    }

    @Bean
    public ItemRepository itemMapRepository() {
        return new ItemMapRepository();
    }

    @Bean
    public OrderRepository orderRepository(@Value("${initialSequence}") long initialSequence) {
        OrderRepository orderRepository = new OrderMapRepository();
        orderRepository.setSequence(initialSequence);

        return orderRepository;
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerRepository() {
        return new SellerMapRepository();
    }
}
