/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author lace22
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] argv)
            throws Exception {
        long start = System.currentTimeMillis();
        for (int ii = 0; ii < 1000000; ii++) {
            String s = "this XXX a test".replaceAll("XXX", " is ");
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("elapsed time = " + elapsed + "ms");
        System.out.println((elapsed * 1000.0) / 1000000 + " microseconds per execution");
    }

}
