package com.tn.isamm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tn.isamm.beans.Client;
import com.tn.isamm.services.*;

/**
 * Servlet implementation class ServletConnexion
 */
// @WebServlet("/ServletConnexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClientServiceImpl service = new ClientServiceImpl();
		
		Client utilisateur = service.verifierCnx(request);
		String role;

		HttpSession session = request.getSession();
		if (service.isValide()) {
			session.setAttribute("sessionUtilisateur", utilisateur);
			if (utilisateur.getRole() == 1)
				role = "Admin";
			else
				role = "Client";
			session.setAttribute("role", role);
			request.setAttribute("service", service);
			request.setAttribute("utilisateur", utilisateur);
			if(role.equalsIgnoreCase("Admin")){
			response.sendRedirect("admin/Index");}
			else {
				response.sendRedirect(request.getContextPath() + "/front/index.jsp");
				
			}
		} else {
			session.setAttribute("sessionUtilisateur", null);
			request.setAttribute("service", service);
			request.setAttribute("utilisateur", utilisateur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp")
			.forward(request, response);
		}
	}

}
