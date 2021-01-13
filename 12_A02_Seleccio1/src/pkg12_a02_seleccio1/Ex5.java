/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/**
Exercici5
Crear un programa que demani entrar el dia de la setmana i mostri si és laborable o no laborable (dissabte i diumenge)

 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;
        System.out.println("Introdueix el dia de la setmana");
        dia = scanner.nextLine().toUpperCase();
        switch (dia) {
            case "DISSABTE":
                System.out.println("Es no laborable");
                break;
            case "DIUMENGE":
                System.out.println("Es no laborable");
                break;
            default:
                System.out.println("Es laborable");
        }
                
    }
    
}
