/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet1.Tests;

/**
 *
 * @author Lenovo
 */
public class Voiture {
    // Attributs de la classe
   private String marque;
   private String modele;
    private int annee;
   private double vitesse;

    // Constructeur de la classe
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.vitesse=0;
    }

    // Méthode de la classe
    public void afficherDetails() {
        System.out.println("Marque: " + marque + ", Modèle: " + modele + ", Année: " + annee);
    }
    
    public void Demarer()
    {
        this.vitesse=10;        
    }
    
     public void Acceler(double acceleration)
    {
        ControlVistesse(acceleration,"a");
    }
    
    public void Freiner(double decceleration)
    {
        ControlVistesse(decceleration,"d");
      
    }
    
     public void TableauDeBord()
    {
        System.out.println("Vitesse: " + this.vitesse );
    }
     private void ControlVistesse(double v,String type)
     {
          if( this.vitesse-v>=0 && type=="d")
        {
           this.vitesse-=v;        
        }
        else if (this.vitesse+v<=100 && type=="a")
        {
             this.vitesse+=v;          
        }
        else
        {
            System.out.println("MAuvaise Manipulation");
        }
         
     }
}
