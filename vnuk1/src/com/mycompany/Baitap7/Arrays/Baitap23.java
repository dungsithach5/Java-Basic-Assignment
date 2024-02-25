package com.mycompany.Baitap7.Arrays;

//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Dịch trái xoay vòng k lần trong mảng
import java.util.ArrayList;
import java.util.Scanner;
public class Baitap23 {
	public static void rotate(int [] arr , int k) {
		int[] tmp = arr.clone();
		
		int len = arr.length;
		if (k >= len) {
			k = k % len;
		}
		for(int i = 0 ; i < len ; i++) {
			int j = i + k;
			if (j >= len) {
				j = j % len;
			}
			arr[j] = tmp[i];
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
				System.out.print((i + 1) + " ");
		}
	}
	
	public static void main(String[] args) {
        int n;
        int[] iArray;
        Scanner sc = new Scanner(System.in);
        
        //input n
        System.out.print("Num = ");
        n = sc.nextInt();
        iArray = new int[n];
        
        System.out.println("Input array:");
        inputArray(iArray);
        
        System.out.print("Entered array: ");
        printArray(iArray);
        
        //rotate
        rotate(iArray, 7);
        System.out.print("\nRotate: ");
        printArray(iArray);
        
        
        
    }
}
