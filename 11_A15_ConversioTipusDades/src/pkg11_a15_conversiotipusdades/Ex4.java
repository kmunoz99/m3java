/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a15_conversiotipusdades;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex4 {
    public static void main(String[] args) {
        double valor;
        double valorFinal;
        final double percentatge = 21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio");
        valor = scanner.nextDouble();
        valorFinal = valor * (1 + percentatge / 100);
        System.out.println(valorFinal);
        
    }
}
