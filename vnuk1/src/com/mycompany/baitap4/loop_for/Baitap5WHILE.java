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
//Nhập vào số n, tính giai thừa của n
//	n!= 1 x 2 x 3 x 4 x …x n

public class Baitap5WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 1;
        int i = 1;
        
        while (i <= n) {
            S *= i;
            i++;
        }
        System.out.println(S);
        
    }
}
