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
/*Viết chương trình nhập số nguyên n (1 → 10) và in ra từ tiếng anh tương ứng
	Ví dụ: n = 3 → THREE
		n = 9 → NINE
		n = 11 → UNKNOW
*/

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch(n) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("UNKOWN");
        }
    }
}
