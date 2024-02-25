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
 * Viết chương trình tính biểu thức sau: 4sin(x) + cos(2x + ½) Với x nhập vào từ
 * bàn phím
 */

public class Baitap14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x, result;

		System.out.print(" Input x = ");
		x = sc.nextFloat();

		result = (float) (4 * Math.sin(x) + Math.cos(2 * x + 0.5f));
		System.out.println("Result: " + result);
	}
}
