package com.tn.isamm.dao;

import java.util.ArrayList;

import com.tn.isamm.beans.Voyage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Compte;
import com.tn.isamm.persistance.HibernateUtil;



public class VoyageDAO1  extends DAO<Voyage>{

	public VoyageDAO1() {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		// tx.commit();
	}

	@Override
	public boolean ajouter(Voyage obj) {
		session.save(obj);
		tx.commit();
		return true;
	}

	@Override
	public boolean supprimer(int id) {
		// TODO Auto-generated method stub
		Voyage n = (Voyage) session.get(Voyage.class, id);
		session.delete(n);
		tx.commit();
		return true;
	}

	//modification d'une voyage 
	@Override
	public boolean modifier(int id, Voyage voya) {
		// TODO Auto-generated method stub
		Voyage v = (Voyage) session.get(Voyage.class, id);
		v.setDateDepart(voya.getDateDepart());
		v.setDateArrivee(voya.getDateArrivee());
		v.setNbDispo(voya.getNbDispo());
		v.setPays(voya.getPays());
		v.setPrix(voya.getPrix());
		v.setVilleArrivee(voya.getVilleArrivee());
		v.setVilleDepart(voya.getVilleDepart());
		tx.commit();
		return true;
	}

	@Override
	public boolean afficher(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Voyage> afficherTout() {
		// TODO Auto-generated method stub
		ArrayList<Voyage> vs=new ArrayList<Voyage>();
		Query q = session.createQuery("from Voyage");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			vs.add((Voyage) i.next());
		}
		return vs;
	}

	@Override
	public boolean fermeture() {
		// TODO Auto-generated method stub
		session.close();
		HibernateUtil.shutdown();
		return true;
	}

	@Override
	public Voyage recuperer(int id) {
		Voyage v = new Voyage();
//		Query q = session
//				.createQuery("from Voyage voyage where voyage.idVoyage=" + id);
//		List l = q.list();
//		Iterator i = l.iterator();
//
//		while (i.hasNext()) {
//			v = (Voyage) i.next();
//		}
//		return v;
		
//		Criteria q =session.createCriteria(Client.class);
//		List l=q.list();
//		Iterator i=l.iterator();
//		while(i.hasNext()){
//			System.out.println(((Client)i.next()).getNomPrenom());
//		}
//
//		List<?> l=q.list();
//		Iterator<?> i=l.iterator();
//		session.close();
		Criteria q =session.createCriteria(Voyage.class);
		List l=q.list();
		Iterator i=l.iterator();
		while (i.hasNext()) {
			v = (Voyage) i.next();
		}
		return v;
		

		
	}

	@Override
	public boolean validerCnx(String l, String m) {
		// TODO Auto-generated method stub
		return false;
	}

}
