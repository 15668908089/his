package com.neuedu.his.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootConfiguration
// 扫描包
@ComponentScan(basePackages = "com.neuedu.his")
public class SpringConfig {
	// xml:<bean id="" class=""/>
	// 增加跨域权限设置
	// @Bean
	// public WebMvcConfigurer corsConfigurer() {
	// return new WebMvcConfigurer() {
	// @Override
	// public void addCorsMappings(CorsRegistry registry) {
	// registry.addMapping("/**")
	// .allowedOrigins("http://localhost:8080")
	// .allowCredentials(true)
	// //设置允许的header
	// .allowedHeaders("*")
	// .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH");
	// //.maxAge(3600);
	// }
	// };
	// }

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		// WebMvcConfigurerAdapter implements WebMvcConfigurer
		// --->addCorsMappings
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// 限制了路径和域名的访问
				registry.addMapping("/**")
						// 授权访问的前端地址
						.allowedOrigins("http://localhost:8081")
						// 设置允许访访问 的方法
						.allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
						// 设置允许的header
						.allowedHeaders("*")
						// 是否允许证书
						.allowCredentials(true);
			}
		};
	}

}
