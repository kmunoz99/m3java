/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex6 {
    public static void main(String[] args) {
      String fecha;
      Scanner scanner = new Scanner(System.in);
         System.out.println("Introduce una data en format dd/mm/yyyy");
        fecha = scanner.nextLine();
        if (fecha.length()!= 10){
            System.out.println("El formato de fecha tiene que ser dd/mm/yyyy");
            return;      
        }
        String dayInput = fecha.substring(0,2);
        String monthInput = fecha.substring(3,5);
        String yearInput = fecha.substring(6,10);
int y = Integer.parseInt( yearInput );
int m = Integer.parseInt( monthInput );  // 1-12 for January-December.
int d = Integer.parseInt( dayInput );

LocalDate ld = LocalDate.of( y , m , d );
LocalDate ld2 = LocalDate.of(1999, 03, 13);
System.out.println(ld.compareTo(ld2));
if (ld.compareTo(ld2) > 0){
    System.out.println("Date1 is after Date2");

} else if (ld.compareTo(ld2) < 0){
    System.out.println("Date1 is before Date2");
    System.out.println(ld.compareTo(ld2));

}
else if (ld.compareTo(ld2) == 0){
    System.out.println("Date1 is before Date2");

}

        System.out.println(ld);
    }
    
}
