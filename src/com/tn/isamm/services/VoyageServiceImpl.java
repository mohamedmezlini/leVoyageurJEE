package com.tn.isamm.services;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Voyage;
import com.tn.isamm.dao.DAO;
import com.tn.isamm.dao.VoyageDAO;

public class VoyageServiceImpl extends VoyageService {


	private VoyageDAO voyagedao = new VoyageDAO();

	public DAO<Voyage> getVoyagedao() {
		return voyagedao;
	}

	public void setVoyagedao(VoyageDAO voyagedao) {
		this.voyagedao = voyagedao;
	}

	public VoyageServiceImpl() {
		voyagedao = new VoyageDAO();
	}



	@Override
	public boolean enregistrerVoyage(HttpServletRequest request) {
		System.out.println(request.getParameter("date_a"));
		Date d1 = Date.valueOf(request.getParameter("date_a"));
		Date d2 = Date.valueOf(request.getParameter("date_d"));
		
		Integer d3 = Integer.parseInt(request.getParameter("disponible"));
		
		Integer d4 =0;
		String d5 = request.getParameter("pays");
		
		Double d6 = Double.parseDouble( request.getParameter("prix"));
		
		String d7 = request.getParameter("ville_a");
		String d8 = request.getParameter("ville_d");
		String d9 = "images";//
		
		
		
		
		
		Voyage v=new Voyage(d1,d9, d2, d3, d4, d5, d6, d7, d8);

		return voyagedao.ajouter(v);
	}

	@Override
	public boolean afficherVoyage(int id) {
		return voyagedao.afficher(id);
	}

	@Override
	public boolean fermeture() {
		return voyagedao.fermeture();
	}

	@Override
	public ArrayList<Voyage> afficherVoyages() {
		return voyagedao.afficherTout();
	}



	@Override
	public boolean modifierVoyage(int id, HttpServletRequest request) {
		Date d1 = Date.valueOf(request.getParameter("date_a"));
		Date d2 = Date.valueOf(request.getParameter("date_d"));
		
		Integer d3 = Integer.parseInt(request.getParameter("disponible"));
		
		Integer d4 =Integer.parseInt( request.getParameter("disponible"));
		String d5 = request.getParameter("pays");
		
		Double d6 = Double.parseDouble( request.getParameter("prix"));
		
		String d7 = request.getParameter("ville_a");
		String d8 = request.getParameter("ville_d");
		String d9 = "images";//
		
		
		
		
		
		Voyage v=new Voyage(d1,d9, d2, d3, d4, d5, d6, d7, d8);

		
		return voyagedao.modifier(id, v);
	}

	@Override
	public boolean supprimerVoyage(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Voyage recupererVoyage(int id) {
		// TODO Auto-generated method stub
		return voyagedao.recuperer(id);
	}

	@Override
	public boolean enregistrerClientAvecRole(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client verifierCnx(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}



}
