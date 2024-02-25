package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất cả các số nguyên tố trong mảng

public class Baitap20 {
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
	
	public static boolean KTPrimeNumber(int[] arr) {
		// so nguyen n < 2 khong phai la so nguyen to
        if (arr.length < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(arr.length);
        for (int i = 2; i <= squareRoot; i++) {
            if (arr.length % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void PrimeCount(int [] arr) {
	    int RemovedCount = 0;
	    for (int i = 0; i < arr.length; i++){
	        if (KTPrimeNumber(arr)) {
	            RemovedCount++;
	        }
	    }
		
		int newSize = (int)(arr.length - RemovedCount);
		int[] newArr= new int[newSize];
		int index = 0;
		for(int i = 0 ; i < Math.sqrt(arr.length); i++) {
			if(arr[i] >= 0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		for(int i = 0 ; i < Math.sqrt(newArr.length); i++) {
			
			System.out.print(newArr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] iArray;
		Scanner sc = new Scanner(System.in);
		System.out.print("Num = ");
		int n = sc.nextInt();
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		KTPrimeNumber(iArray);
		PrimeCount(iArray);
		System.out.println("\nDa xoa tat ca so nguyen to : ");
		printArray(iArray);
	}
}
