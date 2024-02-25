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
// Liệt kê tất cả các số chính phương nhỏ hơn n

public class Baitap39 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            System.out.println(i*i+" ");
        }
    }
}
