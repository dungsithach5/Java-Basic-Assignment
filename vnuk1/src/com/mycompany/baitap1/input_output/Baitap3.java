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
 * Viết chương trình nhập vào một chuỗi và in ra chuỗi vừa nhập Ví dụ: Nhập: Xin
 * chào, Tôi tên là Trần Văn Nam! Chuỗi vừa nhập: Xin chào, Tôi tên là Trần Văn
 * Nam!
 */

public class Baitap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap: ");
		String name = sc.nextLine();
		System.out.print("Chuoi vua nhap: " + name);
	}
}
