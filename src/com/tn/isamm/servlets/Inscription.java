package com.tn.isamm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.beans.Client;
import com.tn.isamm.services.ClientServiceImpl;

public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp")
		.forward(request, response);
	

		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		ClientServiceImpl service = new ClientServiceImpl();
		service.enregistrerClient(request);
		//service.fermeture();
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp")
		.forward(request, response);
	
		}catch (Exception e){
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/Uniciter.jsp")
			.forward(request, response);
		}
		}

}