/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a13_operadorternari_v2;

import java.util.Scanner;

/**
 *
 * @author lace22
 * 
 * int n=0;
boolean result = n==0 ? true : false;
System.out.println("El resultado es: "+result);
* 
* 
* 
* 1- si és parell o senar.
2- si és:
 parell i a més és major o igual que 100
 o és senar o menor que 100 
3- si és:
 parell i a més està comprès entre 100 i 128 (inclosos)
 o és senar o no està en el rang de 100 a 128 (inclosos)

 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ex1, ex2,ex3;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numer");
        a = scanner.nextInt();        
        ex1 = (a%2==0)?"parell":"senar";
        ex2 = (a%2==0 && a >= 100)?"parell i a més és major o igual que 100":"senar o menor que 100 ";
        ex3 = (a%2==0 && a >= 100 & a <=128)?"parell i a més està comprès entre 100 i 128":"senar o no està en el rang de 100 a 128";
        System.out.println("El nombre és "+ex1);
        System.out.println("El nombre és "+ex2);
        System.out.println("El nombre és "+ex3);
        
        

     
        
    }
    
}
