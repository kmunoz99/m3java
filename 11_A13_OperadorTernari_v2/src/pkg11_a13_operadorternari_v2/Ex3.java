/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a13_operadorternari_v2;

import java.util.Scanner;

/**
 Ex4
Una Autoescola vol captar clients per la franja horària 
* menys sol·licitada actualment. Després de fer un estudi de mercat
* , han decidit fer un descompte als clients que compleixin algunes condicions. 

El descompte s'aplicarà sobre el preu de la matrícula si el client és més jove de 25
* anys i  té disponibilitat horària a la Franja 1 (de 9 a 12h),
* i a més no ha estat matriculat prèviament 
* (controla aquesta dada amb el booleà matriculaPrevia).
* 
* 
* la teva matrícula té descompte! Només et costarà 74,00 € 
* 
* 
* 
* 
* ho sentim, no tens descompte a la matrícula. L'import és 89,00 €

 */
public class Ex3 {
    public static void main(String[] args) {
        boolean matriculaPrevia, dispHoraria;
        String nom, resultado;
        int edat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nom = scanner.nextLine();
        System.out.println("Introduce tu edad: ");
        edat = scanner.nextInt();
        System.out.println("té disponibilitat horària a la Franja 1 (de 9 a 12h)?");
        dispHoraria = scanner.nextBoolean();
        System.out.println("Has estado matriculado antes?");
        matriculaPrevia = scanner.nextBoolean();

        resultado = String.format("%s", 
                ((edat<25 && dispHoraria && !matriculaPrevia)?
                        "la teva matrícula té descompte! Només et costarà 74,00"
                                + " € ":"ho sentim, no tens descompte a la matrícula."
                                        + " L'import és 89,00 €"));
        System.out.println("Hola "+ nom +", "+resultado);
        
    }
   
}
