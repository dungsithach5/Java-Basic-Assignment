/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */


public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        int i = 0;
        
        
        while (true) {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Yeu cau nhap lai n > 0");
            }else{
                break;
            }
        }
        
        while (n != 0) {
            n = n % 10;
            if (n % 2 == 1) {
                count++;
            }
            n /= 10;
        }
        System.out.println("so luong chu so la: " + count);
    }
}
