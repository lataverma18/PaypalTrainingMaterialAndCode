package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.demo.beans.Address;
import com.example.demo.beans.EmployeeRepository;
import com.example.demo.beans.MyBean;

@SpringBootApplication
/*
-@Configuration
-@ComponentScan - Current Package and Nested package
-@EnableAutoConfig
*/
//@PropertySource("data.properties")
public class DemoApplication {

	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		return new JdbcTemplate(driverManagerDataSource());
	}
	
	@Bean
	public DriverManagerDataSource driverManagerDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();	
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/TempDB");
		ds.setUsername("postgres");
		ds.setPassword("system");
		return ds;
	}
	
	public static void main(String[] args) {
		Logger logger=LoggerFactory.getLogger(DemoApplication.class);
		
		
		logger.trace("Trace Log");
		logger.info("Info Log");
		logger.warn("Warn Log");
		logger.debug("Debug Log");
		logger.error("Error Log");
	
		
		
		logger.info("Start:");
		ConfigurableApplicationContext cac= SpringApplication.run(DemoApplication.class, args);
		
		EmployeeRepository er=cac.getBean(EmployeeRepository.class);
		er.fetchAll().forEach(obj-> System.out.println(obj));
		
		er.insert();
		
		Address ad=cac.getBean(Address.class);
		System.out.println(ad);
		
		MyBean mb=cac.getBean(MyBean.class);
		System.out.println(mb.message());
		logger.info("End:");
	}
}
