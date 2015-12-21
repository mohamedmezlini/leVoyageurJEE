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
import com.tn.isamm.services.ClientServiceImpl;

/**
 * Servlet implementation class Stat
 */
@WebServlet("/Stat")
public class Stat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Stat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ArrayList<Integer> nbInscri = new ArrayList<Integer>();
		ArrayList<Integer> sex = new ArrayList<Integer>();
		ArrayList<Client> listec = new ArrayList<Client>();
		ClientServiceImpl service = new ClientServiceImpl();
		nbInscri.add(service.compteClients(10,20));
		nbInscri.add(service.compteClients(21,30));
		nbInscri.add(service.compteClients(31,40));
		//nbInscri.add(1);nbInscri.add(5);nbInscri.add(7);nbInscri.add(3);
		
		sex.add(service.compteClients("homme")); 
		sex.add(service.compteClients("femme")); 
		
		session.setAttribute("nbInscri", nbInscri);
		session.setAttribute("sex", sex);
        this.getServletContext().getRequestDispatcher("/admin/stat.jsp")
		.forward(request, response);
		
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
