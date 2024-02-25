/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap1.input_output;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
/*
 * Viết chương trình tính biểu thức sau: 4(x2 + 10xx +3x + 1) Với x nhập vào từ
 * bàn phím
 */

public class Baitap13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		System.out.println(4 * (x * x + 10 * x * Math.sqrt(x) + 3 * x + 1));
	}

}
