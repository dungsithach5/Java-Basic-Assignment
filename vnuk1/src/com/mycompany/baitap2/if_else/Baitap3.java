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
//Viết chương trình nhập một số nguyên bất kỳ từ bàn phím và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 100.

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if ( n < 100 ) {
            System.out.println("n nho hon 100 ");
        }else{
            System.out.println("n lon hon 100");
        }
        
    }
}
