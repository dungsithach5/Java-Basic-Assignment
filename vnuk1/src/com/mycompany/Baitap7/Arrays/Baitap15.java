package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;
//ết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp số nguyên tố tăng dần nhưng giá trị khác giữ nguyên vị trí

public class Baitap15 {
	public static void increasingSort(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) { // tăng dần
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
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
	
	public static void PrimeCount(int [] arr) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++){
	    		if (KTPrimeNumber(arr, arr[i])) {
	    			count++;
	        	}
	    }
	    
	   
	}
	
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("[%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 int [] iArray;
		 System.out.print("Num = ");
		 n = sc.nextInt();
		 iArray = new int[n];
		 System.out.println("Input array :");
		 inputArray(iArray);
		 System.out.print("Entered array : ");
		 printArray(iArray);
		 
		 KTPrimeNumber(iArray , n);
		 PrimeCount(iArray);
		 increasingSort(iArray);
		 System.out.print("\nListPrimeNumber : ");
		 
		 printArray(iArray);
	}
}
