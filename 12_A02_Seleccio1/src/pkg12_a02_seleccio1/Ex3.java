package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        /*
        String x, opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Programa de Caixer Automatic **");
        System.out.println("\t A. Extreure\n\t B. Ingresar\n\t C. Ultims moviments\n\t D. Sortir del menu");
        System.out.println("Introdueix l'opció desitjada (a-d)");
        x = scanner.nextLine().toUpperCase();
        switch (x){
            case "A":
                opcion ="Extreure";
                break;
            case "B":
                opcion ="Ingresar";
                break;
            case "C":
                opcion ="Ultims moviments";
                break;
            case "D":
                opcion ="Sortir del Menu";
                break;
            default:
                opcion = "Incorrecta";}
        System.out.println("Opció desitjada " + opcion);
         */
        char x;
        String opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Programa de Caixer Automatic **");
        System.out.println("\t A. Extreure\n\t B. Ingresar\n\t C. Ultims moviments\n\t D. Sortir del menu");
        System.out.println("Introdueix l'opció desitjada (a-d)");
        x = scanner.nextLine().toUpperCase().charAt(0);
        if (x == 'A') {
            opcion = "Extreure";
        } else if (x == 'B') {
            opcion = "Ingresar";
        } else if (x == 'C') {
            opcion = "Ultims moviments";
        } else if (x == 'D') {
            opcion = "Sortir del Menu";
        } else {
            opcion = "Incorrecta";
        }
        System.out.println("Opció desitjada " + opcion);
    }
}
