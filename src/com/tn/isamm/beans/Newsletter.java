package com.tn.isamm.beans;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newsletter")
public class Newsletter {
	private Integer idNewsletter;
	private String mail;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdNewsletter() {
		return idNewsletter;
	}

	public void setIdNewsletter(Integer idNewsletter) {
		this.idNewsletter = idNewsletter;
	}

	@Basic(optional = false)
	@Column(name = "mail",unique=true)
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Newsletter() {

	}

	public Newsletter(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Newsletter [idNewsletter=" + idNewsletter + ", mail=" + mail
				+ "]";
	}

}
