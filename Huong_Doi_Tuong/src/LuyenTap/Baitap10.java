package LuyenTap;

import java.util.Scanner;

public class Baitap10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		System.out.print("Input m = ");
		int m = sc.nextInt();
		int i;
		
		for (i = 1 ; (n*i)%m != 0 ; i++) {

		}
		System.out.println(n*i);
		
	}
}

