package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
Introduir una lletra:
g
La lletra que has introduït és la g
La lletra que has introduït en decimal és 103
La lletra que has introduït en hexadecimal és 67
 
La lletra g es troba entre la A/a i la Z/z? true

 */
/**
 *
 * @author lace22
 */
public class ex3 {

    public static void main(String[] args) {
        char letra;
        int valor;
        String hex;
        boolean comprobacion;
        //
        Scanner scanner = new Scanner(System.in);
        //
        letra = scanner.nextLine().charAt(0);
        hex = String.format("%x", (int) letra);
        valor = letra;
        comprobacion = 65 <= valor && valor <= 90 || 97 <= valor && valor <= 122;
        //
        System.out.println("La lletra que has introduït és la " + letra);
        System.out.println("La lletra que has introduït en decimal es " + valor);
        System.out.println("La lletra que has introduït en hexadecimal es " + hex);
        System.out.println("La lletra " + letra + " es troba entre la A/a i la Z/z? " + comprobacion);

    }
}
