package estructuresseleccio;

import java.util.Scanner;

public class E8SelecMultiple_SwichtCase_String {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String categoria;

        System.out.println(" Introduir la categoria:"
                + "\nSoci"
                + "\nSenior"
                + "\nJunior");
        categoria = lector.next().toUpperCase();

        switch (categoria) {
            // tipus String com a variable patró
            case "SOCI":
                System.out.println("Categoria: Soci");
                break;

            case "SENIOR":
                System.out.println("Categoria: Senior");
                break;

            case "JUNIOR":
                System.out.println("Categoria: Junior");
                break;

            default:
                System.out.println("Categoria incorrecta");
        }
    }
}
