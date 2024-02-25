/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4.loop_for;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class dieukien {
    public static void main(String[] args) {
        
        int n;
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
            System.out.println(" n: ");
            n = sc.nextInt();
        } while (n < 0);
        
        
    }
}
