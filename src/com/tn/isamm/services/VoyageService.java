package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Voyage;

public abstract class VoyageService {
	public abstract boolean enregistrerVoyage(HttpServletRequest request);
	
	public abstract boolean enregistrerClientAvecRole(HttpServletRequest request);

	public abstract boolean modifierVoyage(int id,HttpServletRequest request);

	public abstract boolean supprimerVoyage(int id);

	public abstract boolean afficherVoyage(int id);

	public abstract ArrayList<Voyage> afficherVoyages();

	public abstract Voyage recupererVoyage(int id);

	public abstract Client verifierCnx(HttpServletRequest request);

	public abstract boolean fermeture();

}
