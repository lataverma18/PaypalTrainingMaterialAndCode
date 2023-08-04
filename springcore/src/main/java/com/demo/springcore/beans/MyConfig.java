package com.demo.springcore.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Source of Bean Definition
//@Profile("dev,default")
@Configuration
@ComponentScan(basePackages = {"com.demo.springcore.beans"})
public class MyConfig {

}
