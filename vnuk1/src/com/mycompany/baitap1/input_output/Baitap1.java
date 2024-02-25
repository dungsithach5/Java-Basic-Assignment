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
 * Nhập xuất Nhập vào số kiểu int và in ra màn hình Nhập vào số kiểu short và in
 * ra màn hình Nhập vào số kiểu byte và in ra màn hình Nhập vào số kiểu long và
 * in ra màn hình Nhập vào số kiểu float và in ra màn hình Nhập vào số kiểu
 * double và in ra màn hình Nhập vào một chuỗi và in ra màn hình (dùng next())
 * Nhập và in ra họ tên của bạn (dùng nextline())
 */

public class Baitap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numint;
		System.out.print("Numint: ");
		numint = sc.nextInt();
		System.out.printf("numint: %d", numint);

		sc.next();

		short numshort;
		System.out.print("Numshort: ");
		numshort = sc.nextShort();
		System.out.printf("numshort: %d", numshort);

		sc.next();

		byte numbyte;
		System.out.print("Numbyte: ");
		numbyte = sc.nextByte();
		System.out.printf("numbyte: %d", numbyte);

		sc.next();

		long numlong;
		System.out.print("Numlong: ");
		numlong = sc.nextLong();
		System.out.printf("numlong: %d", numlong);

		sc.next();

		float numfloat;
		System.out.print("Numfloat: ");
		numfloat = sc.nextFloat();
		System.out.printf("numfloat: %f", numfloat);

		sc.nextLine();

		double numdouble;
		System.out.print("Numdouble: ");
		numdouble = sc.nextDouble();
		System.out.printf("numdouble: %e", numdouble);

		sc.next();

		String name;
		System.out.print("Chuoi: ");
		name = sc.next();

		sc.next();

		String Name;
		System.out.print("Ho va ten: ");
		Name = sc.nextLine();
	}
}