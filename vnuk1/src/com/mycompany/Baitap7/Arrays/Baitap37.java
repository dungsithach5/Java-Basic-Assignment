package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

//Nhập ma trận n hàng, m cột (n > 0, m > 0). Kiểm tra ma trận có toàn dương hay không
public class Baitap37 {
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
	
	public static boolean ToanDuong(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
			if(arr[i][j] < 0) {
				return false;
				}
			}
		}
		return true;
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
		
		System.out.print("Kiem tra ma tran co toan gia tri duong khong :" + ToanDuong(iArray));
		
		
	}
}
