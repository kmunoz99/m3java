/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_b_munozkyle;

/**
 *
 * @author lace22
 */
public class Ex2 {
    public static void main(String[] args) {
        //Variables
        int num1, num2;
        boolean expressio;
        num1 = 30;
        num2 = 50;
        
        //expresio
        expressio = (num1/(num2++%3)+num2*4 <= 27/num2) && (num2<0 && num2%2 != 0 || num1 * num2 == num2+20);

        
        //prints        
        System.out.println(expressio);

             
    }
    
}
