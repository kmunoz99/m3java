/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_b_kylemunoz;

import java.util.Scanner;

/**
 *
 * @author lace22
 */
public class Ex2 {

    public static void main(String[] args) {
        //Inicialització
        Scanner scanner = new Scanner(System.in);
        String nomEmpresa;
        float saldo = 2f;
        int numOperacio = 3000;

        //Operacio consultar saldo:
        numOperacio++;
        System.out.format("OPERACIO %06d %-24s SALDO %12.2f € \n", numOperacio,
                "Consultar Saldo", saldo);

        //Operació nomina
        numOperacio++;
        System.out.println("Quin és l'import de a nòmina? ");
        saldo += scanner.nextFloat();
        System.out.format("OPERACIO %06d %-24s SALDO %12.2f € \n", numOperacio,
                "Ingrés nomina", saldo);

        //Operació lloguer
        numOperacio++;
        saldo /= 2;
        System.out.format("OPERACIO %06d %-24s SALDO %12.2f € \n", numOperacio,
                "Pagament Lloguer", saldo);

        //Operació domiciliació
        numOperacio++;
        //buido el buffer perque si no agafará el \n que no ha agafat el nextFloat
        scanner.nextLine();
        System.out.println("Nom empresa beneficiaria: ");
        nomEmpresa = scanner.nextLine();
        System.out.println("Import a pagar a " + nomEmpresa + ": ");
        saldo -= scanner.nextFloat();
        System.out.format("OPERACIO %06d %-24s SALDO %12.2f € \n", numOperacio,
                "Pagament Domiciliació", saldo);

    }

}
