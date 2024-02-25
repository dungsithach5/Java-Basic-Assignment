/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SwitchCaseDEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        switch(num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1 :
                System.out.println("ONE");
                break;
            case 2 :
                System.out.println("TWO");
                break;
            case 3 :
                System.out.println("THREE");
                break;
            default:
                System.out.println("UNKNOWN");
        }
    }
}
