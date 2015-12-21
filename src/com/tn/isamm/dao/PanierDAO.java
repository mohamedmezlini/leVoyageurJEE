package com.tn.isamm.dao;

import java.util.ArrayList;
import com.tn.isamm.beans.Panier;
import com.tn.isamm.beans.Panier.Id;
import com.tn.isamm.beans.Voyage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Compte;
import com.tn.isamm.persistance.HibernateUtil;



public class PanierDAO extends DAO<Panier>  {
	private Panier p;
	
	
	public PanierDAO() {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		// tx.commit();
	}

	public Panier getP() {
		return p;
	}

	public void setP(Panier p) {
		this.p = p;
	}


	@Override
	public boolean ajouter(Panier obj) {
		//obj.setCompte(compte);
		session.save(obj);
		tx.commit();
		return true;
	}

	
	public boolean supprimer(Id id) {
		Panier c = (Panier) session.get(Panier.class, id);
		session.delete(c);
		tx.commit();
		return true;
	}

	
	public boolean modifier(Id id, Panier panier) {
		Panier p = (Panier) session.get(Panier.class, id);
		p.setEtat(panier.getEtat());
		p.setDate(panier.getDate());
		p.setNb(panier.getNb());
		p.setPrix(panier.getPrix());
		tx.commit();
		return true;
	
	}

	@Override
	public boolean afficher(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Panier> afficherTout() {
		
//		Criteria q =session.createCriteria(Panier.class)
//				.createAlias("client", "c")
//				.add(Restrictions.eq("c.idClient",));
//
//List l=q.list();
//Iterator i=l.iterator();
//while(i.hasNext()){
//
//}
		
		
		ArrayList<Panier> vs=new ArrayList<Panier>();
		Query q = session.createQuery("from Panier ");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			vs.add((Panier) i.next());
		}
		return vs;
	}	
	public ArrayList<Panier> afficherTout(int id) {

		
		
		ArrayList<Panier> vs=new ArrayList<Panier>();
		Query q = session.createQuery("from Panier where idClient="+id);
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			vs.add((Panier) i.next());
		}
		return vs;
	}

	@Override
	public boolean fermeture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Panier recuperer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validerCnx(String l, String m) {
		// TODO Auto-generated method stub
		return false;
	}

	public Panier recuperer(Integer idClient, Integer idVoyage) {
		// TODO Auto-generated method stub
		Panier vs=new Panier();
		Query q = session.createQuery("from Panier where idclient='"+idClient+"' and  idVoyage='"+idVoyage+"'");
		List l = q.list();
		Iterator i = l.iterator();

		while (i.hasNext()) {
			vs=(Panier) i.next();
		}
		return vs;
	}

	@Override
	public boolean modifier(int id, Panier obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
