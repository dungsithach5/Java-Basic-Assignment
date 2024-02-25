package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

public class DEMO2D {
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
	
	public static int sumOfOddElements(int[][] arr) {
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
		
		
		// input Array 2D
		System.out.println("Input array : ");
		inputArray(iArray);
		/*
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.printf("[%d][%d] = " , i , j );
				iArray[i][j] = sc.nextInt();
			}
		}
		*/
		
		// input Array 2D
		sc.next();
		System.out.println("Entered array : ");
		printArray(iArray);
		/*
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.print(iArray[i][j] + " ");
			}
			System.out.println();
		}
		*/
		System.out.println("S = " + sumOfOddElements(iArray));
	}

}



// lý thuyết mảng 2 chiều 
// đường chéo choinhs a[i][i]
// sap xep duong cheo chinh(di xuong) , phu (di len )
// arr[row ; i -1 -i][i]
// 