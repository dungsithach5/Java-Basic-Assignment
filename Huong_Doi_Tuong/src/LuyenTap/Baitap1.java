package LuyenTap;

import java.util.Scanner;

public class Baitap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + " is an even number");
		}else {
			System.out.println(n + " s a odd number");
		}
	}
}
