package com.tektaurus.dao;

import java.sql.*;

import com.tektaurus.bean.Employee;

public class EmployeeDAO {

	Connection con;
	PreparedStatement pre;
	ResultSet res;
	
	public EmployeeDAO()
	{
		try{
			Class.forName("oracle.jdbc.drivers.OracleDrivers");
			con=DriverManager.getConnection("jdbc:oracle:this:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connection Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public int insert(Employee e)
	{
		System.out.println("INSERT");
		int ra=0;
		try
		{
			pre=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pre.setInt(1, e.getEid());
			pre.setString(2,e.getName());
			pre.setString(3, e.getMobile());
			pre.setString(4,e.getAddress());
			pre.setString(5, e.getJd());
			ra=pre.executeUpdate();
			pre.close();
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return ra;
	}
	public int update(Employee e)

	{
		System.out.println("UPDATE");
		int ra=0;
		try
		{
			pre=con.prepareStatement("update employee set name=?,mobile=?,address=?,jd=? where eid=?");
			pre.setInt(5, e.getEid());
			pre.setString(1,e.getName());
			pre.setString(2, e.getMobile());
			pre.setString(3,e.getAddress());
			pre.setString(4, e.getJd());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
		return ra;
	}
	public int delete(int eid)

	{
		System.out.println("DELETE");
		int ra=0;
		try
		{
			pre=con.prepareStatement("delete from employee where eid=?");
			pre.setInt(1, eid);
			
			ra=pre.executeUpdate();
			pre.close();
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
		return ra;
	}
	public ResultSet retrieve(int eid)
	{
		System.out.println("DISPLAY");
		try
		{
			
			pre=con.prepareStatement("select * from employee where eid=?");
			pre.setInt(1,eid);
			res=pre.executeQuery();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return res;
	}
	
}
