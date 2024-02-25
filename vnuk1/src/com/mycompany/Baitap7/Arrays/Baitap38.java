package com.mycompany.Baitap7.Arrays;
//Nhập ma trận n hàng, m cột (n > 0, m > 0).  Liệt kê các dòng có tổng lớn nhất

import java.util.Scanner;

public class Baitap38 {
	public static void inputArray(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.printf("[%d][%d] = " , i , j );
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void printArray(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void TongRow(int[][] arr) {
		int j = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			int S = 0;
			for( j = 0 ; j < arr[0].length ; j++) {
				S += arr[i][j]; // đưa i ra đầu = tính dòng
			}
			System.out.println("Tong dong la " + S);
		}
	}
	
	public static void ListMaxRow(int [][] arr) {
		int j = 0;
		int max = 0;
		for(int i = 0 ; i < arr.length ; i++) {
	    	for(j = 0; j < arr[0].length; j++) {
			if (max < TongRow(arr[i][j])) {
	        	max = TongRow(arr[i][j]);
	        	}
	    	}
	            System.out.printf("%d " , arr[i][j]);
		}
	}
	
	public static void main(String[] args) {
		int row, col;
		int iArray[][];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Row : "); // dòng j
		row = sc.nextInt();
		System.out.print("Col : "); // cột i
		col = sc.nextInt();
		
		iArray = new int[row][col];
		
		
		
		System.out.println("Input array : ");
		inputArray(iArray);
		
		
		System.out.println("Entered array : ");
		printArray(iArray);
		
		System.out.println("Tong tung dong :");
		TongRow(iArray);
		
		System.out.println("ListMaxCow :");
		ListMaxRow(iArray);
	}
}
