package com.tn.isamm.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Contact;
import com.tn.isamm.persistance.HibernateUtil;

public class ContactDAO extends DAO<Contact> {
	public ContactDAO() {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	@Override
	public boolean ajouter(Contact obj) {
		session.save(obj);
		tx.commit();
		return true;
	}

	@Override
	public boolean supprimer(int id) {
		Contact c = (Contact) session.get(Contact.class, id);
		session.delete(c);
		return true;
	}
	
	
	public boolean modifier(int id ,Contact co) {
		Contact c = (Contact) session.get(Contact.class, id);
		c.setRepondre(co.getRepondre());
			tx.commit();
		return true;
	}

	@Override
	public boolean afficher(int id) {
		Query q = session
				.createQuery("from Contact contact where contact.idContact="
						+ id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			System.out.println(((Contact) i.next()));
		}
		return true;
	}

	@Override
	public ArrayList<Contact> afficherTout() {
		ArrayList<Contact> cts = new ArrayList<Contact>();
		Query q = session.createQuery("from Contact");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			cts.add((Contact) i.next());
		}
		return cts;
	}

	public ArrayList<Contact> afficherToutParClient(int id) {
		ArrayList<Contact> cts = new ArrayList<Contact>();
		Query q = session
				.createQuery("from Contact contact where contact.client=" + id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			cts.add((Contact) i.next());
		}
		return cts;
	}

	@Override
	public boolean fermeture() {
		tx.commit();
		session.close();
		HibernateUtil.shutdown();
		return true;
	}

	@Override
	public Contact recuperer(int id) {
		Contact c = new Contact();
		Query q = session
				.createQuery("from Contact contact where contact.idContact=" + id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			c = (Contact) i.next();
		}
		return c;
	}

	@Override
	public boolean validerCnx(String l, String m) {
		// TODO Auto-generated method stub
		return false;
	}


}
