package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;

public abstract class ClientService {
	public abstract boolean enregistrerClient(HttpServletRequest request);
	
	public abstract boolean enregistrerClientAvecRole(HttpServletRequest request);

	public abstract boolean modifierClient(int id,HttpServletRequest request);

	public abstract boolean supprimerClient(int id);

	public abstract boolean afficherClient(int id);

	public abstract ArrayList<Client> afficherClients();

	public abstract Client recupererClient(int id);

	public abstract Client verifierCnx(HttpServletRequest request);

	public abstract boolean fermeture();
}
