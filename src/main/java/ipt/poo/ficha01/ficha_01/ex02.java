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
public class ex02 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
         System.out.println("qual o seu nome :");
        String nome = keyb.nextLine();
        
        System.out.println("qual a sua idade :");
        int idade = keyb.nextInt();
        
        System.out.println("o seu nome é "+ nome + " e a sua iade é " + idade);
        
    }
}
