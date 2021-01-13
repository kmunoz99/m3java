/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex2 {
    public static void main(String[] args) {
        int n1,n2,n3;
                Scanner scanner = new Scanner(System.in);
n1 = scanner.nextInt();
n2 = scanner.nextInt();
n3 = scanner.nextInt();
if (n1<n2 && n1<n3){
System.out.println(n1);
if (n2<n3){
System.out.println(n2 + " y " +n3);
    System.out.println(n2+ " y " + n3);
}
else{
System.out.println(n3+ " y " + n2);
}


}
else {
    if (n2<n3){
        System.out.println(n2);
        if (n2<n3){
            System.out.println(n1+ " y " + n3);

        }
        else{
            System.out.println(n3+ " y " + n1);
        }

    }
    else {
        System.out.println(n3);
        if (n1<n2){
            System.out.println(n1+ " y " + n2);
        }
        else{
            System.out.println(n2+ " y " + n1);
        }


    }


}
    }
}
