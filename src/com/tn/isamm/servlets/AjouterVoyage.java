package com.tn.isamm.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.services.VoyageServiceImpl;

/**
 * Servlet implementation class AjouterVoyage
 */
//@WebServlet("/AjouterVoyage")
public class AjouterVoyage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterVoyage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/admin/ajoutervoyage.jsp")
		.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		VoyageServiceImpl service = new VoyageServiceImpl();
		service.enregistrerVoyage(request);
		//service.fermeture();
		/*this.getServletContext().getRequestDispatcher("/admin/gestion_clients.jsp")
		.forward(request, response);*/
		response.sendRedirect(request.getContextPath() + "/admin/Voyages");
	
	}

}



