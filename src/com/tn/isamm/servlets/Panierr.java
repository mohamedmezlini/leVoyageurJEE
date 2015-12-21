package com.tn.isamm.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Panier;
import com.tn.isamm.beans.Voyage;
import com.tn.isamm.services.ClientServiceImpl;
import com.tn.isamm.services.PanierServiceImpl;
import com.tn.isamm.services.VoyageServiceImpl;

/**
 * Servlet implementation class Panierr
 */
@WebServlet("/Panierr")
public class Panierr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Panierr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int remise=5; 
		ArrayList<Voyage> voyage=new ArrayList<Voyage>();
		
		PanierServiceImpl serviceP = new PanierServiceImpl();
		VoyageServiceImpl serviceV = new VoyageServiceImpl();
		
		
		String id = request.getParameter("id");
		int idc = Integer.parseInt(id);
		ArrayList<Panier> listep=serviceP.afficherPaniers(idc);
		for(int i=0;i<listep.size();i++)
		{
			int idV=listep.get(i).getId().getIdVoyage();
			voyage.add(serviceV.recupererVoyage(idV));
		}
        session.setAttribute("listePaniers", listep);
        session.setAttribute("listeVoyages", voyage);
        
        
        
        response.sendRedirect(request.getContextPath()
				+"/front/panier.jsp");
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
