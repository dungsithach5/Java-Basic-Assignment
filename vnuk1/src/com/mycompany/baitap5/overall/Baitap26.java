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
//Nhập số nguyên n. Hãy tính tích các chữ số lẻ của số nguyên dương n (n > 0)

public class Baitap26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int S = 1;
        
        
        while (true) {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Yeu cau nhap lai n > 0");
            }else{
                break;
            }
        }
        
        while (n > 0) {
            int temp = n % 10;
            if (temp % 2 != 0) {
                S *= temp;
            }
            n /= 10;
        }
        System.out.println("S = " + S); 
    }
}
