package estructuresseleccio;

import java.util.Scanner;

public class E3SeleccioDoble2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat;

        System.out.println("Introduir una edat: ");
        edat = lector.nextInt();

        // Selecció doble (if-else), i anidat (hi ha un subnivell: mira la tabulació)
        if (edat >= 18) {
            if (edat < 65) {
                System.out.println("És major d'edat, no jubilada");
            } else {
                System.out.println("És major d'edat, jubilada");
            }

        } else {
            System.out.println("No és major d'edat");
        }
    }

}
