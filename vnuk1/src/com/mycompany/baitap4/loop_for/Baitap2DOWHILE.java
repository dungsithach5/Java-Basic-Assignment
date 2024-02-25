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
//Nhập 1 số nguyên n, xuất tổng các số lẻ từ 1 đến n

public class Baitap2DOWHILE {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 0;
        int i = 0;
         do {
             if (i % 2 != 0 ) {
                 S += i;
             }
             i++;
         }while (i <= n);
         System.out.println(S);
    }
}
