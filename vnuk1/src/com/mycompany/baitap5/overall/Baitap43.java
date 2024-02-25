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
/*V\Vẽ hình chữ nhật đặc kích thước n x m
	Ví dụ n = 4, m = 5
		* * * * *
		* * * * *		
		* * * * *
		* * * * *
*/ 
public class Baitap43 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= b; j++) {
        System.out.print("* ");
      }
      System.out.println();
     }
   }
}
