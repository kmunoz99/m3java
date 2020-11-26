/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a11_avaluacioexpressions;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Introdueix un enter: ");
        a = scanner.nextInt();
        System.out.println("Introdueix un altre enter: ");
        b = scanner.nextInt();
        boolean expressio1 = ((a > 0 && b > 0) && a * b < 20);
        boolean expressio2 = (a < 0 && b < 0 && a + b == -10);
        boolean expressio3 = (a > 0 && b < 0);
        System.out.println(expressio1 || expressio2 || expressio3);

        /*
        Crear un programa que demani dos nombres enters a l'usuari. Defineix UNA expressió 
        que doni com resultat el valor true quan almenys es compleixi una de les 3 condicions següents:
        Que tots dos siguin majors que 0 i la seva multiplicació sigui menor que 20
        Que tots dos siguin negatius i la seva suma sigui igual a -10
        Que el primer sigui positiu i el segon negatiu.


         */
    }

}
