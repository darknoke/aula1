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
public class ex08 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("lado a");
        int a = keyb.nextInt();
        System.out.println("lado b");
        int b = keyb.nextInt();
        System.out.println("lado c");
        int c = keyb.nextInt();
        
        if(a==b&&b==c)
            System.out.println("um triângulo equilatero");
        else if(a==b||a==c||b==c)
            System.out.println("um triângulo isosceles");
        else 
            System.out.println("um triângulo escaleno");
    }
}
