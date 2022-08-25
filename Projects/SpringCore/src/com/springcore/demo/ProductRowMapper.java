package com.springcore.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper{
	@Autowired
	Product p;
	
	@Override
	public Object mapRow(ResultSet arg0, int arg1) throws SQLException {
		System.out.println(arg1);
		p.setProductId(arg0.getInt(1));
		p.setProductName(arg0.getString(2));
		p.setProductPrice(arg0.getInt(3));
		return p;
	}

}
