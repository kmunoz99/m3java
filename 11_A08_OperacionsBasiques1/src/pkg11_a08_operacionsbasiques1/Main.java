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
public class Main {

    /**
     Fer un programa que demani a l'usuari dos valors booleans i mostri per pantalla:
Exemple d'execució:
Introduir un booleà:
true
Introduir un altre booleà:
false
El resultat de fer true AND false és false
El resultat de fer true OR false és true

     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean boolUno, boolDos, resultadoUno, resultadoDos;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdueix un boolea");
        boolUno = scanner.nextBoolean();
        System.out.println("Introdueix un altre");
        boolDos = scanner.nextBoolean();
        resultadoUno = boolUno && boolDos;
        resultadoDos = boolUno || boolDos;
        System.out.format("El resultat de fer %b AND %b és %b \n", boolUno, boolDos, resultadoUno);
        System.out.format("El resultat de fer %b OR %b és %b \n", boolUno, boolDos, resultadoDos);
        
    }
    
}
