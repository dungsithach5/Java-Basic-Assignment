package LuyenTap;

import java.util.Scanner;

public class Baitap8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			if(n % i == 0) {
				System.out.println("divisor of " + n + " is " + i);
			}
		}
		
	}
}
