package com.costamar.AceAdmin.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class DispatcherConfiguration extends WebMvcConfigurerAdapter {
	
	public void addResourceHandlers (ResourceHandlerRegistry registry){
		registry.addResourceHandler("/assets/js/**").addResourceLocations("/assets/js/");
		registry.addResourceHandler("/assets/css/**").addResourceLocations("/assets/css/");
		registry.addResourceHandler("/assets/avatars/**").addResourceLocations("/assets/avatars/");
		registry.addResourceHandler("/assets/fonts/**").addResourceLocations("/assets/fonts/");
		registry.addResourceHandler("/assets/font-awesome/**").addResourceLocations("/assets/font-awesome/");
		registry.addResourceHandler("/assets/images/**").addResourceLocations("/assets/images/");
		registry.addResourceHandler("/assets/img/**").addResourceLocations("/assets/img/");
		registry.addResourceHandler("/assets/swf/**").addResourceLocations("/assets/swf/");
		
	}
	
}
