package com.tn.isamm.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Voyage;
import com.tn.isamm.services.ClientServiceImpl;
import com.tn.isamm.services.PanierServiceImpl;
import com.tn.isamm.services.VoyageServiceImpl;

/**
 * Servlet implementation class AjouterAuPanier
 */
@WebServlet("/AjouterAuPanier")
public class AjouterAuPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterAuPanier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
		
		
		HttpSession session = request.getSession();	
		
		PanierServiceImpl service = new PanierServiceImpl();

		ClientServiceImpl serviceC=new ClientServiceImpl();
		String id_cl = request.getParameter("id_cl");
		int idi_cl = Integer.parseInt(id_cl);
		Client c=serviceC.recupererClient(idi_cl);
		
		VoyageServiceImpl serviceV=new VoyageServiceImpl();
		String id_voy = request.getParameter("id_voy");
		int idi_voy = Integer.parseInt(id_voy);
		Voyage v=serviceV.recupererVoyage(idi_voy);
		
		if(Integer .parseInt(request.getParameter("nb"))<0||v.getNbDispo()< Integer .parseInt(request.getParameter("nb"))){
			session.setAttribute("Erreur", "veuillez diminier le nombre de ticket");
			
			

			response.sendRedirect(request.getContextPath() + "/front/erreur.jsp");
			
		}else 
		{
		service.ajouterAuPanier(request,c, v );
		
		
		
		
		response.sendRedirect(request.getContextPath() + "/front/index.jsp");
	}
		}catch (Exception e){

			HttpSession session = request.getSession();	
			
			PanierServiceImpl service = new PanierServiceImpl();

			ClientServiceImpl serviceC=new ClientServiceImpl();
			String id_cl = request.getParameter("id_cl");
			int idi_cl = Integer.parseInt(id_cl);
			Client c=serviceC.recupererClient(idi_cl);
			
			VoyageServiceImpl serviceV=new VoyageServiceImpl();
			String id_voy = request.getParameter("id_voy");
			int idi_voy = Integer.parseInt(id_voy);
			Voyage v=serviceV.recupererVoyage(idi_voy);
			
			if( Integer .parseInt(request.getParameter("nb"))<0||v.getNbDispo()< Integer .parseInt(request.getParameter("nb"))){
				session.setAttribute("Erreur", "veuillez diminier le nombre de ticket");
				

				response.sendRedirect(request.getContextPath() + "/front/erreur.jsp");
				
			}else 
			{
			service.modifierPanier(request,c, v );
			
			
			
			
			response.sendRedirect(request.getContextPath() + "/front/index.jsp");
		}
			
		}
	}

}
