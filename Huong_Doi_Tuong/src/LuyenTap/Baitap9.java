package LuyenTap;

import java.util.Scanner;

public class Baitap9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		System.out.print("Input a = ");
		int a = sc.nextInt();
		System.out.print("Input b = ");
		int b = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			if(a % i == 0 && b % i == 0) {
				System.out.println(a + " and " + b + " have common divisors is " + i);
			}
		}
		
	}
}
