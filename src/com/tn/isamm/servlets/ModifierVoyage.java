package com.tn.isamm.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Voyage;
import com.tn.isamm.services.ClientServiceImpl;
import com.tn.isamm.services.VoyageServiceImpl;

/**
 * Servlet implementation class ModifierVoyage
 */
@WebServlet("/ModifierVoyage")
public class ModifierVoyage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierVoyage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				/*
				 * String id= request.getParameter("id"); request.setAttribute("id",id);
				 */
				String id = request.getParameter("id");
				int idV = Integer.parseInt(id);
				VoyageServiceImpl service = new VoyageServiceImpl();
				Voyage vg = service.recupererVoyage(idV);
				request.setAttribute("Voyage", vg);
				this.getServletContext()
						.getRequestDispatcher("/admin/modifiervoyage.jsp")
						.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String id = request.getParameter("idv");
				int idv = Integer.parseInt(id);
				VoyageServiceImpl service = new VoyageServiceImpl();
				service.modifierVoyage(idv, request);
				response.sendRedirect(request.getContextPath()
						+ "/admin/Voyages");
	}

}
