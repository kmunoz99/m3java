/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Para el examen, hacer un switch
        switch(numMes)
        case 2:
            mes = Febrero
            if (isLeap)
            dias = 29;
        
        
 */
package pkg12_a03_seleccio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex3 {

    public static boolean isLeap(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || (x % 100 == 0 && x % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int numeroMes, year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de mes");
        numeroMes = scanner.nextInt();
        System.out.println("Introduce el año");
        year = scanner.nextInt();

        int[] intArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
        if (isLeap(year)) {
            intArray[2] = 29;
        }

        String[] strArray = {"No existe", "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre", "Este tampoco existe"};
        System.out.print("El mes numero " + numeroMes + " "
                + "(" + strArray[numeroMes] + ") tiene " + intArray[numeroMes]
                + " dias.");
        if (numeroMes == 0 || numeroMes == 13) {
            System.out.print(" (well duh).");
        }
        System.out.print("\n");

    }

}
