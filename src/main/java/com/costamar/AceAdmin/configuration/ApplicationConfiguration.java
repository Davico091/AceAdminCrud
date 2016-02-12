package com.costamar.AceAdmin.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.costamar.AceAdmin")
@EnableWebMvc
@Import({DispatcherConfiguration.class,WebInitializer.class})
public class ApplicationConfiguration {

}
