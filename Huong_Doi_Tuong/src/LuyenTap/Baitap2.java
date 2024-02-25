package LuyenTap;

import java.util.Scanner;

public class Baitap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a = ");
		float a = sc.nextInt();
		System.out.print("Input b = ");
		float b = sc.nextInt();
		
		if (a == b) {
			System.out.println(a +" equal " + b);
		}else if(a > b) {
			System.out.println(a + " greater than " + b);
		}else {
			System.out.println(a + " less than " + b);
		}
	}
}
