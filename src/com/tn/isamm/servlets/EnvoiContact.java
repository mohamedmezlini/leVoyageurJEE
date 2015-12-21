package com.tn.isamm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.beans.Client;
import com.tn.isamm.services.ClientServiceImpl;
import com.tn.isamm.services.ContactServiceImpl;

/**
 * Servlet implementation class EnvoiContact
 */
public class EnvoiContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnvoiContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/admin/envoicontact.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ContactServiceImpl service = new ContactServiceImpl();
		ClientServiceImpl serviceC=new ClientServiceImpl();
		String id = request.getParameter("id");
		int idi = Integer.parseInt(id);
		Client c=serviceC.recupererClient(idi);
		service.enregistrerContact(request,c);
		response.sendRedirect(request.getContextPath() + "/admin/Index");
	}

}
