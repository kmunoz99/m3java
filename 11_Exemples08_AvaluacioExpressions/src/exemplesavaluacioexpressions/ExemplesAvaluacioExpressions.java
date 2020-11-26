package exemplesavaluacioexpressions;

public class ExemplesAvaluacioExpressions {

    public static void main(String[] args) {
        /*
        System.out.println("*** PRECEDÈNCIA D'OPERADORS ***\n");

        System.out.println(
                "1.     ( ) [ ]\n"
                + "2.     -(canvi signe) ++ --  !(negació lògica) \n"
                + "3.     * / % \n"
                + "4.     + - \n"
                + "5. Relacionals \n"
                + "       > >= < <= (numèrics)\n"
                + "       == != (booleans o numèrics)\n"
                + "6. Lògics: \n"
                + "       &&\n"
                + "       ||\n"
                + "7.     ?: (Ternari)\n"
                + "8. Assignació: \n"
                + "       = += -= *= /= %= ");

        System.out.println("\nExemples:\n");
        System.out.println("a. -2 * 3 + 6  --> " + (-2 * 3 + 6));       //-->0
        System.out.println("b. -2 * (3 + 6)  --> " + (-2 * (3 + 6)));   //-->-18
        System.out.println("a. -2 * 3 + 6  --> " + (3 * (-2) * 3 + 6)); //-->-12

        System.out.println();
        System.out.println("c. 3 > 2 + 4   --> " + (3 > 2 + 4));        //-->false
        System.out.println("d. 3 > (2 + 4 )   --> " + (3 > (2 + 4)));   //-->false

        System.out.println();
        System.out.println(
                "e. 3 > 2 == 3 > 1    --> " + (3 > 2 == 3 > 1));        //-->true
        System.out.println(
                "f. (3 > 2) == (3 > 1)    --> " + ((3 > 2) == (3 > 1)));//-->true

        System.out.println();
        System.out.println(
                "g. 2 == 3 || 6 > 1     --> " + (2 == 3 || 6 > 1));     //-->true

        System.out.println();
        System.out.println(
                "h.\n Cal saber resoldre expressions llargues \n"
                + "  'x' == 'y' || 2.6 - 3 == 4.3 && !(5 <= -0.99) \n"
                + "   --> "
                + ('x' == 'y' || 2.6 - 3 == 4.3 && !(5 <= -0.99)));     //-->false

        System.out.println("\ni.\n Operador TERNARI (?:) i assignació aritmètica");
        int num = 10;
        num += 3 < 2 ? -10 + 5 * 10 : 1;
        System.out.println("  int num = 10;\n"
                + "  num += 3 < 2 ? -10 + 5 * 10 : 1;    --> " + num);  //-->11

        System.out.println("\n*****************************");
        System.out.println("IMPORTANT");
        System.out.println("\nEls operadors amb el mateix nivell de precedència \n "
                + "s'executen d'esquerra a dreta\n");
        System.out.println("\nPer tant, canviant l'ordre de '*' i '%' \n"
                + "canvia l'ordre d'execució:");

        System.out.println();
        
        int u = 2 * 5 % 2;
        System.out.println("int u = 2 * 5 % 2 --> " + u
                + "  // S'executa 1r el '*'");                  //-->0
        
        int uu = (2 * 5) % 2;
        System.out.println("int uu = (2 * 5) % 2 --> " + uu);   //-->0
        
        int v = 2 * (5 % 2);
        System.out.println("int v = 2 * (5 % 2) --> " + v
                + "  // canvia el resultat");                   //-->2

        System.out.println();
        
        int t = 13 % 2 * 3;
        System.out.println("int t = 13 % 2 * 2 --> " + t 
                + "  // S'executa 1r el '%'");                  //-->3
        
        int tt = (13 % 2) * 3;
        System.out.println("int tt = (13 % 2) * 2 --> " + tt);  //-->3
        
        int s = 13 % 2 * 3;
        System.out.println("int s = 13 % 2 * 2 --> " + s);    //-->1
        
        System.out.println("*****************************");
         */
        System.out.println((3 + (4 * 23) / (23 % 2)) == (3 * 5 + 4 +2+ 3 -12 /(6 %2)) !! (22%2 = 0)))))))))));

    }

}
