/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a13_operadorternari_v2;

/**
 *
 * @author lace22
 */
public class Ex2 {
    public static void main(String[] args) {
        int TNC1,TNC2,teatreRomea;
        TNC1 = (int)(50*0.6);
        TNC2 = (int)(40*0.4);
        teatreRomea = (int)(50*0.8);
        System.out.println(teatreRomea);
        System.out.println("Preu TNC al galliner: "+ ((TNC1<=35)?"23,50€, ":"18'50€, ") + TNC1+ " avis apuntats");
        System.out.println("Preu TNC a platea: "+ ((TNC2<=35)?"35'50€, ":"28'50€, ") + TNC2+ " avis apuntats");
        System.out.println("Preu Teatre Romea: "+ ((teatreRomea<=35)?"34'50€, ":"29'50€, ") + teatreRomea+ " avis apuntats");
        System.out.println(((TNC1+TNC2>=40 && (teatreRomea>=30))?"Podem fer la sortida":"No podem fer la sortida"));


        
    }
    
}
