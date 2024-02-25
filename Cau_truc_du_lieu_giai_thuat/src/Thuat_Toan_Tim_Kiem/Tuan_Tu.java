package Thuat_Toan_Tim_Kiem;

import java.io.File;
import java.util.Scanner;

// THUẬT TOÁN TÌM KIẾM TUẦN TỰ
public class Tuan_Tu {
	public static void main(String[] args) {
		int[] a = {1, 5, 8, 12, 3, 7, 15, 6}; // n
		int n = a.length - 1;
		int k = 15;
		
		
		//System.out.println(linearSearch(a,k,n));
		System.out.println(sentinelSearch(a,k,n));
	}
	
	// tìm kiếm tuần tự lính canh
	public static int sentinelSearch(int[] a , int k , int n) {
		a[n] = k; // đặt lính canh vào cuối mảng //n - 1 để không vượt quả mảng
		int i = 0;
		while (a[i] != k) {
			i++;
		}
		if(i < n) {
			return i;
		}else {
			return -1;
		}
	}
	
	//  tìm kiếm tuần tự
	public static int linearSearch(int[] a , int k , int n ) {
		for(int i = 0 ; i < n ; i++) {
			if(a[i] == k) {
				return i;
			}
		}
		return -1;
	}
	
}
