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
public class ex13 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        double x1,x2;
        System.out.println("diga o a de x^2");
        int a = keyb.nextInt();
        System.out.println("diga o b de x");
        int b = keyb.nextInt();
        System.out.println("diga o c");
        int c = keyb.nextInt();
        
        double tr = b*b-4*a*c;
        
        x1 = (-b+tr)/(2*a);
        x2 = (-b-tr)/(2*a);
        
        if(tr<0)
            System.out.println("não existem raizes");
        else if (x1==x2)
            System.out.println("só tem uma raiz" + x1);
        else
            System.out.println("as raizes são " + x1 + " e " + x2);
    }
}
