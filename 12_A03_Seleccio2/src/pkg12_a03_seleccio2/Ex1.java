/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Exercici1 Fer un programa que demani introduir 4 nombres enters (poden estar
 * repetits) i mostri: El valor més gran. El valor més petit. La mitjana
 * aritmètica amb decimals, dels 4 valors.
 */
public class Ex1 {

    public static void main(String[] args) {
        double mediana;
        int intArray[];
        intArray = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Introduce un numero: ");
            intArray[i] = scanner.nextInt();
        }
        mediana = (double) Arrays.stream(intArray).sum() / intArray.length;
        System.out.println("Mayor: " + intArray[0]);
        System.out.println("Menor: " + intArray[3]);
        System.out.println("Mediana: " + mediana);

    }

}
