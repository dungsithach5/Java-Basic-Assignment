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
//Nhập vào 2 số thập phân là 2 cạnh của hình chữ nhật. Tính chu vi hình chữ nhật.
//Chu vi  = (chiều dài + chiều rộng) * 2

public class Baitap8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float length = sc.nextFloat();
		float width = sc.nextFloat();

		System.out.println("Chu vi = " + (length + width) * 2);
	}
}
