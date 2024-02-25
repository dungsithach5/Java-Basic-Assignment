package LuyenTap;

import java.util.Scanner;

public class Baitap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i <= n ; i++) {
			if (i % 2 == 0 ) {
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}
