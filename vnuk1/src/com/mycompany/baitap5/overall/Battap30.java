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
//Nhập số nguyên n. Hãy kiểm tra số nguyên dương n có toàn chữ số lẻ hay không

public class Battap30 {
	static boolean isALLOddElements(int n) {
		while(n != 0) {
			int tmp = n % 10;
			if(tmp % 2 == 0) {
				return false;
			}
			n /= 10;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isALLOddElements(n));
	}
    
}
