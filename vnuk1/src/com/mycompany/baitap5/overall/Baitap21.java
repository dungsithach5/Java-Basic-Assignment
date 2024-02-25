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
//Nhập số nguyên n. Hãy đếm số lượng chữ số của số nguyên dươ ng n (n > 0)

public class Baitap21 {
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
        
        do {
            n /= 10;
            i++;
            count++;
        }while(n > 0);
        System.out.println("so luong chu so la: " + count);
    }
}
