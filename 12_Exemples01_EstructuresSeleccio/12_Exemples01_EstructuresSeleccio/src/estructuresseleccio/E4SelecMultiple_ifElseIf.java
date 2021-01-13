package estructuresseleccio;

import java.util.Scanner;

public class E4SelecMultiple_ifElseIf {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edat;
        String etapa;

        System.out.println("Introduir l'edat: ");
        edat = lector.nextInt();

        /* 
        Si entra en un dels blocs, ja no avaluarà les altres condicions.
        Per tant, només s'executarà un dels blocs següents:
         */
        if (edat > 0 && edat < 12) {
            etapa = "infantil";

        } else if (edat < 18) {  //si arriba aquí, és major o igual a 12
            etapa = "adolescència";

        } else if (edat < 65) {  //si arriba aquí, és major o igual a 18
            etapa = "adulta";

        } else {                 //si arriba aquí, és major o igual a 65
            etapa = "jubilació";
        }

        System.out.println("L'usuari/a està a l'etapa " + etapa);
    }

}
