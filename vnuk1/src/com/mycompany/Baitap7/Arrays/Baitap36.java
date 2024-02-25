package com.mycompany.Baitap7.Arrays;
//Nhập ma trận n hàng, m cột (n > 0, m > 0). Tính tổng các giá trị nằm trên biên của ma trận

import java.util.Scanner;

public class Baitap36 {
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
	
	public static int TongCacGiaTriTrenBien(int[][] arr , int row , int col) {
		int S = 0;
		for(int i = 0 ; i < row - 1 ; i++) { // tong gia tri tren bien cot
			S += arr[i][0];
			S += arr[i][col - 1];
		}
		for(int j = 0 ; j < col ; j++) { // tong gia tri tren bien dong
			S += arr[0][j];
			S += arr[row - 1][j];
		}
		return S;
	}
	
	
	public static void main(String[] args) {
		int n = 0;
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
		
		
		System.out.println("Tong cac gia tri tren bien :" + TongCacGiaTriTrenBien(iArray , row , col));
		
	}
}
