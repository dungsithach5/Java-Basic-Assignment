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
//Nhập số nguyên n. Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không

public class Baitap31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int Check;
        
        while (true) {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Yeu cau nhap lai n > 0");
            }else{
                break;
            }
        }
        
        boolean Check = true;
        while(n /= 10) {
            if ((n % 10 ) % 2 == 1) {
                Check = false;
                break;
            }
        }
        
        if(Check == true) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
