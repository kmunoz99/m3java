package pkg11_a13_operadorternari_v2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        boolean matriculaPrevia, dispHoraria;
        String nom, resultado;
        int edat, descompte;
        float importMatricula = 89f;
        descompte = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nom = scanner.nextLine();
        System.out.println("Introduce tu edad: ");
        edat = scanner.nextInt();
        System.out.println("té disponibilitat horària a la Franja 1 (de 9 a 12h)?");
        dispHoraria = scanner.nextBoolean();
        System.out.println("Has estado matriculado antes?");
        matriculaPrevia = scanner.nextBoolean();
        resultado = (edat<25 && dispHoraria && !matriculaPrevia) ? String.format("la teva matrícula té descompte! Només et costarà %.2f € ",importMatricula-descompte):String.format("ho sentim, no tens descompte a la matrícula. L'import és %.2f €", importMatricula);
        System.out.println("Hola "+ nom +", "+resultado);
        //System.out.println(resultado);
        
    }
   
}
