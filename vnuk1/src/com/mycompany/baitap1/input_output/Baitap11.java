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
 * Viết chương trình tính giá trị biểu thức sau: 3x3 - 5x2 + 6x + 5 Với x được
 * nhập vào từ bàn phím
 */

public class Baitap11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(3 * x * x * x - 5 * x * x + 6 * x + 6);
	}
}
