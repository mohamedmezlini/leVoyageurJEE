package com.tn.isamm.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "client")
public class Client {
	private Integer idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String tel;
	private String cin;
	private String login;
	private String mdp;
	private Integer role; // client : role=0, admin : role=1
	private Integer age; 
	private String sex; 
	@Embedded
	private Compte compte;
	Set<Contact> contacts = new HashSet<Contact>();
	Set<Voyage> voyages = new HashSet<Voyage>();
	private Set<Panier> paniers = new HashSet<Panier>();

	@OneToMany(mappedBy = "client")
	public Set<Panier> getPaniers() {
		return paniers;
	}

	public void setPaniers(Set<Panier> paniers) {
		this.paniers = paniers;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	@Basic(optional = false)
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Basic(optional = false)
	@Column(name = "sex")
	public String getSex() {
		return nom;
	}

	public void setSex(String sex) {
		this.nom = sex;
	}
	
	@Basic(optional = false)
	@Column(name = "prenom")
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Basic(optional = false)
	@Column(name = "adresse")
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Basic(optional = false)
	@Column(name = "mail", unique = true)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Basic(optional = false)
	@Column(name = "telephone")
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Basic(optional = false)
	@Column(name = "age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Basic(optional = false)
	@Column(name = "cin", unique = true)
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Basic(optional = false)
	@Column(name = "login", unique = true)
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Basic(optional = false)
	@Column(name = "mdp")
	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Basic(optional = false)
	@Column(name = "role")
	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REMOVE }, orphanRemoval = true)
	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

	@ManyToMany
	@JoinTable(name = "client_voyage", joinColumns = { @JoinColumn(name = "idClient") }, inverseJoinColumns = { @JoinColumn(name = "idVoyage") })
	public Set<Voyage> getVoyages() {
		return voyages;
	}

	public void setVoyages(Set<Voyage> voyages) {
		this.voyages = voyages;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Client() {

	}

	public Client(String nom, String prenom, String adresse, String mail,
			String tel, String cin, String login, String mdp, Integer role , String sex, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.tel = tel;
		this.cin = cin;
		this.login = login;
		this.mdp = mdp;
		this.role = role;
		this.sex=sex; 
		this.age=age; 
	}
	
	public Client(String nom, String prenom, String adresse, String mail,
			String tel, String cin, String login, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.tel = tel;
		this.cin = cin;
		this.login = login;
		this.mdp = mdp;
	}

	

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom="
				+ prenom + ", adresse=" + adresse + ", mail=" + mail + ", tel="
				+ tel + ", cin=" + cin + ", login=" + login + ", mdp=" + mdp
				+ ", role=" + role + "]";
	}

}
