package com.tn.isamm.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Contact;
import com.tn.isamm.beans.Newsletter;
import com.tn.isamm.persistance.HibernateUtil;

public class NewsletterDAO extends DAO<Newsletter> {
	public NewsletterDAO() {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	@Override
	public boolean ajouter(Newsletter obj) {
		session.save(obj);
		tx.commit();
		return true;
	}

	@Override
	public boolean supprimer(int id) {
		Newsletter n = (Newsletter) session.get(Newsletter.class, id);
		session.delete(n);
		tx.commit();
		return true;
	}

	@Override
	public boolean modifier(int id, Newsletter nm) {
		return false;
	}

	@Override
	public boolean afficher(int id) {
		return false;
	}

	@Override
	public ArrayList<Newsletter> afficherTout() {
		ArrayList<Newsletter> ns=new ArrayList<Newsletter>();
		Query q = session.createQuery("from Newsletter");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			ns.add((Newsletter) i.next());
		}
		return ns;
	}

	@Override
	public boolean fermeture() {
		
		session.close();
		HibernateUtil.shutdown();
		return true;
	}

	@Override
	public Newsletter recuperer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validerCnx(String l, String m) {
		// TODO Auto-generated method stub
		return false;
	}
}
