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
public class ex04 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("altura do triangulo");
        int a = keyb.nextInt();
        System.out.println("largura do triangulo");
        int l = keyb.nextInt();
        
        double area = a*l/2;
        System.out.println("a area do triangulo é "+ area);
    }
}
