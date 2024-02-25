/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2.if_else;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
//Viết chương trình nhập vào một số kiểu số nguyên. In ra kết quả số đó là số dương hay số âm

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n > 0 ) {
            System.out.println("n la so duong");
        }else{
            System.out.println("n la so am");
        }
    }
}
