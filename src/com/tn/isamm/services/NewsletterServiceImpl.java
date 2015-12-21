package com.tn.isamm.services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Newsletter;
import com.tn.isamm.dao.NewsletterDAO;
import com.tn.isamm.dao.DAO;

public class NewsletterServiceImpl extends NewsletterService {
	private DAO<Newsletter> newsletterdao;

	public DAO<Newsletter> getNewsletterdao() {
		return newsletterdao;
	}

	public void setNewsletterdao(NewsletterDAO newsletterdao) {
		this.newsletterdao = newsletterdao;
	}

	public NewsletterServiceImpl() {
		newsletterdao = new NewsletterDAO();
	}

	@Override
	public boolean enregistrerNewsletter(HttpServletRequest request) {
		String mail=request.getParameter("mail");
		Newsletter n=new Newsletter(mail);
		return newsletterdao.ajouter(n);
	}

	@Override
	public boolean modifierNewsletter(int id, Newsletter n) {
		return newsletterdao.modifier(id, n);
	}

	@Override
	public boolean supprimerNewsletter(int id) {
		return newsletterdao.supprimer(id);
	}

	@Override
	public boolean afficherNewsletter(int id) {
		return newsletterdao.afficher(id);
	}

	@Override
	public ArrayList<Newsletter> afficherNewsletters() {
		return newsletterdao.afficherTout();
	}

	@Override
	public boolean fermeture() {
		return newsletterdao.fermeture();
	}

}
