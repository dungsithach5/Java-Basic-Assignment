/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap5.overall;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */

//Nhập số nguyên n > 1. Tính S =12+22 + 32 + ... + n2 

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 0;
         for (int i = 1; i <= n; i++) {
            S += i*i;
        }  
        System.out.println(" S = " + S);
    }
}
