package PP_Quay_Lui;

import java.util.Scanner;

public class Bai1 {
	public static void Out(int [] b , int n) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
	}
	
	static void Try(int i , int b[] , int n) {
		for(int j = 0 ; j <= 5 ; j++) {
			if(j == 0 || j == 1 ) {
				b[i] = j;
				if( i == n) {
					Out(b,n);
				}else {
					Try(i + 1 , b, n);
				}
			}
		}
	}

	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input n: ");
		 int n = sc.nextInt();
		 int [] b = new int[n + 1];
		 
		 int i = 0;
		 Try(1,b,n);
		 
	}
}
