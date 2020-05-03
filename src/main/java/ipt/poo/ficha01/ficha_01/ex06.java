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
public class ex06 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("escreva um numero");
        int n = keyb.nextInt();
        
        if(n<0)
            System.out.println("numero negativo");
        else if (n==0)
            System.out.println("numero nulo");
        else 
            System.out.println("numero positivo");

    }
}
