/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a11_avaluacioexpressions;

/**
 *
 * @author lace22
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Apartado 1:");
        System.out.println((!('a' == 'b') && (3 * 4) == 7 ) && (23 > 11 ));
                            // !('a' == 'b') && (12) == 7 ) && (23 > 11 )
                            // !(false) && false && true
                            // true && false && true
                            // false
        System.out.println("Apartado 2:");
        int valorInt = -36;
        System.out.println((200 + valorInt * 4 >= 0 || valorInt / 6 + 2 == 0 && valorInt % 6 != 0));
        
                            //200 + (-36*4) >= 0 || (-36/ 6) == 0 && -36 % 6 !=0
                            //200 + (-144) >= 0 || -6 == 0 && 0 !=0
                            //  56 >= 0 || -6 == 0 && 0 !=0
                            // true || (false && false)
                            // true || (false)
                            // true
                            
                            
        System.out.println("Apartado 3:");
        int x = 7;
        int y = 2;
        int z = -4;
        System.out.println(!( (x <= 0) || !(y>=2) && (z == -4) ));
                            //(!( (7 <= 0) || !(2>=2) && (-4 == -4) ))
                            //(!( (false) || !(true) && (true) ))
                            //(!( (false) || (false) && (true) ))
                            //(!( (false) || false ))
                            //(!(false)
                            //true
                            
                            
                            
        System.out.println("Apartado 4:");
        y = 2;
        z = 4;
        System.out.println((++y * 2 + 4 > 1 + z * 3       || z-- * 3 > -z / 2 * 3));
                            //((++2 *2) + 4 > 1 + (4 * 3) || (4-- * 3) > (-3 / 2) * 3)
                            //((3 *2) + 4 > 1 + (4 * 3) || (4 * 3) > (-3 / 2) * 3)
                            //((6) + 4 > 1 + (12) || (12) > (-1) * 3)
                            // 10 > 13 || 12 > -3
                            // false || true
                            //true
        System.out.println("Apartado 5");
        x = 5;
        y = 2;
        z = 4;
        System.out.println((z-- + z-- * y != - (-z * x) % 4 + 8));
       // System.out.println(5%4);
        //System.out.println(-z * (5 % 4) );
                           //z-- + (z--* 2) != - (-z * (5 % 4) + 8
                           //(4-- + 4-- * 2 != - (-4 *(-5) % 4 + 8)
                           // 4 + 3 * 2 != - - 2 * (-5) % 4 + 8
                          // 4 + 6 != -10 % 4 + 8
                          // 10 != 2 + 8
                          // 10 != 10
                          // false

                            
                        
    }
    
}
