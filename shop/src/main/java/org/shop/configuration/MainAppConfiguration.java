package org.shop.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DataInitializersBeansConfiguration.class, FactoryBeansConfiguration.class, RepositoryBeansConfigurations.class, ServiceBeansConfiguration.class})
public class MainAppConfiguration  {

}


