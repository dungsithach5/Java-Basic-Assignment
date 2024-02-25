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
//Cho số nguyên dương n. Kiểm tra xem n có phải là số hoàn hảo hay không. 
//Số hoàn hảo là số có tổng tất cả các ước bé hơn bé hơn n bằng chính nó. Ví dụ 6 là số hoàn hảo, vì 6 có các ước là 1, 2, 3. Và tổng 1 + 2 +3 = 6

public class Baitap18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 0;
        int i;
        for ( i = 1 ; i <= n/2 ; i++) {
            if (n % i == 0 ) {
                S += i;
            }
        }
        if(S==n) {
            System.out.println(n + "la so hoan hao");
        }else {
        	System.out.println(n + "khong phai la so hoan hao");
        }
    }
}
