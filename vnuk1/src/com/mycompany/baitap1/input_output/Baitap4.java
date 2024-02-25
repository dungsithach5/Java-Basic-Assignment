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

//Viết chương trình nhập vào 2 số nguyên và in ra tổng, hiệu và phép nhân 2 số vừa nhập

public class Baitap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
	}
}
