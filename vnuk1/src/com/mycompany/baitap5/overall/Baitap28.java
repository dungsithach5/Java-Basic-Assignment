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
//Nhập số nguyên n. Tìm chữ số lớn nhất của số nguyên dương n (n > 0)

public class Baitap28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int i = n % 10;
        
//        max = n % 10;
        do {
            if(max < i) {
                max = i;
            }
            i = n % 10;
            n /= 10;
        }while(n != 0);
        System.out.println("MAX = " + max);
        
    }
}
