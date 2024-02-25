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
//Nhập vào số nguyên n, in ra tổng các số chẵn và tổng các số lẻ nhỏ hơn hoặc bằng  n

public class Baitap3DOWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int S = 0;
        
        do {
            if (i % 2 == 0) {
                S += i;
            }else{
                S += i;
            }
            i--;
        }while(i <= n);
        System.out.println(S);
    }
}
