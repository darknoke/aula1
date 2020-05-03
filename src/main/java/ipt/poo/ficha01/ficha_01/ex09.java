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
public class ex09 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Sexo :");
        String s = keyb.nextLine();

        switch (s) {
            case "m":
            case "M":
                System.out.println("Masculino");
                break;
            case "f":
            case "F":
                System.out.println("Femenino");
                break;
            default:
                System.out.println("outro");
        }
    }
}
