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
/*Chương trình dự báo thời tiết dựa vào nhiệt độ và có tiêu chí sau:
Nhiệt độ < 10: thời tiết rất lạnh
Nhiệt độ 10-20: thời tiết lạnh
Nhiệt độ 20-30: thời tiết bình thường
Nhiệt độ 30-40: thời tiết nóng
Nhiệt độ >= 40: thời tiết rất nóng
Viết chương trình nhập vào nhiệt độ hiện tại. Thông báo cho người dùng biết là thời tiết đó như thế nào?
*/

public class Baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 10){
            System.out.println("the weather is very cold");
        }
        if (n > 10 && n < 20) {
            System.out.println("the weather is cold");
        }
        if (n > 20 && n < 30) {
            System.out.println("the weather is normal");
        }
        if (n > 30 && n < 40) {
            System.out.println("the weather is hot");
        }
        if (n >= 40) {
            System.out.println("the weather is very hot");
        }
    }
}
