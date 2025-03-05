package org.sample.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sample.dao.DeleteUserDao;


/**
 * Servlet implementation class DeleteUserServlet
 */
public class DeleteUserServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private DeleteUserDao deleteUserDao;

    public void init() 
    {
        deleteUserDao = new DeleteUserDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		deleteUserDao.deleteUser(id);
		request.getRequestDispatcher("AllUserServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		deleteUserDao.deleteUser(id);
		request.getRequestDispatcher("AllUserServlet").forward(request, response);
	}

}
