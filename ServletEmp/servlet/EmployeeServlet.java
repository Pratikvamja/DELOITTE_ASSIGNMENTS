package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Employee;
import com.tektaurus.bean.Student;
import com.tektaurus.dao.EmployeeDAO;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeDAO dao;
    Employee emp;
    PrintWriter out;
   
    public EmployeeServlet() {
    	dao=new EmployeeDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			out=response.getWriter();
			int eid=Integer.parseInt(request.getParameter("sid"));
			ResultSet res=dao.retrieve(eid);
			out.println("<table border=3><tr><th>Employee Id</th><th>Employee Name</th><th>Mobile No</th><th>Address</th><th>Job Description</th></tr>");
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getInt("eid")+"</td>");
				out.println("<td>"+res.getString("name")+"</td>");
				out.println("<td>"+res.getString("mobile")+"</td>");
				out.println("<td>"+res.getString("address")+"</td>");
				out.println("<td>"+res.getString("jd")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String jd=request.getParameter("stream");
		
		emp=new Employee(eid,name,mobile,address,jd);
		int ra=dao.insert(emp);
		if(ra>0)
			out.println("<font color=green>Employee Details Inserted Succcessfully.</font>");
		else
			out.println("<font color=red>Employee Details are not inserted.</font>");
		out.println("To Go Back To The Form <a href='http://localhost:9080/ServletProgs/home.html'>Click Here</a>");
			
	}

}


