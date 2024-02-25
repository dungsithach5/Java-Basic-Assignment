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
 * Nhập vào 2 số nguyên là 2 cạnh của hình chữ nhật. Tính diện tích hình chữ
 * nhật. Diện tích = chiều dài * chiều rộng
 */

public class Baitap9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input x= ");

		int length = sc.nextInt();
		int width = sc.nextInt();

		System.out.println("S = " + length * width);

	}

}
