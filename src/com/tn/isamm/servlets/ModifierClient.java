package com.tn.isamm.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tn.isamm.beans.Client;
import com.tn.isamm.services.ClientServiceImpl;

public class ModifierClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * String id= request.getParameter("id"); request.setAttribute("id",id);
		 */
		String id = request.getParameter("id");
		int idi = Integer.parseInt(id);
		ClientServiceImpl service = new ClientServiceImpl();
		Client cm = service.recupererClient(idi);
		request.setAttribute("clt", cm);
		this.getServletContext()
				.getRequestDispatcher("/admin/modifierclient.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("idc");
		int idi = Integer.parseInt(id);
		ClientServiceImpl service = new ClientServiceImpl();
		service.modifierClient(idi, request);
		response.sendRedirect(request.getContextPath()
				+ "/admin/Clients");
	}

}
