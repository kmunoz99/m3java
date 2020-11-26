/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a05_formatsortida2_descomptes;

import java.io.PrintStream;

/**
 *Escriu un programa Java que realitzi el següent:

Hi ha una botiga que està fent una oferta de descompte de l'IVA 
* en certes peces.
Totes les samarretes porten aquest descompte, els pantalons, en canvi, 
* porten un descompte del 15%, les sabates del 5% i la resta d’articles 
* de la botiga no tenen descompte.

 * @author lace22
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preuSamarreta, preuSamarretaNoIva, descompteSamarreta,
                preuPantalo, preuPantaloDescompte, descomptePantalo,
                preuSabates, preuSabatesDescompte, descompteSabates,
                descompteTotal;
        //Samarreta
        preuSamarreta = 100.00;
        preuSamarretaNoIva = (preuSamarreta) / 1.21;
        descompteSamarreta = preuSamarreta - preuSamarretaNoIva;
        //Pantalo
        preuPantalo = 50.00;
        descomptePantalo = preuPantalo*0.15;
        preuPantaloDescompte = preuPantalo - descomptePantalo;
        //Sabates
        preuSabates = 60.00;
        descompteSabates = preuSabates * 0.05;
        preuSabatesDescompte = preuSabates - descompteSabates;
        //Tottal
        descompteTotal = descompteSamarreta + 
                descomptePantalo + descompteSabates;
        //Prints
        System.out.format("El preu de la samarreta és %.2f€, el preu"
                + " sense IVA és de %.2f€ i m’he estalviat %.2f€ \n", 
                preuSamarreta,preuSamarretaNoIva, descompteSamarreta);
        System.out.printf("També m’he comprat un pantaló de %.2f€ per %.2f€ i unes sabates de %.2f€ per %.2f€ \n", preuPantalo, preuPantaloDescompte, preuSabates, preuSabatesDescompte);
        System.out.printf("En total m’he estalviat %.2f€. \n", descompteTotal);
        
            
    }
    
}
