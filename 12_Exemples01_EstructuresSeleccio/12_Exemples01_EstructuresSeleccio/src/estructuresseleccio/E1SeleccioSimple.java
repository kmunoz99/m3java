package estructuresseleccio;

import java.util.Scanner;

public class E1SeleccioSimple {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat;

        System.out.println("Introduir una edat: ");
        edat = lector.nextInt();

        if (edat >= 18) {
            System.out.println("És major d'edat");
        }

        // són 2 if independents: s'avaluen les 2 condicions
        if (edat < 18) {
            System.out.println("No és major d'edat");
        }

    }

}
