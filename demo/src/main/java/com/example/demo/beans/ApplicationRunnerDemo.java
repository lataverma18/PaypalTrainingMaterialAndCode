package com.example.demo.beans;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(2)
public class ApplicationRunnerDemo implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("Application Runner: "+Arrays.toString(args.getSourceArgs()));	
	}
}
