package com.tn.isamm.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Compte;
import com.tn.isamm.dao.ClientDAO;
import com.tn.isamm.dao.DAO;

public class ClientServiceImpl extends ClientService {
	private Map<String, String> erreurs = new HashMap<String, String>();
	private String message;
	private boolean valide = false;
	private ClientDAO clientdao = new ClientDAO();

	public DAO<Client> getClientdao() {
		return clientdao;
	}

	public void setClientdao(ClientDAO clientdao) {
		this.clientdao = clientdao;
	}

	public ClientServiceImpl() {
		clientdao = new ClientDAO();
	}

	public String getMessage() {
		return message;
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	// controle de saisie sur login et mdp
	public void validerLogin(String log) {
		if (log.equals("")) {
			erreurs.put("login", "Veuillez verifier le login");
		}
	}

	public void validerMdp(String mdp) {
		if (mdp.equals("")) {
			erreurs.put("mdp", "Veuillez verifier le mot de passe");
		}

	}

	@Override
	public boolean enregistrerClient(HttpServletRequest request) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String cin = request.getParameter("cin");
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		Client c = new Client(nom, prenom, adresse, mail, tel, cin, login, mdp,
				0, sex, age);

		/*Compte compte = new Compte(10000.0); // simulation d'un compte 10.000
		// par défaut
		c.setCompte(compte);*/
		
		
		
		return clientdao.ajouter(c);
		 
	}

	@Override
	public boolean modifierClient(int id, HttpServletRequest request) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String cin = request.getParameter("cin");
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		int role = Integer.parseInt(request.getParameter("role"));
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		Client c = new Client(nom, prenom, adresse, mail, tel, cin, login, mdp,
				role,sex, age);
		return clientdao.modifier(id, c);
	}

	@Override
	public boolean supprimerClient(int id) {
		return clientdao.supprimer(id);
	}

	@Override
	public boolean afficherClient(int id) {
		return clientdao.afficher(id);
	}

	@Override
	public boolean fermeture() {
		return clientdao.fermeture();
	}

	@Override
	public Client recupererClient(int id) {
		return clientdao.recuperer(id);
	}

	@Override
	public Client verifierCnx(HttpServletRequest request) {
		boolean verif = false;
		String login = request.getParameter("login"); 
		String pwd = request.getParameter("pwd");
		validerLogin(login);
		validerMdp(pwd);
		verif = clientdao.validerCnx(login, pwd);
		if (verif == true && erreurs.isEmpty()) {
			message = "Connexion reussie";
			valide = true;
		} else {
			message = "Echec de la connexion";
			valide = false;
		}
		return clientdao.getC();
	}

	@Override
	public boolean enregistrerClientAvecRole(HttpServletRequest request) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String cin = request.getParameter("cin");
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		int role = Integer.parseInt(request.getParameter("role"));

		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		Client c = new Client(nom, prenom, adresse, mail, tel, cin, login, mdp,
				role,sex, age);
		
		return clientdao.ajouter(c);
	}

	@Override
	public ArrayList<Client> afficherClients() {
		return clientdao.afficherTout();
	}

	public int compteClients(int i, int j ) {
		// TODO Auto-generated method stub
		return clientdao.compteClients(i,  j);
	}
	public int compteClients(String s ) {
		// TODO Auto-generated method stub
		return clientdao.compteClients(s);
	}

}
