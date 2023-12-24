package com.spring.SpringDao2.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.spring.SpringDao2.Dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> findAll() {
		List<Employee> employee=new ArrayList<Employee>();
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/springdao";
		String uname="root";
		String pwd="veeranji";
		
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,uname,pwd);
			
			Statement st=con.createStatement();
			String query="select * from employee";
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int fees=rs.getInt(3);
				String location=rs.getString(4);
				
				Employee employee1=new Employee(id,name,fees,location);
				employee.add(employee1);
				System.out.println("successfully completed");
				
			}
		
		
		return employee;
	}
	catch(Exception e) {}
		return employee;

}
}
