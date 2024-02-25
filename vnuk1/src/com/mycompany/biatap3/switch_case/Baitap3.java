/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biatap3.switch_case;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
/*Viết chương trình in menu và thực hiện chức năng
	-------------------------TINH DIEN TICH--------------------------
	An 1. Dien tich hinh chu nhat
	An 2. Dien tich hinh tam giac
	An 3. Dien tich hinh vuong
	An 4. Dien tich hinh tron
	An 5. Dien tich hinh thang
	Chọn:
Mỗi chức năng nhập các hệ số tương ứng để thực hiện
	Ví dụ: Chọn: 1
	Chieu dai: 3
	Chieu rong: 4
	Dien tich hinh chu nhat la: 12
*/

public class Baitap3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    switch(n) {
        case 1:
            System.out.println("Rectangular area = " + a*b);
            break;
        case 2:
            System.out.println("area of triangle = " + (a*h)/2);
            break;
        case 3:
            System.out.println("area square = " + a*a);
            break;
        case 4:
            System.out.print("Ban kinh r: ");
            int r = sc.nextInt();
            System.out.println("circle area = " + Math.PI*r*r);
            break;
        case 5:
            System.out.println("trapezoidal area = " + h/2 * (a+b));
            break;
        default:
            System.out.println("UNKNOWN");
    }
}
}
 