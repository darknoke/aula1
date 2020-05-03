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
public class ex16 {

    public static int sumDivs(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma;

    }
    

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("diga numero a vereficar se é prefeito");
        int n = keyb.nextInt();
        
        if(sumDivs(n)==n)
            System.out.println("o numero "+ n +" é prefito");
        else
            System.out.println("o numero "+ n +" é não prefito");
    }
}
