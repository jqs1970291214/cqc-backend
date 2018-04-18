package com.cqc.backend;

import com.cqc.backend.filter.CrossOriginFilter;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
@EnableCaching
public class ChuangqingchunApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuangqingchunApplication.class, args);
	}


	/**
	 * 配置跨域filter
	 * @return
	 */
	@Bean
	public FilterRegistrationBean crossOriginFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(crossOriginFilter());
		registration.addUrlPatterns("*");
		registration.setName("crossOriginFilter");
		registration.setOrder(1);
		return registration;
	}

	@Bean(name = "crossOriginFilter")
	public Filter crossOriginFilter() {
		return new CrossOriginFilter();
	}
}
