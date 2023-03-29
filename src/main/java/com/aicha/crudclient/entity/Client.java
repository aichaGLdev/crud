package com.aicha.crudclient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LISTE_CLIENT")
public class Client {
	@Id
    @GeneratedValue
    private int id;
    private String name;
    private String prenom;
    private String secteur;
    private String metier;
    private String adresse;
    private int age;
    private double num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	public String getMetier() {
		return metier;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
    
   

}
