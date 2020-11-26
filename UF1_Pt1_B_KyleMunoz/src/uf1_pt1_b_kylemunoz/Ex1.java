/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_b_kylemunoz;

/**
 *
 * @author lace22
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicialització variables
        int enterUno, enterDos;
        char charUno, charDos;
        enterUno = 12;
        enterDos = 6;
        charUno = 'A';
        charDos = 'Z';
        // Prints

        System.out.format("Primer Enter: %d Segon Enter: %d \n"
                + "Primer caracter: %c Segón caracter: %c \n",
                enterUno, enterDos, charUno, charDos);

        System.out.println("=============");

        System.out.println("El segon caracter va després que el "
                + "primer a l'abecedari? " + ((int) charUno < (int) charDos));

        System.out.format("El primer nombre es multiple de 3 i 4? %b "
                + "\n", (enterUno % 3 == 0) && (enterUno % 4 == 0));
        System.out.println("El doble d'algun dels 2 nombres es igual o mes gran"
                + " que 15? " + ((2 * enterUno >= 15) || (2 * enterDos >= 15)));

    }

}
