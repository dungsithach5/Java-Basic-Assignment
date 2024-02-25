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
//Đếm số lượng “ước số chẵn” của số nguyên dương n (n > 0)

public class Baitap16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        int count = 0;
        
        for(int i = 1 ; i <= n ; i++) {
            if (n % i == 0 && i % 2 == 0) {
                count++;
            }
        }
        System.out.println(" so luong uoc so chan la: " + count);
    }
    
}
