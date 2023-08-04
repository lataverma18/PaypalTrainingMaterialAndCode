package com.demo.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
//myBeanPostProcessor
//@Profile("dev,default")
public class MyBeanPostProcessor implements BeanPostProcessor{
	public MyBeanPostProcessor() {}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Post Processor After Initialization");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Post Processor Before Initialization");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
