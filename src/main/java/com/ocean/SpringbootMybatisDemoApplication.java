package com.ocean;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
/*@Configuration
@ComponentScan(basePackages = {"com.ocean.controller"})
@ImportResource(locations = {"classpath*:/dubbo/dubbo-consumer-base.xml"})*/
@MapperScan("com.ocean")
public class SpringbootMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
	}

}
