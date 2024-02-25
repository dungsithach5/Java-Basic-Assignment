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
/*Viết chương trình giải phương trình bậc nhất: ax + b = 0
Đầu vào: nhập 2 số a, b (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
*/

public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt() , b = sc.nextInt();
        
        if (a != 0) {
            System.out.println("x = " + -b/a);
        }else if ( b != 0) {
            System.out.println("Phuong trinnh VN");
        }else {
            System.out.println("Phuong trinh co nghiem dung voi moi x");
        }
        
        
    }
}
