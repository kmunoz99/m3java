/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex5 {

    /*
    public static boolean isLeap(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || (x % 100 == 0 && x % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }*/
    public static void main(String[] args) {
        int dia, mes, any, dias, segundos;
        Instant instant;
        long timeStampSeconds;
        Scanner scanner = new Scanner(System.in);
        //int[] intArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};

        Calendar dataActual = Calendar.getInstance();
        instant = Instant.now();
        timeStampSeconds = instant.getEpochSecond();

        System.out.println("Introduce los segundos");
        segundos = scanner.nextInt();
        DateFormat horaas = new SimpleDateFormat("HH:mm:ss");
        DateFormat estampa = new SimpleDateFormat("dd/MM/yyyy");
        String horaFormato = horaas.format((timeStampSeconds + segundos) * 1000L);
        String estampaFormato = estampa.format((timeStampSeconds + segundos) * 1000L);
        System.out.println("De aqui a " + segundos + " segundos serán las " + horaFormato + " del " + estampaFormato);

        dia = dataActual.get(Calendar.DAY_OF_MONTH);
        mes = dataActual.get(Calendar.MONTH) + 1;
        any = dataActual.get(Calendar.YEAR);
        //dia = 32;
        //mes = 12;
        //any = 2020;
        switch (mes) {
            case 2:
                if ((any % 4 == 0 && any % 100 != 0) || (any % 100 == 0 && any
                        % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                dias = 31;
        }
        if (dia > dias) {
            System.out.println("El dia " + dia + " del " + mes + " no existe");
            return;
        } else if (dia == dias && mes == 12) {
            mes = 1;
            dia = 1;
            any++;
        } else if (dia == dias) {
            mes++;
            dia = 1;
        } else {
            dia++;
        }
        String fecha = String.format("%02d/%02d/%04d ", dia, mes, any);

        System.out.println("Mañana es: " + fecha);

    }

}
