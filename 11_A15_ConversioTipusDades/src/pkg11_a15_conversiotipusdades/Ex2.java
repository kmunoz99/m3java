/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a15_conversiotipusdades;

/**
 Obtenir el valor enter associat a les vocals (a, e, i, o, u).  
Al mostrar el resultat utilitza el caràcter t amb la barra d'escapament '\t' per separar la lletra del seu valor numèric.
La sortida hauria de ser semblant a això:
a	97
e	101
i	105
o	111
u	117

 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char A,E,I,O,U;
        A = 'a';
        E = 'e';
        I = 'i';
        O = 'o';
        U = 'u';
        System.out.format(" %c \t %d \n %c \t %d \n %c \t %d \n %c \t %d \n %c \t %d \n ", A , (int) A, E, (int) E, I, (int)I, O, (int) O, U, (int) U);

    }
    
}
