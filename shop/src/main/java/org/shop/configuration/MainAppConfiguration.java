package org.shop.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataInitializersBeansConfiguration.class, RepositoryBeansConfiguration.class, ServiceBeansConfiguration.class, CustomBeansPostProcessorConfiguration.class})
public class MainAppConfiguration  {

}


