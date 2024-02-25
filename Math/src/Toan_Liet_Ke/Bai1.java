package Toan_Liet_Ke;

import java.util.Scanner;
// Bài toán liệt kê chuỗi nhị phân có độ dài n với số bit 0 bằng số bit 1.
public class Bai1 {
	public static void Init(int [] b , int n) {
		for(int i = 1 ; i <= n ; i++) {
				b[i] = 0;
		}
	}
	
	public static void Out(int [] b , int n) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
	}
	
	public static int Islast(int [] b , int n ) {
		for(int i = 1 ; i <= n ; i++) {
			if (b[i] == 0) {
				return 0; // không đúng thì trả về 0
			}
		}
		return 1; // đúng thì trả về 1
	}
	
	public static void Gen(int []  b , int n  ) {
		int i = n;
		while ( b[i] == 1) {
			i--;
		}
		b[i] = 1;
		for(int j = i + 1; j <= n ; j++) {
			b[j] = 0;
		}
	}

	public static void Method(int [] b , int n ) {
		Init(b,n);
		Out(b,n);
		int stop = Islast(b,n);
		while(stop == 0) {
			Gen(b,n);
			Out(b,n);
			stop = Islast(b,n); 
		}
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input n: ");
		 int n = sc.nextInt();
		 int [] b = new int[n + 1];
		 
		 Method(b,n);
		 
	}
}
