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
public class ex17 {
    public static void primo(int n){
        System.out.println("ola");
    }
    public static void main(String[] args) {
        int n;
        Scanner keyb = new Scanner(System.in);
        do{
        System.out.println("diga numero a vereficar se é prefeito");
        
        n= keyb.nextInt();}
        while(n>0&&n<1000);
        
        
        
    }
}
