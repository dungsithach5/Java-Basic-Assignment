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
/*Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0
Đầu vào: nhập 3 số a, b, c  (a, b, c là số bất kỳ)
Đầu ra: nghiệm của phương trình
Hướng dẫn: 
	Nếu a # 0 thì trở thành phương trình bậc 2 (chuẩn)
	Ngược lại, thì trở thành phương trình bậc nhất
*/

public class Baitap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat() , b = sc.nextFloat() , c = sc.nextFloat();
        
        if ( a != 0 ) {
            System.out.println("Phuong trinh bac 2");
            
            float delta = b*b - 4*a*c;
        
        if (delta < 0) {
            System.out.println("Phuong trinh VN");
        }else if (delta == 0){
            float x = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        }else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Nghiem x1 = " + x1 + ",x2 = " + x2);
        }
        }else{
            System.out.println("Phuong trinh bac nhat");
        
        if (a != 0) {
            System.out.println("x = " + -b/a);
        }else if ( b != 0) {
            System.out.println("Phuong trinnh VN");
        }else {
            System.out.println("Phuong trinh co nghiem dung voi moi x");
        }
        }
        
    }
}
