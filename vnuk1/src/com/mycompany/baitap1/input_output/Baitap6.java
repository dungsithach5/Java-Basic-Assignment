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
 * Nhập vào một số nguyên là bán kính hình tròn. Tính chu vi hình tròn Cho PI =
 * 3.14 Chu vi = 2 * bán kính * PI
 */

public class Baitap6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		System.out.println("Chu vi = " + (2 * Math.PI * r));
	}
}
