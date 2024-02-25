package com.mycompany.Baitap7.Arrays;




import java.util.Scanner;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Đảo ngược mảng ban đầu

public class Baitap22 {
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
	
	public static void DaoNguoc(int arr[] , int start , int end) {
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
		   if(start >= end) {
			   return;
		   }
		   temp = arr[start];
		      arr[start] = arr[end];
		      arr[end] = temp;
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
		 
		 System.out.print("\n Dao nguoc cua mang la : " + DaoNguoc(iArray));
		
		 
		 
	}
}
