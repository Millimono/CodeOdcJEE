/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet1;

import com.mycompany.projet1.Tests.Chat;
import com.mycompany.projet1.Tests.CompteBancaire;
import com.mycompany.projet1.Tests.Voiture;
import com.mycompany.projet1.Tests.Chien;
import com.mycompany.projet1.Tests.Mathematique;

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
        
        /*CompteBancaire cb2 = new CompteBancaire("sory millimono");
        
        System.out.println(cb2.toString());
        
        cb2.AfficherSolde();
        cb2.deposer(100000);
        cb2.retirer(20000000);
        System.out.println("Titulaire Actuel : "+cb2.getTitulaire());
        cb2.setTitulaire("sory 2 ");
        System.out.println("Titulaire Actuel : "+cb2.getTitulaire());

        System.out.println(cb2.toString());*/
        Chien monChien = new Chien();
        monChien.respirer();  // Hérité de la classe Animal
        monChien.FaireSon();   // Défini dans la classe Chien

        Chat monChat = new Chat();
        monChat.respirer();  // Hérité de la classe Animal
        monChat.FaireSon();
        
        /*Mathematique calcul = new Mathematique();
        
        System.out.println(calcul.multiplier(12, 5));
        System.out.println(calcul.multiplier(12.6, 5));*/
        
        




    }
    
    public static int somme(int a, int b) 
    {
        return a + b;
    }

}
