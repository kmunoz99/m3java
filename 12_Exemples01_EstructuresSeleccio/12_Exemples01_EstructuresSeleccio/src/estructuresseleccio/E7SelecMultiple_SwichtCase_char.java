package estructuresseleccio;

import java.util.Scanner;

public class E7SelecMultiple_SwichtCase_char {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char categoria;
        
        System.out.println(" Introduir la lletra de la categoria:"
                + "\nA. Soci"
                + "\nB. Senior"
                + "\nC. Junior");
        categoria = lector.next().toUpperCase().charAt(0);

        switch (categoria) {
            // tipus char com a variable patró
            case 'A':
                System.out.println("Categoria: A");
                break;
            case 'B':
                System.out.println("Categoria: B");
                break;
            case 'C':
                System.out.println("Categoria: C");
                break;
            default:
                System.out.println("Categoria incorrecta");
        }

    }

}
