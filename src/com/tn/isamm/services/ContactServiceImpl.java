package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Contact;
import com.tn.isamm.dao.ContactDAO;
import com.tn.isamm.dao.DAO;

public class ContactServiceImpl extends ContactService {
	private ContactDAO contactdao=new ContactDAO();

	public DAO<Contact> getContactdao() {
		return contactdao;
	}

	public void setContactdao(ContactDAO contactdao) {
		this.contactdao = contactdao;
	}

	public ContactServiceImpl() {
		contactdao = new ContactDAO();
	}

	@Override
	public boolean enregistrerContact(HttpServletRequest request,Client c) {
		String obj = request.getParameter("objet");
		String suj = request.getParameter("sujet");
		Contact co=new Contact(obj,suj,c,"");
		return contactdao.ajouter(co);
	}

	
	
	
	@Override
	public boolean modifierContact(int id, HttpServletRequest request) {
		String repondre = request.getParameter("des");
		Contact con = new Contact(repondre);
		return contactdao.modifier(id,con);
	}
	
	
	
	@Override
	public Contact recupererContact(int id) {
		return contactdao.recuperer(id);
	}

	

	@Override
	public boolean supprimerContact(int id) {
		return contactdao.supprimer(id);
	}


	@Override
	public ArrayList<Contact> afficherContacts() {
		return contactdao.afficherTout();
	}

	@Override
	public boolean fermeture() {
		return contactdao.fermeture();
	}

	@Override
	public boolean afficherContact(int id) {
		// TODO Auto-generated method stub
		return contactdao.afficher(id);
	}

	@Override
	public ArrayList<Contact> afficherContactsParClient(int id) {
		// TODO Auto-generated method stub
		return contactdao.afficherToutParClient(id);
	}

}
