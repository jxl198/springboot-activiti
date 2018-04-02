package com.springboot.activiti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableTransactionManagement
public class ActivitiApplication extends WebMvcConfigurerAdapter {
	protected final static Logger logger = LoggerFactory.getLogger(ActivitiApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ActivitiApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		logger.info("PortalApplication is success!");
		System.err.println("sample started. http://localhost:8080/user/test");
	}
}
