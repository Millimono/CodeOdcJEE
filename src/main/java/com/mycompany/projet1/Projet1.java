/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet1;

import com.mycompany.projet1.Tests.CompteBancaire;
import com.mycompany.projet1.Tests.Voiture;

/**
 *
 * @author Lenovo
 */
public class Projet1 {
    String name = "Sory";
    
    //static int age=12;
    
    public static void main(String[] args) 
    {
   
        /*Voiture v1 = new Voiture("Renault","modele1",2022);
        v1.Demarer();
        v1.TableauDeBord();
        v1.Acceler(15.0);
        v1.TableauDeBord();
        v1.Freiner(30.0);
        v1.TableauDeBord();
        v1.Acceler(120.0);
        v1.TableauDeBord();*/
        
        CompteBancaire cb2 = new CompteBancaire("sory millimono");
        
        cb2.AfficherSolde();
         cb2.deposer(100000);
           cb2.retirer(20000000);
       


    }
    
    public static int somme(int a, int b) 
    {
        return a + b;
    }

}
