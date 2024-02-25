package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

// Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số hoàn hảo hay không

public class Baitap5 {
	public static int PrimeNumber(int [] arr , int n) {
        int S = 0;
        int i;
        for ( i = 1 ; i <= arr.length/2 ; i++) {
            if (arr.length % i == 0 ) {
                S += i;
            }
        }
        if(S==n) {
            System.out.println(n);
        }
        return S;
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
	
	public static boolean KtSoHoanHao(int[] arr , int n) {
		int S = 0;
        int i;
        for ( i = 1 ; i <= arr.length/2 ; i++) {
            if (arr.length % i == 0 ) {
                S += i;
            }
            if(S==arr.length) {
                return true;
            }
        }
        return false;
        
    }
	
	public static int PrimeCount(int [] arr , int n) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++){
	        if (KtSoHoanHao(arr, arr[i])) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static void PrintSoHoanHao(int [] arr , int n) {
	    for (int i = 0; i < arr.length; i++) {
	        if (KtSoHoanHao(arr, arr[i]))
	        {
	            System.out.printf("%d " , arr[i]);
	        }
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int [] iArray;
		System.out.print("Num = ");
		n = sc.nextInt();	
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		KtSoHoanHao(iArray , n);
		PrimeCount(iArray , n);
		System.out.println("\nLiet ke so hoan hao : ");
		PrimeNumber(iArray , n);
	}
}
