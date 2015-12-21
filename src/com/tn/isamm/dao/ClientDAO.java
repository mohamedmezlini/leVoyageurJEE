package com.tn.isamm.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Compte;
import com.tn.isamm.persistance.HibernateUtil;

public class ClientDAO extends DAO<Client> {
	private Client c;

	public ClientDAO() {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		// tx.commit();
	}

	public Client getC() {
		return c;
	}

	public void setC(Client c) {
		this.c = c;
	}

	public boolean ajouter(Client obj) {
		Compte compte = new Compte(90000.0);
		
		obj.setCompte(compte);
		session.save(obj);
		tx.commit();
		return true;
	}

	public boolean supprimer(int id) {
		Client c = (Client) session.get(Client.class, id);
		session.delete(c);
		tx.commit();
		return true;
	}

	public boolean modifier(int id, Client cm) {
		Client c = (Client) session.get(Client.class, id);
		c.setNom(cm.getNom());
		c.setPrenom(cm.getPrenom());
		c.setAdresse(cm.getAdresse());
		c.setMail(cm.getMail());
		c.setTel(cm.getTel());
		c.setCin(cm.getCin());
		c.setLogin(cm.getLogin());
		c.setMdp(cm.getMdp());
		c.setRole(cm.getRole());
		tx.commit();
		return true;
	}

	public boolean modifierCompte(int id, Client cm) {
		Client c = (Client) session.get(Client.class, id);
		c.setCompte(cm.getCompte());

		tx.commit();
		return true;
	}


	public boolean afficher(int id) {
		Query q = session
				.createQuery("from Client client where client.idClient=" + id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			System.out.println(((Client) i.next()));
		}
		return true;
	}

	public ArrayList<Client> afficherTout() {
		ArrayList<Client> cls = new ArrayList<Client>();
		Query q = session.createQuery("from Client");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			cls.add((Client) i.next());
		}
		return cls;
	}

	public boolean fermeture() {

		session.close();
		HibernateUtil.shutdown();
		return true;
	}

	public Client recuperer(int id) {
		Client c = new Client();
		Query q = session
				.createQuery("from Client client where client.idClient=" + id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			c = (Client) i.next();
		}
		return c;
	}

	public int recupererRole(int id) {
		Client c = new Client();
		Query q = session
				.createQuery("from Client client where client.idClient=" + id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			c = (Client) i.next();
		}
		return c.getRole();
	}

	public boolean validerCnx(String login, String mdp) {
		boolean validation = false;
		// Client c = new Client();
		Query q = session.createQuery("from Client client where client.login='"
				+ login + "' and client.mdp='" + mdp + "'");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			c = (Client) i.next();
		}
		if (c == null) {
			validation = false;
		} else
			validation = true;
		return validation;
	}
	//criteria 
	public int compteClients(int e, int j ) {
		// TODO Auto-generated method stub
		int list=0; 
		Criteria q =session.createCriteria(Client.class)
				.add(Restrictions.gt("age",  e) )
				.add(Restrictions.le("age", j));

		List l=q.list();
		Iterator i=l.iterator();
		
		while(i.hasNext()){
			list++; 
			i.next(); 
						
		}
		return list; 
		
	}


	public int compteClients(String e ) {
		// TODO Auto-generated method stub
		int list=0; 
		Criteria q =session.createCriteria(Client.class)
				.add(Restrictions.like("sex",  e) );

		List l=q.list();
		Iterator i=l.iterator();
		
		while(i.hasNext()){
			list++; 
			i.next(); 
						
		}
		return list; 
		
	}

	
}
