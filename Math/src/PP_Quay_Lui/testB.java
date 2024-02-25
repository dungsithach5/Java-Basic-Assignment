package PP_Quay_Lui;

import java.util.Scanner;

public class testB {
	public static void Out(int [] s , int n) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(s[i]);
		}
		System.out.println();  
	}
	
	static void Try(int i , int s[] , int b[] , int n) {
		for (char x = 'a'; x <= 'c'; x++) {
		    for (char y = 'd'; y <= 'e'; y++) {
		        for (char z = 'm'; z <= 't'; z++) {
		            System.out.println("" + x + y + z);
		        }
		    }
		}
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input n: ");
		 int n = sc.nextInt();
		 int [] b = new int[n + 1];
		 int [] s = new int[n + 1];		 
		 for(int i = 1; i  <= n ; i++) {
			 b[i] = 1;
		 }
		 Try(1,s,b,n);
		 
	}
}
