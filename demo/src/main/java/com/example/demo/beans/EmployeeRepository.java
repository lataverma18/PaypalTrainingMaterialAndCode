package com.example.demo.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public List<Employee> fetchAll()
	{
		List<Employee> list=jt.query("select * from Employee",(rs,num)->{
			Employee emp=new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getInt("salary"));
			emp.setDepartment(rs.getString("department"));
			return emp;
		});
		
		return list;
	}
	@Transactional
	public void insert()
	{
		int rowAffected=jt.update("insert into Employee values(?,?,?,?)", 111,"Arun",50000,"Production");
		if(rowAffected==1)
			System.out.println("Inserted Successfully");
	}
	public void update()
	{
		
	}
	public void delete()
	{
		
	}
}
