package HuynhAnhTien;

import java.util.Scanner;

public class Baitap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input x = ");
		int x = sc.nextInt();
		
		if(x >= 10) {
			int fx1 = x*x + 7*x + 20;
					System.out.print("fx1 = " + fx1);
		}else if(x < 10) {
			int fx2 = -2*x + x -20;
			System.out.print("fx2 = " + fx2);
		}
		
	}
}
