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
public class ex2 {
    public static void main(String[] args) {
        float kilometres, velocitat, tempsTotal;
        boolean mesUnDia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduir la distància en Km:");
        kilometres = scanner.nextFloat();
        System.out.println("Introduir la velocitat en Km/h::");
        velocitat = scanner.nextFloat();
        tempsTotal = kilometres / velocitat;
        mesUnDia = tempsTotal > 24;
        System.out.println(tempsTotal + "," + mesUnDia);
        
    }
}
