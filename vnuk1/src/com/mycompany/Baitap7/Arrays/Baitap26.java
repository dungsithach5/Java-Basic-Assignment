package com.mycompany.Baitap7.Arrays;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tạo mảng b chỉ chứa số nguyên tố từ mảng a

import java.util.Scanner;

public class Baitap26 {
	public static void inputArray(int [] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.printf(" [%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void printArrayB(int[] brr) {
		for(int i = 0 ; i < brr.length ; i++) {
			System.out.print(brr[i] + " ");
		}
	}
	
	public static boolean KTPrimeNumber(int[] arr , int n) {
		// so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static int PrimeCount(int [] arr , int n) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++){
	        if (KTPrimeNumber(arr, arr[i])) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static void MangBchuasonguyentocuamangA(int[] arr , int[] brr) {
		int iArrayb , nb = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(KTPrimeNumber(arr, arr[i])) {
				brr[nb] = arr[i];
				nb++;	
			}
		}
	}
	
	public static void main(String[] args) {
		int[] iArray;
		int[] iArrayb;
		Scanner sc = new Scanner(System.in);
		System.out.print("Num = ");
		int n = sc.nextInt();
		iArray = new int[n];
		iArrayb = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		KTPrimeNumber(iArray , n);
		PrimeCount(iArray , n);
		MangBchuasonguyentocuamangA(iArray, iArrayb);
		System.out.println("\nMang B chua so le cua mang A la :");
		printArrayB(iArrayb);
	}
}
