package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Newsletter;

public abstract class NewsletterService {
	public abstract boolean enregistrerNewsletter(HttpServletRequest request);

	public abstract boolean modifierNewsletter(int id,Newsletter n);

	public abstract boolean supprimerNewsletter(int id);

	public abstract boolean afficherNewsletter(int id);

	public abstract ArrayList<Newsletter> afficherNewsletters();

	public abstract boolean fermeture();
}
