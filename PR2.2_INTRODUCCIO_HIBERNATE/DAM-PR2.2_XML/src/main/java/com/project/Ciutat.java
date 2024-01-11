package com.project;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Ciutat implements Serializable {
    
      private long ciutatId;
      private String nom;  
      private String pais;
      private int codiPostal;


      

      public Ciutat() {}
    
      public Ciutat(String nom,String pais,
       int codiPostal) {
         this.nom = nom;
         this.pais = pais;
         this.codiPostal = codiPostal;
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

      public String getPais() {
         return pais;
      }

      public void setPais(String pais) {
         this.pais = pais;
      }

      public int getCodiPostal() {
         return codiPostal;
      }

      public void setCodiPostal(int codiPostal) {
         this.codiPostal = codiPostal;
      }

      public List<Object[]> queryItems () {
		   long id = this.getCiutatId();
		  return Manager.queryTable("SELECT DISTINCT i.cartId, i.name FROM Item i, Cart c WHERE c.cartId = i.cartId AND c.cartId = " + id);
	   }

      @Override
      public String toString() {
         return     nom + ", " + pais + ", " + codiPostal + ciutatId;
      }

     
 }