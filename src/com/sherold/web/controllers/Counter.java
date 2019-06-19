package com.sherold.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Instatiates session
		HttpSession session = request.getSession(false);
		
		// Checks to see if counter value is null, if so set value to 0
		if(session == null) {
			// Instantiates a new session
			session = request.getSession();
			
			// Sets session attributes
			session.setAttribute("count", 0);
			Integer count = (Integer) session.getAttribute("count");
			
			// Set model for view (to be accessed)
			request.setAttribute("counter", count);	
		// else capture session data for the view
		} else {
			Integer count = (Integer) session.getAttribute("count");
			// Set model for view (to be accessed)
			request.setAttribute("counter", count);
			
			// Iterate count
			count++;
			session.setAttribute("count", count);
			
		}			
		
		// Let the view handle the request
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
