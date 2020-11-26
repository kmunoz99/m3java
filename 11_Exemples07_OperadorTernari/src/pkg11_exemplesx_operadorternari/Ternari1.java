package pkg11_exemplesx_operadorternari;

/*
Programa que diu si és major d'edat o menor d'edat
 */
public class Ternari1 {

    public static void main(String[] args) {

        int edat = 15;
        String resultat;

        // expressio1 ? expressio2 : expressio3
        // expressio1 ? si expressio1 és true : si expressio1 és false
        resultat = (edat >= 18) ? "És major d'edat" : "És menor d'edat";

        System.out.println(resultat);

    }

}
