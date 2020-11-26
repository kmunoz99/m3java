package pkg11_exemplesx_operadorternari;

import java.util.Scanner;

public class Ternari2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int valor1 = scanner.nextInt();
        int valor2 = 37;
        System.out.println("El numero " + valor1 + " es " + ((valor1 % 2 == 0)&&(valor1>valor2)
                ? "parell i mes gran que."+valor2 : "El numero es mes petit que "+ valor2 + "o senar" ) +"\n uwu");
    }
}