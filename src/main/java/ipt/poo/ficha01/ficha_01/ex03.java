/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipt.poo.ficha01.ficha_01;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class ex03 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("1º Número :");
        int n1 = keyb.nextInt();

        System.out.println("2º Número :");
        int n2 = keyb.nextInt();

        System.out.println("3º Número :");
        int n3 = keyb.nextInt();

        double m = (n1 + n2 + n3) / 3;

        System.out.println("a média é "+m);
        
    }
}
