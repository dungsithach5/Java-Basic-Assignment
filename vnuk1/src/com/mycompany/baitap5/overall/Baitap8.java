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
/* Nhập 2 số a và b. Tạo menu chọn phép tính và in ra kết quả
	------PHEP TINH---------
	An 1. a x b
	An 2. a / b
	An 3. a + b
	An 4. a - b
	An 5. a % b
	An 0. Thoat
	Chọn:
*/

public class Baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("nhap a :");
        int a = sc.nextInt();
        System.out.println("nhap b :");
        int b = sc.nextInt();
        switch(n) {
            case 1:
                System.out.println(a*b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a+b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("UNKOWN");
        } 
    }
}
