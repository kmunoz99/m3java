package estructuresseleccio;

import java.util.Scanner;

public class E2SeleccioDoble {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat;

        System.out.println("Introduir una edat: ");
        edat = lector.nextInt();

        // funciona igual que l'operador ternari
        if (edat >= 18) {
            System.out.println("És major d'edat");
            
        } else {
            System.out.println("No és major d'edat");
        }
    }

}
