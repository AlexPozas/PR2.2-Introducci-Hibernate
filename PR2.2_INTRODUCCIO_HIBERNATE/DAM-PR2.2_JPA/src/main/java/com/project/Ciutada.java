
package com.project;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Ciutada")
public class Ciutada implements Serializable {

	@Id
	@Column(name = "ciutadaId", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO) // L'id es genera automàticament
	private long ciutadaId;


	@Column(name = "nom")
      private String nom;  

      @Column(name = "cognom")
      private String cognom; 

      @Column(name = "edat")
      private int edat; 


	  @Column(name = "ciutatId")
      private long ciutatId; 


	
	
	  public Ciutada() { }

	  public Ciutada(long ciutatId,String nom,String cognom,int edat) {
		  this.ciutatId = ciutatId;
		  this.nom = nom;
		  this.cognom = cognom;
		  this.edat = edat;
		  
	  }
  
	  public long getCiutadaId() {
		  return ciutadaId;
	  }
  
	  public void setCiutadaId(long ciutadaId) {
		  ciutadaId = ciutadaId;
	  }
  
	  public long getCiutatId() {
		  return ciutatId;
	  }
  
	  public void setCiutatId(long ciutatId) {
		  this.ciutatId = ciutatId;
	  }
  
	  public String getNom() {
		  return nom;
	  }
  
	  public void setNom(String nom) {
		  this.nom = nom;
	  }
  
	  public String getCognom() {
		  return cognom;
	  }
  
	  public void setCognom(String cognom) {
		  this.cognom = cognom;
	  }
  
	  public int getEdat() {
		  return edat;
	  }
  
	  public void setEdat(int edat) {
		  this.edat = edat;
	  }
  
	  @Override
	  public String toString() {
		  return    nom +" " + cognom
		  +" " + edat + " - " + ciutatId;
	  }
  
  
  
}