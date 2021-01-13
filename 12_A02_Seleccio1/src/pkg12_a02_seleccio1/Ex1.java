/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/**
Determinar en quin estat es troba l'aigua en funció de la seva temperatura. 
* Si és negativa l’estat serà sòlid, si és menor que 100 serà líquid i si és 
* major que 100 serà gas. Demanar a l'usuari el valor de la temperatura i
* mostrar el seu estat.
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix la temperatura");
        int temperatura = scanner.nextInt();
        System.out.println("********");
        if (temperatura<100&&temperatura>0){
            System.out.println("L'estat de l'aigua a " + temperatura + "ºC es liquid");}
        else if (temperatura>=100){
            System.out.println("L'estat de l'aigua a " + temperatura + "ºC es gas");}
        
        
        else {
        System.out.println("L'estat de l'aigua a " + temperatura + "ºC es solid");}
        
        }
            
        }
    
    
