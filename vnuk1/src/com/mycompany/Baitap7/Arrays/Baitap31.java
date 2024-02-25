package com.mycompany.Baitap7.Arrays;
//Nhập ma trận n hàng, m cột (n > 0, m > 0). In ra mang trận vừa nhập và tổng các phần tử lẻ của ma trận

import java.util.Scanner;

public class Baitap31 {
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
	
	public static int TongChan(int[][] arr) {
		int S = 0;
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[0].length; j++) {
				if (arr[i][j] % 2 != 0) {
					S += arr[i][j];
				}
			}
		}
		return S;
	}
	
	public static void main(String[] args) {
		int row, col;
		int iArray[][];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Row : "); // dòng
		row = sc.nextInt();
		System.out.print("Col : "); // cột
		col = sc.nextInt();
		
		iArray = new int[row][col];
		
		
		
		System.out.println("Input array : ");
		inputArray(iArray);
		
		
		System.out.println("Entered array : ");
		printArray(iArray);
		
		System.out.println("S = " + TongChan(iArray));
	}
}
