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
//Nhập số nguyên n. Hãy tính tích các chữ số của số nguyên dương n (n > 0)

public class Baitap23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 1;
        int i = 0;
       do {
            S *= n % 10;
            n /= 10;
            i++;
        }while(n > 0);
        System.out.println("S = " + S);
    }
}
