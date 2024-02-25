package com.mycompany.Baitap7.Arrays;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Thêm 1 phần tử x vào mảng tại vị trí k

import java.util.Scanner;

public class Baitap17 {
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.printf(" [%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	 public static int [] insert(int [] arr, int k) {
	        int arrIndex = arr.length - 1;
	        int tempIndex = arr.length;
	        int [] tempArr = new int [tempIndex + 1];
	        boolean inserted = false;
	         
	        for (int i = tempIndex; i >= 0; i--) {
	            if (arrIndex > -1 && arr[arrIndex] > k) {
	                tempArr[i] = arr[arrIndex--];
	            } else {
	                if (!inserted) {
	                    tempArr[i] = k;
	                    inserted = true;
	                } else {
	                    tempArr[i] = arr[arrIndex--];
	                }
	            }
	        }
	        return tempArr;
	    }
	
	
	public static void main(String[] args) {
		int i = 0 ;
		int[] iArray;
		Scanner sc = new Scanner(System.in);
		System.out.print("Num = ");
		int n = sc.nextInt();
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		System.out.print("k = ");
		int k = sc.nextInt();
		
		insert(iArray, k);
		System.out.printf("\nChen phan tu %d vao mang %d : " , k , i);
		printArray(iArray);
	}
}
