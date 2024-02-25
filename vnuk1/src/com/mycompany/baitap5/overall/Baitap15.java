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
//Tính tích tất cả các “ước số lẻ” của số nguyên dương n (n > 0)

public class Baitap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 1;
        int i;
        for (i = 1 ; i <= n ; i++) {
            if (i % 2 != 0 && n % i == 0) {
                S *= i;
            }
        }
        System.out.println("S = " + S);
    }
}
