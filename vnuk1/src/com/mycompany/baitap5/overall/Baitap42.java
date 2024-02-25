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
/*Nhập n và in ra tam giác cân chiều cao n sau:
	Ví dụ n = 4
            *
         * * *
      * * * * *  
   * * * * * * *
*/

public class Baitap42 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int h;
        System.out.print("h = ");
        h = sc.nextInt();
    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    }
}
