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
//Nhập số nguyên n (0 < n <= 10). Tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n

public class Baitap5 {
    /*
    public static int tong(int n) {
        int S = 1;
        for (int i = 1 ; i<= n ; i++) {
            S *= i;
        }
        return S;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 0;
        for (int i = 1 ; i<= n ; i++) {
            S += tong(i);
        }
        System.out.println("S = " + S);
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 0;
        int gt = 1;
        for (int i = 1 ; i <= n ; i++) {
            S = S + gt*i;
            gt = gt*i;
        }
        System.out.println("S = " + S);
    }
}