/*
 * Ejercicio 2 donde hay que hacer print de serie y pelicula favorita
 * @author lace22
 */
package activitat1;


public class Ex3 {
   public static void main(String[] args) {
       int multiplier = 1000;
       int numerostart = 1;
       do {
        int resultat = numerostart * multiplier;
        if ( resultat == 1000 ){
        System.out.println("1 x 1000 = 1000");
        }
        else if ( resultat == 2000 ){
        System.out.println("2 x 1000 = 2000");
        }
        else if ( resultat == 3000 ){
        System.out.println("3 x 1000 = 3000");
        }
        else if ( resultat == 4000 ){
        System.out.println("4 x 1000 = 4000");
        }
        else if ( resultat == 5000 ){
        System.out.println("5 x 1000 = 5000");
        }
        else if ( resultat == 6000 ){
        System.out.println("6 x 1000 = 6000");
        }
        else if ( resultat == 7000 ){
        System.out.println("7 x 1000 = 7000");
        }
        else if ( resultat == 8000 ){
        System.out.println("8 x 1000 = 8000");
        }
        else if ( resultat == 9000 ){
        System.out.println("9 x 1000 = 9000");
        }
        else if ( resultat == 10000 ){
        System.out.println("10 x 1000 = 10000");
        }
   
        numerostart++;
    }
    while (numerostart < 11);

}
}