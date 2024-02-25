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

// Nhập vào thông tin của một học sinh bao gồm: họ và tên, tuổi, địa chỉ, lớp, điểm toán, điểm lý, điểm hóa. Sau đó in ra màn hình thông tin vừa nhập và điểm trung bình các môn học:
//	Điểm trung bình = (toán + lý + hóa)/3

public class Baitap10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String address;
		float math;
		float physis;
		float chemistry;

		System.out.print("Name: ");
		name = sc.nextLine();

		System.out.print("Age: ");
		age = sc.nextInt();

		System.out.print("Address: ");
		address = sc.nextLine();

		sc.nextLine();

		System.out.print("Math: ");
		math = sc.nextFloat();

		System.out.print("Physis: ");
		physis = sc.nextFloat();

		System.out.print("Chemistry: ");
		chemistry = sc.nextFloat();

		System.out.print("Average: " + (math + physis + chemistry) / 3);

		System.out.printf("name: %s , age: %d , address: %s , math: %f", name, age, address, math);
		System.out.printf("physis: %f , chemistry: %f", physis, chemistry);

	}
}
