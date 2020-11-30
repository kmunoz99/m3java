/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_b_munozkyle;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex3 {

    public static void main(String[] args) {
        final float enviamentExpress = 15;
        float importCompra;
        String expressioFinal, direccio;
        char opcioEnviament;

        //inicialitzacio scanner
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("** Finalitza la teva compra **\n Introdueix l'import"
                + " de la compra: ");
        importCompra = scanner.nextFloat();

        scanner.nextLine(); //LImpiar el buffer 
        System.out.println("introdueix l'adreça: ");
        direccio = scanner.nextLine();
        System.out.println("Escull l'opció d'enviament (a / b)\n\ta. Enviament "
                + "estàndar. Grauit\n\tb. Enviament express. Gratuit per compres"
                + " superiors a 50€");
        opcioEnviament = scanner.next().charAt(0);

        //Expressio
        expressioFinal = (opcioEnviament == 'a') ? "Enviament grauit."
                + " L'import total es l'import de la compra" : String.format("%s",
                        (opcioEnviament == 'b' && importCompra > 50)
                                ? "Enviament grauit. L'import total es l'import "
                                + "de la compra" : "Import de la compra: "
                                + importCompra + "€ Import "
                                + "total: " + (importCompra+enviamentExpress) + 
                                        "€");
        //No he arribat a una forma mes neta de fer un ternari dins un altre 

        System.out.println(expressioFinal);
    }
}
