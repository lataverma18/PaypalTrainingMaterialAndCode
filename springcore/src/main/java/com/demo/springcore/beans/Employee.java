package com.demo.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp1")
@Scope("prototype")
//@Profile("default,dev")
public class Employee implements BeanNameAware,BeanFactoryAware,InitializingBean, DisposableBean{ 
private int empId;
private String empName;
//@Autowired
private Address empAddress;

public Address getEmpAddress() {
	return empAddress;
}
@Autowired
public void setEmpAddress(Address empAddress) {
	this.empAddress = empAddress;
}
public Employee() {}

/*
 * @Autowired public Employee(@Value("101") int empId,@Value("Ronit") String
 * empName, Address empAddress) { System.out.println("Constructor Called!!!");
 * this.empId = empId; this.empName = empName; this.empAddress = empAddress; }
 */
public int getEmpId() {
	return empId;
}
@Value("101")
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
@Value("Ronit")
public void setEmpName(String empName) {
	this.empName = empName;
}
public void greet()
{
	System.out.println("Hello Everyone, Welcome to Paypal!!!");
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
}


  @Override public void afterPropertiesSet() throws Exception {
  System.out.println("Initializing Bean"); }
  
  @Override public void destroy() throws Exception {
  System.out.println("Disposable Bean"); }
 
@Override
public void setBeanName(String name) {
	System.out.println(name);
	
}
@Override
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	System.out.println(beanFactory);	
}

@PostConstruct
public void myCustomInit()
{
	System.out.println("My Custom Init Method");
}
@PreDestroy
public void myCustomDestroy()
{
	System.out.println("My Custom Destroy Method");
}

}
