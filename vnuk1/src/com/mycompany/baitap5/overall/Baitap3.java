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
//Nhập số nguyên n > 0. Tính S =12 + 14 + … + 12n

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float S = 0;
        for (int i = 1/2 ; i <= n ; i++) {
            S += (float)1/2*i;
        }
        System.out.println("S = " + S);
    }
}
