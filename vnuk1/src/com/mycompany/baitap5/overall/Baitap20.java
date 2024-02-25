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
//Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
// số chính phương là căn bặc 2 của một số là số nguyên

public class Baitap20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
        	System.out.print(i + " ");
        	
        }
        
    }
}
