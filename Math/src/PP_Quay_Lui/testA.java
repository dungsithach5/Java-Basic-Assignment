package PP_Quay_Lui;

import java.util.Scanner;

public class testA {
	static int d = 0 ;
	public static void Out(int [] b , int n) {
		System.out.println(++d + " ");
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
	}
	
	static void Try(int i , int b[] , int n) {
		for (int x1 = 0; x1 <= 15; x1++) {
		    for (int x2 = 0; x2 <= 15 - x1; x2++) {
		        int x3 = 15 - x1 - x2;
		        System.out.println("x1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3);
		    }
		}
	}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = sc.nextInt();
		int [] b = new int[n + 1];
		Try(1,b,n);
	}
}
