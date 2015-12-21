package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Contact;

public abstract class ContactService {
	public abstract boolean enregistrerContact(HttpServletRequest request,Client c);

	public abstract boolean modifierContact(int id,HttpServletRequest request);

	public abstract boolean supprimerContact(int id);

	public abstract boolean afficherContact(int id);
	public abstract Contact recupererContact(int id);

	public abstract ArrayList<Contact> afficherContacts();
	
	public abstract ArrayList<Contact> afficherContactsParClient(int id);
	
	public abstract boolean fermeture();

	}
