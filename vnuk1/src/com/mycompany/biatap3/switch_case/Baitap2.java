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
/*Viết chương trình nhập vào số nguyên 4 (1 → 4) và in ra mùa tương ứng
	Ví dụ:
		n = 1 → XUAN
		n = 2 → HA
		n = 3 → THU
		n = 4 → DONG
		n = 5 → UNKNOW
*/

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch(n) {
            case 1:
                System.out.println("XUAN");
                break;
            case 2:
                System.out.println("HA");
                break;
            case 3:
                System.out.println("THU");
                break;
            case 4:
                System.out.println("DONG");
                break;
            case 5:
                System.out.println("UNKNOWN");
                break;
            default:
                System.out.println("UNKOWN");
        } 
    }    
}
        
