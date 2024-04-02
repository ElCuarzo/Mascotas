package com.elcuarzo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elcuarzo.web.models.Cat;

/**
 * Servlet implementation class cat
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException{
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		double weight = Double.parseDouble(request.getParameter("weight"));
		
		Cat cat = new Cat(name, breed, weight);
		
		request.setAttribute("Animal", cat);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/cat.jsp");
		dispatcher.forward(request, reponse);
	}
}

