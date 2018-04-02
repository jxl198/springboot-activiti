package com.springboot.activiti.configure;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.TemplateException;

@Configuration("freemarkerCfg")
public class FreemarkerConfig {
	@Autowired
	protected freemarker.template.Configuration configuration;
	@Autowired
	protected org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver resolver;
	@Autowired
	protected org.springframework.web.servlet.view.InternalResourceViewResolver springResolver;

	@PostConstruct
	public void setSharedVariable() {
		resolver.setContentType("text/html;charset=utf-8");
		resolver.setSuffix(".html");
		resolver.setCache(false);
		resolver.setRequestContextAttribute("request"); // 为模板调用时，调用request对象的变量名</span>
		resolver.setOrder(0);
		resolver.setExposeRequestAttributes(true);
		resolver.setExposeSessionAttributes(true);
	}
	
	@Bean
	@Primary
	public FreeMarkerConfigurer freemarkerConfig() throws IOException, TemplateException {
	FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
	configurer.setTemplateLoaderPath("classpath:/templates/html");
	
	return configurer;
	}
}
