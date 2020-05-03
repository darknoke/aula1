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
public class ex15 {

    public static long fatorial(int n) {
        int fac = 1;
        for (int i = 1; i < n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("diga o n");
        int n = keyb.nextInt();
                System.out.println("diga o k");
        int k = keyb.nextInt();
        
        long comb = fatorial(n)/(fatorial(k)*fatorial(n-k));
        
        System.out.println("resultado de combinaçoes é "+ comb);
    }

}
