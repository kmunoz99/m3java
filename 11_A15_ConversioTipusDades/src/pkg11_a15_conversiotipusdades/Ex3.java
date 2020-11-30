/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a15_conversiotipusdades;

/**
 *
 * @author lace22
 *
 * Guarda a una variable el resultat de valorByte1 / valorByte2 sense fer cap
 * conversió explícita (casting) Guarda a una variable el resultat de valorChar1
 * + valorChar2 sense fer cap conversió explícita (casting) Guarda a una
 * variable de tipus int el resultat de valorLong1 * valorLong2 Guarda a una
 * variable el resultat de (valorByte1 * valorLong2) / valorDouble1 sense fer
 * cap conversió explícita (casting) Guarda a una variable de tipus float el
 * resultat de: (valorByte1 * valorLong2) / valorDouble1 Indica el tipus de la
 * variable result6 (RAONA LA RESPOSTA): result6 = valorChar1*valorFloat1 +
 * (valorByte1 * valorLong2)/valorDouble1;
 *
 */
public class Ex3 {

    public static void main(String[] args) {
        
        long m = 1233445656999996L;
        
        byte valorByte1 = 10;
        byte valorByte2 = 2;
        
        char valorChar1 = 'a';
        char valorChar2 = 'b';

        int valorInt1 = 100;
        int valorInt2 = 200;

        long valorLong1 = 1000;
        long valorLong2 = 2000;

        float valorFloat1 = 1000.1234f;
        float valorFloat2 = 2000.5678f;

        double valorDouble1 = 100000.1234;
        double valorDouble2 = 200000.5678;
        //Codigo
        int unoYDos = valorByte1 / valorByte2;

        int charUnoyDos = valorChar1 + valorChar2;

        int longUno = (int) (valorLong1 + valorLong2);

        double cosaRaraUno = (valorByte1 * valorLong2) / valorDouble1;

        float loMismo = (valorByte1 * valorLong2) / (float) valorDouble1;
        double result6 = valorChar1*valorFloat1 + (valorByte1 * valorLong2)/valorDouble1;
       
        
//Prints 
        System.out.println(unoYDos);
        System.out.println(charUnoyDos);
        System.out.println(longUno);
        System.out.println(cosaRaraUno);
        System.out.println(loMismo);
        System.out.println(result6 + " \nTipo double para no tener que hacer conversiones explicitas");
    }
}
