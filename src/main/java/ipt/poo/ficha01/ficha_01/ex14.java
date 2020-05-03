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
public class ex14 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("diga um numero para fatorizar");
        int a = keyb.nextInt(),fac=a;
        if (a==0)
            System.out.println("o fatorial do numero " + a + " é "+ 1);
        else{
        for(int i=1;i<a;i++)
            fac = fac *i;
        System.out.println("o fatorial do numero " + a + " é "+ fac);
        }
    }
}
