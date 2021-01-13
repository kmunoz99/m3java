/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/**
 *
 Fer un programa en Java que demani dos nombres enters, diferents, per l'entrada 
 * estàndard. El programa ha d’indicar quin és més gran i si és múltiple de l’altre.
 */
public class Ex2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix un numero");
        a = scanner.nextInt();
        System.out.println("Introdueix un altre numero");
        b = scanner.nextInt();
        if (a>b){
            System.out.println(a + " es mes gran que " + b);
            if (a%b == 0){
                System.out.println(a + " es multiple de " + b);
            }
            else {
                System.out.println(a + " no es multiple de " + b);
            }
            
        }
        else {
            System.out.println(b + " es mes gran que " + a);
            if (b%a == 0){
                System.out.println(b + " es multiple de " + a);
            }
            else {
                System.out.println(b + " no es multiple de " + a);
            }
        }
    }
    
    
}
