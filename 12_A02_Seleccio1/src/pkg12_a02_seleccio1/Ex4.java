/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/*
Exercici4
Fer un programa llegeixi els tres costats d’un triangle i indiqui si poden o no formar un triangle.
Perquè tres segments puguin formar un triangle, sempre cadascuna de les sumes de dos dels seus costats ha de ser més gran que la mida del tercer costat.
Per exemple:
c1=5, c2=1, c3=2  no formen un triangle perquè 2+1<5
c1=5, c2=4, c3=2 sí que formen un triangle perquè 2+4>5, 2+5>4 i 5+4>2.

 */
public class Ex4 {

    public static void main(String[] args) {
        int a, b, h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix tres numeros");
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();
        if (a + b < h || a + h < b || b + h < a) {
            System.out.println("No es pot construir el triangle");

        } else {
            System.out.println("Si es pot construir el triangle");
        }

    }
}
