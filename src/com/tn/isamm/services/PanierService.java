package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Panier;
import com.tn.isamm.beans.Voyage;

public abstract class PanierService {
	

	public abstract boolean enregistrerPanier(HttpServletRequest request);
	
	public abstract boolean modifierPanier(int id,HttpServletRequest request);

	public abstract boolean supprimerPanier(int id);

	public abstract boolean afficherPanier(int id);

	public abstract ArrayList<Panier> afficherPaniers(int id);

	public abstract Panier recupererPanier(int id);

	public abstract Client verifierCnx(HttpServletRequest request);

	public abstract boolean fermeture();


	public abstract boolean ajouterAuPanier(HttpServletRequest request, Client client, Voyage voyage);

	public abstract  boolean modifierPanier(HttpServletRequest request, Client c, Voyage v);

	
}
