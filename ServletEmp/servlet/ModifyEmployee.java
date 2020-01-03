package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Employee;
import com.tektaurus.dao.EmployeeDAO;

@WebServlet("/ModifyEmployee")
public class ModifyEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	EmployeeDAO dao;
	Employee emp;
	PrintWriter out;
    public ModifyEmployee() {
        dao=new EmployeeDAO();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			out=response.getWriter();
			int eid=Integer.parseInt(request.getParameter("eid"));
			int ra=dao.delete(eid);
			if(ra>0)
				out.println("<font color=green>Employee Details Deleted Succcessfully.</font><br>");
			else
				out.println("<font color=red>Employee Details Cannot Be Deleted.</font><br>");
			out.println("To go back to the form <a href='http://localhost:9080/ServletProgs/home.html'>Click here</a>");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			out=response.getWriter();
			int eid=Integer.parseInt(request.getParameter("eid"));
			String name=request.getParameter("name");
			String mobile=request.getParameter("mobile");
			String address=request.getParameter("address");
			String jd=request.getParameter("jd");
			emp=new Employee(eid,name,mobile,address,jd);
			int ra=dao.update(emp);
			if(ra>0)
				out.println("<font color=green>Employee Details Updated Succcessfully.</font><br>");
			else
				out.println("<font color=red>Employee Details Cannot Be Updated.</font><br>");
			out.println("To go back to the form <a href='http://localhost:9080/ServletProgs/home.html'>Click here</a>");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
