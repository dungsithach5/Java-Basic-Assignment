package LuyenTap;

import java.util.Scanner;

public class Baitap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		int S = 0;
		
		for (int i = 0 ; i <= n ; i++) {
			S += i;
		}
		System.out.println("Sum = " + S);
	}
}
