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
public class ex07 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("qual é a sua altura");
        double al = keyb.nextDouble();
        System.out.println("qual é a seu peso");
        int peso = keyb.nextInt();
        
        double imc= peso/(al*al);
        
        if(imc<20)
            System.out.println("Abaixo do peso");
        else if(imc<24)
            System.out.println("Peso ideal"); 
        else if(imc<29)
            System.out.println("Excesso de peso"); 
        else if(imc<39)
            System.out.println("Obesidade"); 
        else
            System.out.println("Obesidade mórbida"); 
        
    }
    
}
