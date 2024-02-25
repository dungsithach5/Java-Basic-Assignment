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
/*Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0 (a # 0)
Đầu vào: nhập 3 số a, b, c (a # 0) (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
Hướng dẫn: Sử dụng lớp Math.xxx() để sử dụng các hàm sẵn
	Ví dụ: Math.sqrt(123) tính căn bậc 2 của số 123	
*/

public class Baitap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat() , b = sc.nextFloat() , c = sc.nextFloat();
        
        float delta = b*b - 4*a*c;
        
        if (delta < 0) {
            System.out.println("Phuong trinh VN");
        }else{
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 = " + x1 + ",x2 = " + x2);
        }if (delta == 0) {
            System.out.println("[Phuong trinh co nghiem kep x1 = x2 = " + -b/2*a);
        }
            
    }
}
