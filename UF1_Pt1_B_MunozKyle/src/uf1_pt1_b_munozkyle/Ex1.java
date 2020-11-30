/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_b_munozkyle;

/**
 *
 * @author lace22
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicialització variables
        short valorShort1, valorShort2;
        char valorChar1, valorChar2;
        long valorLong1;
        byte valorByte1, valorByte2, valorByte3;
        double valorDouble1;

        // Asignació variables
        valorShort1 = 10;
        valorShort2 = 2;
        valorChar1 = 'a';
        valorChar2 = 'b';
        valorLong1 = 2000;
        valorByte1 = 0;
        valorByte2 = 2;
        valorByte3 = 127;
        valorDouble1 = 3.2;

        //expressions
        int divisio1 = valorShort1 / valorShort2; //Apartat 1
        long valorUnicode = valorChar1 + valorChar2; // Apartat 2
        double operacio = (valorByte1 + valorLong1) / valorDouble1; //Apartat 3
        /*
        No es pot sumar valorByte2 a valorByte3 a la variable valorByte 1 
        perque el rang de un byte es de 0 a 127, i 127 mes 2 es pasa del rang
        es podría fer si valorByte1 no fos una variable de tipus byte
         */

        //Prints
        System.out.println("Apartat 1: \n" + divisio1);
        System.out.println("Apartat 2: \n" + valorUnicode);
        System.out.println("Apartat 3: \n" + operacio);

    }

}
