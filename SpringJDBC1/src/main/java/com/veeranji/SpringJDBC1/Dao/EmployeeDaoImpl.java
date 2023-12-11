package com.veeranji.SpringJDBC1.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.veeranji.SpringJDBC1.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertEmployee(Employee employee) {
		
		String query="insert into employee values(?,?,?)";
		System.out.println("query:"+query);
		jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getExp());

	}

}
