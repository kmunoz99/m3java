/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.time.MonthDay;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex6 {

    public static void main(String[] args) {
        String fecha;
        Scanner scanner = new Scanner(System.in);
        MonthDay[] signoszodiaco
                = {MonthDay.of(12, 22), MonthDay.of(1, 20) //Capri
                    ,
                     MonthDay.of(1, 21), MonthDay.of(2, 19) //Aquari
                    ,
                     MonthDay.of(2, 20), MonthDay.of(3, 20) //Pisces
                    ,
                     MonthDay.of(3, 21), MonthDay.of(4, 19) //Aries
                    ,
                     MonthDay.of(4, 20), MonthDay.of(5, 20) //Taure
                    ,
                     MonthDay.of(5, 21), MonthDay.of(6, 21) //Geminis
                    ,
                     MonthDay.of(6, 22), MonthDay.of(7, 21)//Cancer
                    ,
                     MonthDay.of(7, 22), MonthDay.of(8, 21) //Lleo
                    ,
                     MonthDay.of(8, 22), MonthDay.of(9, 22) //Verge
                    ,
                     MonthDay.of(9, 23), MonthDay.of(10, 22) //Balanca
                    ,
                     MonthDay.of(10, 23), MonthDay.of(11, 21) //Escorpio
                    ,
                     MonthDay.of(11, 22), MonthDay.of(12, 21)}; //Sagitari
        String[] nombresStrings = {"Capricorn", "Capricorn", "Aquari", "Aquari",
            "Aquari", "Pisces", "Pisces", "Aries", "Aries", "Taure", "Taure",
            "Geminis", "Geminis", "Cancer", "Cancer", "Lleo", "Lleo", "Verge", "Verge",
            "Balanca", "Balanca", "Escorpio", "Escorpio", "Sagitari", "Sagitari"};

        System.out.println("Introduce una data en format dd/mm/yyyy");
        fecha = scanner.nextLine();
        if (fecha.length() != 10) {
            System.out.println("El formato de fecha tiene que ser dd/mm/yyyy");
            return;
        }
        String dayInput = fecha.substring(0, 2);
        String monthInput = fecha.substring(3, 5);
        String yearInput = fecha.substring(6, 10);
        int y = Integer.parseInt(yearInput);
        int m = Integer.parseInt(monthInput);  
        int d = Integer.parseInt(dayInput);

     
        MonthDay ld = MonthDay.of(m, d);
        for (int i = 0; i < 24;) {
            boolean is1After2 = signoszodiaco[i].isAfter(ld);
            boolean is2Before3 = ld.isBefore(signoszodiaco[i + 1]);
            boolean is2Between1And3 = is1After2 & is2Before3;
            if (is2Between1And3) {
                System.out.println("El teu signe es: " + nombresStrings[i]);
                break;
            }
            i = i + 2;

        }

    }

}
