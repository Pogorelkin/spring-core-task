package org.shop;


import org.shop.api.ProductService;
import org.shop.api.ProposalService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.shop.api.impl.RandomIntService;
import org.shop.configuration.MainAppConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    private static Logger logger = LoggerFactory.getLogger(ShopLauncher.class);

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        //TODO: implement using Spring Framework ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(MainAppConfiguration.class);
        DataInitializer dataInitializer = context.getBean(DataInitializer.class);
        dataInitializer.initData();

        UserService userService = context.getBean(UserService.class);
        SellerService sellerService = context.getBean(SellerService.class);
        ProductService productService = context.getBean(ProductService.class);
        ProposalService proposalService = context.getBean(ProposalService.class);
        RandomIntService randomIntService = context.getBean(RandomIntService.class);

        logger.info(" UserList\n" + userService.getUsers().toString());
        logger.info(" SellersList\n" + sellerService.getSellers().toString());
        logger.info(" ProductsList\n" + productService.getProducts().toString());
        logger.info(" Proposals by sellerId 1\n" + proposalService.getProposalsBySellerId(1L).toString());
        logger.info(" Proposals by sellerId 2\n" + proposalService.getProposalsBySellerId(2L).toString());
        randomIntService.printInjectedWithAnnotationInteger();


    }
}
