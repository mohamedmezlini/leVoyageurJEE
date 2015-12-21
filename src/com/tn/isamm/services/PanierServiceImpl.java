package com.tn.isamm.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.tn.isamm.beans.Client;
import com.tn.isamm.beans.Compte;
import com.tn.isamm.beans.Panier;
import com.tn.isamm.beans.Panier.Id;
import com.tn.isamm.beans.Voyage;
import com.tn.isamm.dao.ClientDAO;
import com.tn.isamm.dao.PanierDAO;
import com.tn.isamm.dao.VoyageDAO;

public class PanierServiceImpl   extends PanierService{

	private PanierDAO panierdao= new PanierDAO(); 

	@Override
	public boolean enregistrerPanier(HttpServletRequest request) {
		// TODO Auto-generated method stub

		return false;
	}	
	@Override
	public boolean ajouterAuPanier(HttpServletRequest request, Client c , Voyage v) {
		Integer nb = Integer.parseInt(request.getParameter("nb"));
		String etat= "0"; 

		Panier p= new Panier( etat, c, v, nb); 		

		p.setNb(p.getNb()+nb);

		// le calcul du prix
		if (nb>5) {p.setPrix(v.getPrix()*p.getNb()-v.getPrix()*p.getNb()*0.6);
		//cm.setSolde(cm.getSolde()-v.getPrix()*p.getNb()-v.getPrix()*p.getNb()*0.6);
		}
		else 	{	
			p.setPrix(v.getPrix()*p.getNb());
			//cm.setSolde(cm.getSolde()-v.getPrix()*p.getNb());


		}

		
		Id id = this.recupererPanier(c.getIdClient(), v.getIdVoyage()).getId(); 
		

		return panierdao.ajouter(p); 
	}

	@Override
	public boolean modifierPanier(HttpServletRequest request, Client c, Voyage v) {
		Integer nb = Integer.parseInt(request.getParameter("nb"));
		String etat= "0"; 

		//		
//		v.setNbDispo(v.getNbDispo()-nb);
//		v.setNbVendu(v.getNbVendu()+nb);
//		VoyageDAO  voyagedao= new VoyageDAO();
//		Compte cm= c.getCompte(); 
//		//cm.setClient(c);
//
//		c.setCompte(cm);		
//		ClientDAO cldao=new ClientDAO();
		//
		//		
		Panier p= new Panier( etat, c, v, nb); 	
		p.setNb(p.getNb()+nb);

		// le calcul du prix
		if (nb>5) {p.setPrix(v.getPrix()*p.getNb()-v.getPrix()*p.getNb()*0.6);
		//cm.setSolde(cm.getSolde()-v.getPrix()*p.getNb()-v.getPrix()*p.getNb()*0.6);
		}
		else 	{	
			p.setPrix(v.getPrix()*p.getNb());
			//cm.setSolde(cm.getSolde()-v.getPrix()*p.getNb());


		}

		
		Id id = this.recupererPanier(c.getIdClient(), v.getIdVoyage()).getId(); 
		//		
		//voyagedao.modifier(id.getIdVoyage(), v); 
		//cldao.modifierCompte(id.getIdClient(), c); 
		
		return panierdao.modifier(id, p); 

	}

	private Panier recupererPanier(Integer idClient, Integer idVoyage) {
		return panierdao.recuperer(idClient,idVoyage );
	}
	@Override
	public boolean supprimerPanier(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean afficherPanier(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Panier> afficherPaniers(int id) {

		return panierdao.afficherTout();
	}

	@Override
	public Panier recupererPanier(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client verifierCnx(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fermeture() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean modifierPanier(int id, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}
	public void supprimerPanier(int idcl, int idvo) {
		// TODO Auto-generated me
		panierdao.supprimer(this.recupererPanier(idcl, idvo).getId());
		
		
		
	}
	public boolean validerPanier(Client c, Voyage v) {
		// TODO Auto-generated method stub
		Panier p= this.recupererPanier(c.getIdClient(), v.getIdVoyage());
		if(Integer.parseInt(p.getEtat())!=1){
		p.setEtat("1");
		p.setDate(Date.valueOf(LocalDate.now()));
		int nb=p.getNb(); 
		 
		v.setNbDispo(v.getNbDispo()-nb);
		v.setNbVendu(v.getNbVendu()+nb);
		VoyageDAO  voyagedao= new VoyageDAO();
		Compte cm= c.getCompte(); 
		//cm.setClient(c);

		c.setCompte(cm);		
		ClientDAO cldao=new ClientDAO();
		//
		//		
			
		//p.setNb(p.getNb()+nb);

		// le calcul du prix
		if (nb>5) {p.setPrix(v.getPrix()*p.getNb()-v.getPrix()*p.getNb()*0.6);
		cm.setSolde(cm.getSolde()-v.getPrix()*p.getNb()-v.getPrix()*p.getNb()*0.6);
		}
		else 	{	
			p.setPrix(v.getPrix()*p.getNb());
			cm.setSolde(cm.getSolde()-v.getPrix()*p.getNb());


		}

		
		Id id = this.recupererPanier(c.getIdClient(), v.getIdVoyage()).getId(); 
		//		
		voyagedao.modifier(id.getIdVoyage(), v); 
		cldao.modifierCompte(id.getIdClient(), c); 
		panierdao.modifier(id, p);
		return true;
		}
		else return false; 
		 
		
		
	}
	


}
