package com.springboot.activiti.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;

@Configuration
@MapperScan("com.springboot.activiti.dao")
public class MybatisPlusConfig {
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}

	/**
	 * mybatis-plus分页插件<br>
	 * 文档：http://mp.baomidou.com<br>
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//		paginationInterceptor.setLocalPage(true);// 开启 PageHelper 的支持
		
		return paginationInterceptor;
	}

}
