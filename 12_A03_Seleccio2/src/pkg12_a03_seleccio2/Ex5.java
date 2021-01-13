/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Calendar;




/**
 *
 * @author lace22
 */
public class Ex5 {
    public static void main(String[] args) {
        int dia, mes, any;
        int[] intArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,0};
        Calendar dataActual = Calendar.getInstance();

        dia = dataActual.get(Calendar.DAY_OF_MONTH);
        mes = dataActual.get(Calendar.MONTH)+1;
        if (dia == intArray[mes]){
            mes++;
            dia=0;
        }
        any = dataActual.get(Calendar.YEAR);  
        System.out.println(dia+1+"/"+mes+"/"+any);
    }

}
