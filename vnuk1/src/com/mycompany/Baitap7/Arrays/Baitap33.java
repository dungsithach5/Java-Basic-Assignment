package com.mycompany.Baitap7.Arrays;
//Nhập ma trận n hàng, m cột (n > 0, m > 0). Đếm số lượng số nguyên tố trong ma trận

import java.util.Scanner;

public class Baitap33 {
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
	
	public static boolean KTPrimeNumber(int[][] arr , int col , int row) {
		// so nguyen n < 2 khong phai la so nguyen to
        if (arr.length < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(arr.length);
        for (int i = 2; i <= squareRoot; i++) {
        	for(int j = 2; j <= squareRoot; j++) {
        		if (arr.length % i == 0 && arr[0].length % j == 0 ) {
                    return false;
        		}
        	}
        }
        return true;
    }
	
	public static int PrimeCount(int [][] arr , int col , int row) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++){
	    	for(int j = 0; j < arr[0].length; i++) {
	    		 if (KTPrimeNumber(arr[i],arr[j])) {
	 	            count++;
	 	        }
	    	}
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		int n;
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
		
		
		KTPrimeNumber(iArray, col);
		System.out.println("Dem so luong so nguyen to trong ma tran : ");
		PrimeCount(iArray ,col);
		printArray(iArray);
		
	}
}
