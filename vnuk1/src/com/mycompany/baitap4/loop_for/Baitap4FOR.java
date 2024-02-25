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
//Nhập vào số nguyên n, yêu cầu xuất ra bảng cửu chương thứ n. Ví dụ:

public class Baitap4FOR {
    public static void main(String[] args ) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
