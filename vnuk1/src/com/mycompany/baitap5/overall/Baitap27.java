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
//Nhập số nguyên n. Hãy tìm số đảo ngược của số nguyên dương n (n > 0)

public class Baitap27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int temp = 0;
        
        while (true) {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Yeu cau nhap lai n > 0");
            }else{
                break;
            }
        }
        
        do {
            temp = temp * 10 + n % 10;
            n /= 10;
        }while (n > 0);
        System.out.println("So dao nguoc la: " + temp);
    }
}
