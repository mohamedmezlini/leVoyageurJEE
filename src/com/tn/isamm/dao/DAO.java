package com.tn.isamm.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tn.isamm.beans.Client;


public abstract class DAO <O>{
	protected Transaction tx = null;
	protected Session session = null;
	public abstract boolean ajouter(O obj);
	public abstract boolean supprimer(int id);
	public abstract boolean modifier(int id,O obj);
	public abstract boolean afficher(int id);
	public abstract ArrayList<O> afficherTout();
	public abstract boolean fermeture();
	public abstract O recuperer(int id);
	public abstract boolean validerCnx(String l,String m);
}
