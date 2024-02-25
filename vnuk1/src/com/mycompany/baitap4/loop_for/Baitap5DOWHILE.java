/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4.loop_for;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Baitap5DOWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 1;
        int i = 1;
        
        do{
            S *= i;
            i++;
        }while(i <= n);
        System.out.println(S);
    }
}
