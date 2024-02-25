package LuyenTap;

import java.util.Scanner;

public class Baitap6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		int tmp;
		int reverse = 0;
		while(n > 0) {
			tmp = n % 10;
			n /= 10;
			reverse = reverse*10 + tmp;	
		}
		System.out.println(reverse);
	}
}
