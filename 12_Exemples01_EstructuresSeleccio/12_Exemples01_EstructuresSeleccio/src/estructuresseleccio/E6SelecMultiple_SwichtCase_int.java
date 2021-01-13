package estructuresseleccio;

import java.util.Scanner;

public class E6SelecMultiple_SwichtCase_int {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int categoria;
        int sou = 1400;

        System.out.println(" Introduir el número de la categoria:"
                + "\n1. Soci"
                + "\n2. Senior"
                + "\n3. Junior");
        categoria = lector.nextInt();

        switch (categoria) {
            // variable int com a patró
            // Ha de ser un valor concret, no pot ser un rang (de 18 a 65 anys, no)
            case 1:
                sou *= 3;
                break;
            case 2:
                sou *= 2;
                break;
            case 3:
                sou /= 2;
                break;
            default:
                sou += 200;
        }
        
        System.out.println("El sou en euros d'aquesta categoria és " + sou);
    }
}
