/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

/**
 *
 * Crea un programa que demani un número enter i utilitzant operadors d’assignació aritmètica (+=, -=...)  i només 1 variable a tot el programa, realitza les següents operacions:
- Multipliqui per 6 el número introduït. Mostra el resultat.
- Al resultat obtingut abans, se li resti 4. Mostra el nou resultat.
- El resultat obtingut abans, es divideix per 2 (divisió entera). Mostra el nou resultat.
- Indicar si el nombre és parell ( Spoiler: el mòdul 2 donaria zero  x%2 , és a dir el residu de qualsevol número parell entre 2 és 0  )

 */
public class ex5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introdueix un numero: ");
        a = scanner.nextInt();
        a *= 6;
        System.out.println("Després de multiplicar per 6 el resultat és" + a);
        a -= 4;
        System.out.println("Després de restar 4 el resultat és " + a);
        a /= 2;
        System.out.println("Després de dividir per 2 el resultat és "+ a);
        System.out.println("El nombre es parell? " + (a % 2 == 0));
        
    }
}
