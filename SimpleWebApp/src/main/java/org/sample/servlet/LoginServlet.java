package org.sample.servlet;


import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;

import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sample.dao.UserLoginDao;
import org.sample.dto.User;
//import org.sample.util.ConnectionUtils;
//import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class login
 */
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
//	private ServletRequest session;

	private UserLoginDao userloginDao;

    public void init() 
    {
        userloginDao = new UserLoginDao();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{   
		try {

		    String userName = request.getParameter("userName");
		    String password = request.getParameter("password");
		    

			User userObj = new User();
		    userObj.setUsername(userName);
			userObj.setPassword(password);
			boolean rs = userloginDao.loginUser(userObj);
			
		    if (rs) 
		    {
		        System.out.println("successful");
		        request.getRequestDispatcher("success.jsp").forward(request, response);
		        response.sendRedirect("success.jsp");
		        
		    } 
		    else 
		    {
		        response.sendRedirect("invalid.jsp");
		    }
		} catch (Exception e) {
		    System.out.println(e);
		}
	}

}
