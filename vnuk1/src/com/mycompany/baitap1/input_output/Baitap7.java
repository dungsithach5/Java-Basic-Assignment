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
 * \ Nhập vào một số thập phân là bán kính hình tròn. Tính diện tích hình tròn.
 * Cho PI = 3.14 Diện tích = PI * bán kính * bán kính
 */

public class Baitap7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		double pi = 3.14;

		System.out.println("S = " + pi * r * r);
	}
}
