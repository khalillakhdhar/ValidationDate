/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validationdate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khali
 */
public class Validation {
    
    private int jour,mois,annee;
    private List<Integer> shortMonth=new ArrayList<Integer>();

    public Validation() {
        init();
    }

    public Validation(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        init();
    }

    
    
    
    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
   public void init()
   {
       shortMonth.add(4);
       shortMonth.add(6);
       shortMonth.add(9);
       shortMonth.add(11);
   }
   public boolean VerifJours()
   {
   if(this.mois==2)
   {
       if(this.getAnnee()%4==0)
       {
       if(jour<=29)
       return true;
       else
           return false;
       }
       
       else
       {
       if(jour<=28)
       return true;
       else
           return false;
       
       }
   }
   else if(shortMonth.contains(this.mois))
   {
   if(jour<=30)
       return true;
   else 
       return false;
   
   
   }
   else
   {
       if(jour<=31)
           return true;
       else 
           return false;
   
   
   }
   
   }
    
    
}
