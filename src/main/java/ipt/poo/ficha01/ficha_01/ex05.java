/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipt.poo.ficha01.ficha_01;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class ex05 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Número :");
        int n = keyb.nextInt();

        if (n % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
    }
}
