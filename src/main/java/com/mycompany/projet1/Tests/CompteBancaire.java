/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet1.Tests;

/**
 *
 * @author Lenovo
 */
public class CompteBancaire 
{
    private String titulaire;

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public String getTitulaire() {
        return titulaire;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" + "titulaire=" + titulaire + ", solde=" + solde + '}';
    }
    private double solde;
    
    public CompteBancaire(String titulaire)
    {
        this.solde=50000;
        this.titulaire=titulaire;    
    }
    
    public void deposer(double montant)
    {
      ControleurOperation(montant,"d");
    }
    
    public void retirer(double montant)
    {
        ControleurOperation(montant,"r"); 
    }
    
    public void AfficherSolde()
    {
      System.out.println("Solde Actuel : "+this.solde);
    }
    
    private void ControleurOperation(double m,String type)
    {
        if(m>=0 )
        {
             if(m <=10000000 && type=="d")
            {
                    this.solde+=m;
                    System.out.println("Operation de Depot "
                            + "effectuée avec succès");
                    AfficherSolde();    
            }
             else if(m >=10000000 && type=="d")
            {     
                 System.out.println("Operation Refusée"); 
                 System.out.println("Controle Judiciaire Requise,"
                        + "veuillez voir Gestionnaire de Compte");    
            }
             
            if( (this.solde-m>=0) && type=="r")
            {
                this.solde-=m;
                System.out.println("Operation de Retrait "
                        + "effectuée avec succès");
                AfficherSolde();
            }
            else if( (this.solde-m<=0) && type=="r")
            {
                System.out.println("Operation de Retrait "
                        + "Refusé la police a été alertée");
                
            }

            
        }
    }
    
}
