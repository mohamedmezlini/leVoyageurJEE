package com.tn.isamm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.services.ClientServiceImpl;

/**
 * Servlet implementation class AjouterClient
 */
public class AjouterClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() throws ServletException {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/admin/ajouterclient.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			ClientServiceImpl service = new ClientServiceImpl();
			service.enregistrerClientAvecRole(request);

			response.sendRedirect(request.getContextPath() + "/admin/Clients");
		} catch (Exception e) {
			// this.getServletContext().getRequestDispatcher("/admin/clients.jsp")
			// .forward(request, response);

			response.sendRedirect(request.getContextPath() + "/admin/UniciterAdmin.jsp");
		}

	}
}