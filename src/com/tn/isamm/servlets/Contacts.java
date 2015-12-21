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
import com.tn.isamm.beans.Contact;
import com.tn.isamm.services.ClientServiceImpl;
import com.tn.isamm.services.ContactServiceImpl;

public class Contacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ArrayList<Contact> listec = new ArrayList<Contact>();
		ContactServiceImpl service = new ContactServiceImpl();
		String id = request.getParameter("id");
		int idi = Integer.parseInt(id);
		listec=service.afficherContactsParClient(idi);
        session.setAttribute("listeContactsParC", listec);
		this.getServletContext().getRequestDispatcher("/front/voircontactsclient.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
