/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduir el primer número: ");
        a = scanner.nextInt();
        System.out.println("Introduir el segon número: ");
        b = scanner.nextInt();
        String imprimible = String.format("La suma de %d i %d es menor o igual a 10 i a la vegada el seu producte es major o igual que 20? %b", a,b,(a+b <=10 && a*b >=20 ));
        System.out.println(imprimible);
        System.out.format("Els nombres %d i %d son iguals? %b",a,b,(a==b));
    }

        
}
