package TRY_CATCH;

import java.util.Scanner;


public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("Input: ");
			String nunStr = sc.next();
			
			try {
				n = Integer.parseInt(nunStr);
				System.out.println("n = " + n);
				break;
			}catch (Exception e) {
				System.out.println("ERROR : " + e.getMessage());
			}
		}
	}
}
