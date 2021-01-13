/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex4 {
    public static boolean isLeap(int x){
            if ((x % 4 == 0 && x % 100 != 0) || (x % 100 == 0 && x % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String fecha,diaString,mesString,yearString;
        int dia,numeroMes, year;
        boolean leapYear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una data en format dd/mm/yyyy");
        fecha = scanner.nextLine();
        if (fecha.length()!= 10){
            System.out.println("El formato de fecha tiene que ser dd/mm/yyyy");
            return;      
        }
        diaString = fecha.substring(0,2);
        mesString = fecha.substring(3,5);
        yearString = fecha.substring(6,10);
        dia = Integer.parseInt(diaString);
        numeroMes = Integer.parseInt(mesString);
        year = Integer.parseInt(yearString);


        int[] intArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,0};
        if (isLeap(year)) {
            intArray[2] = 29;
        }

        String[] strArray = {"No existe", "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre", "Este tampoco existe"};
               if (numeroMes > 12){
            System.out.println("El mes ha de ser entre 1 i 12");
            return;
        
        }
        if (dia > intArray[numeroMes]){
            System.out.println("El dia ha de ser entre 1 i " + intArray[numeroMes]);
            return;
        
        }

        System.out.print("Data Verificada: "+ dia + " de "+ strArray[numeroMes] + " de " + year + intArray[numeroMes]
                + " dias.");
        if (numeroMes == 0 || numeroMes == 13) {
            System.out.print(" (well duh).");
        }
        System.out.print("\n");
        
    }

}
