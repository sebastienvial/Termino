package com.kcs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Termino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String domaine;
    private String sdomaine;
    private String fr;
    private String gramcatfr;
    private String deffr;
    private String frsyn1;
    private String frsyn2;
    private String frsyn3;
    
	public Termino(String domaine, String sdomaine, String fr, String gramcatfr, String deffr, String frsyn1,
			String frsyn2, String frsyn3) {
		super();
		this.domaine = domaine;
		this.sdomaine = sdomaine;
		this.fr = fr;
		this.gramcatfr = gramcatfr;
		this.deffr = deffr;
		this.frsyn1 = frsyn1;
		this.frsyn2 = frsyn2;
		this.frsyn3 = frsyn3;
	}

	public Termino() {
		super();
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getSdomaine() {
		return sdomaine;
	}

	public void setSdomaine(String sdomaine) {
		this.sdomaine = sdomaine;
	}

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getGramcatfr() {
		return gramcatfr;
	}

	public void setGramcatfr(String gramcatfr) {
		this.gramcatfr = gramcatfr;
	}

	public String getDeffr() {
		return deffr;
	}

	public void setDeffr(String deffr) {
		this.deffr = deffr;
	}

	public String getFrsyn1() {
		return frsyn1;
	}

	public void setFrsyn1(String frsyn1) {
		this.frsyn1 = frsyn1;
	}

	public String getFrsyn2() {
		return frsyn2;
	}

	public void setFrsyn2(String frsyn2) {
		this.frsyn2 = frsyn2;
	}

	public String getFrsyn3() {
		return frsyn3;
	}

	public void setFrsyn3(String frsyn3) {
		this.frsyn3 = frsyn3;
	}
    
}
