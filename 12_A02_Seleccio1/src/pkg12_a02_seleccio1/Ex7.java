/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/*
 * Crear un programa que simuli una calculadora aritmètica utilitzant una
 * estructura switch-case: es mostra un menú amb les quatre operacions
 * aritmètiques ( suma, resta, multiplicació i divisió), perquè l'usuari en trii
 * una (verificar dada). es demana els valors dels dos operands. No es demanen
 * els operands si l'opció no és correcta (es mostra un missatge adient) es
 * mostra l'operació feta i el resultat. en el cas de la divisió, s'haurà de
 * comprovar que el segon operand no sigui zero.
 *
 */
public class Ex7 {

    public static void suma(int n1, int n2) {
        System.out.println("El resultado de sumar " + n1 + " y " + n2 + " es igual a " + (n1 + n2));
    }

    public static void resta(int n1, int n2) {
        System.out.println("El resultado de restar " + n1 + " y " + n2 + " es igual a " + (n1 - n2));
    }

    public static void mult(int n1, int n2) {
        System.out.println("El resultado de multiplicar " + n1 + " por " + n2 + " es igual a " + (n1 * n2));
    }

    public static void div(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("No es pot dividir entre 0");
        } else {
            System.out.println("El resultado de dividir " + n1 + " entre " + n2 + " es igual a " + (n1 / n2));
        }
    }

    public static void main(String[] args) {
        int x, y;
        char opcion;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion\n ==============================="
                + "\n\tA. Suma\n\tB. Resta\n\tC. Multiplicació\n\tD. Division");
        opcion = scanner.nextLine().toUpperCase().charAt(0);
        switch (opcion) {
            case 'A':
                System.out.println("Introduce dos numeros");
                x = scanner.nextInt();
                y = scanner.nextInt();
                suma(x, y);
                break;
            case 'B':
                System.out.println("Introduce dos numeros");
                x = scanner.nextInt();
                y = scanner.nextInt();
                resta(x, y);
                break;
            case 'C':
                System.out.println("Introduce dos numeros");
                x = scanner.nextInt();
                y = scanner.nextInt();
                mult(x, y);
                break;
            case 'D':
                System.out.println("Introduce dos numeros");
                x = scanner.nextInt();
                y = scanner.nextInt();
                div(x, y);
                break;
            default:
                System.out.println("La opcion " + opcion + " no existe");
        }

    }
}
