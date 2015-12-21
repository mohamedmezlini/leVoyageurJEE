package com.tn.isamm.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.services.ClientServiceImpl;
import com.tn.isamm.services.PanierServiceImpl;

/**
 * Servlet implementation class SupprimerDuPanier
 */
@WebServlet("/SupprimerDuPanier")
public class SupprimerDuPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerDuPanier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String idc = request.getParameter("idc");
		String idv = request.getParameter("idv");
		int idcl = Integer.parseInt(idc);
		int idvo = Integer.parseInt(idv);
		PanierServiceImpl service = new PanierServiceImpl();
		service.supprimerPanier(idcl, idvo);
		response.sendRedirect(request.getContextPath()
				+ "/front/Panier?id="+idcl);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
