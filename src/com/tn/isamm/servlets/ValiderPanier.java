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
import com.tn.isamm.services.PanierServiceImpl;
import com.tn.isamm.services.VoyageServiceImpl;

/**
 * Servlet implementation class ValiderPanierr
 */
@WebServlet("/ValiderPanierr")
public class ValiderPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValiderPanier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		ClientServiceImpl serviceC=new ClientServiceImpl();
		String id_cl = request.getParameter("idc");
		int idi_cl = Integer.parseInt(id_cl);
		Client c=serviceC.recupererClient(idi_cl);

		VoyageServiceImpl serviceV=new VoyageServiceImpl();
		String id_voy = request.getParameter("idv");
		int idi_voy = Integer.parseInt(id_voy);
		Voyage v=serviceV.recupererVoyage(idi_voy);


		int idcl = Integer.parseInt(id_cl);
		int idvo = Integer.parseInt(id_voy);

		PanierServiceImpl service = new PanierServiceImpl();
		if (service.validerPanier(c, v))		
			response.sendRedirect(request.getContextPath()
					+ "/front/Panier?id="+idcl);
		
		else response.sendRedirect(request.getContextPath()
				+ "/front/erreur.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
