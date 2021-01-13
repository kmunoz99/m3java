/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/*
 * Exercici6 Implementar l'algorisme que donada la qualificació quantitativa (
 * 6, 5,79...) d’una nota, imprimeix per pantalla la qualificació en forma
 * qualitativa (Bé, Suficient...). El criteri per canviar a la forma qualitativa
 * és el següent (el valor superior no inclòs en el rang): Insuficient de 0 a 5
 * Suficient de 5 a 6 Bé de 6 a 7 Notable de 7 a 9 Excel·lent de 9 a 10 inclòs
 * El programa ha de funcionar correctament per a notes numériques de l’estil
 * 5,98. Dóna un missatge adequat si la nota no està dins el rang permès (0 a
 * 10).
 *
 */
public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;
        String notaTexto;
        System.out.println("Introdueix la nota");
        nota = scanner.nextDouble();
        if (nota<0){
            notaTexto = "No puede ser negativa la nota";
        }
        else if (nota < 5) {
            notaTexto = " Es insuficient";
        } else if (nota < 6) {
            notaTexto = " Es suficient";
        } else if (nota < 7) {
            notaTexto ="Es be";
        } else if (nota < 9) {
            notaTexto = " Es Notable";
        } else if (nota <= 10) {
            notaTexto = " Es Excel·lent";
        } else {
            notaTexto = " no es un numero del 0 al 10";
        }
        System.out.println(notaTexto);
    }
}
