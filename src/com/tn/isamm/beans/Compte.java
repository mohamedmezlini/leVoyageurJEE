package com.tn.isamm.beans;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Embeddable
/*
 * @Entity
 * 
 * @Table(name = "compte")
 */
public class Compte {
	// private Integer idCompte;
	private Double solde;
	private Client client;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 * 
	 * @Column(name="idCompte") public Integer getIdCompte() { return idCompte;
	 * }
	 * 
	 * public void setIdCompte(Integer idCompte) { this.idCompte = idCompte; }
	 */
	@Basic(optional = false)
	@Column(name = "solde")
	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@org.hibernate.annotations.Parent
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", client=" + client + "]";
	}

	public Compte() {

	}

	public Compte(Double solde) {
		this.solde = solde;
	}

}
