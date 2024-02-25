package PP_Quay_Lui;

import java.util.Scanner;
// Phương pháp quay lui hoán vị
public class Bai2 {
	public static void Out(int [] s , int n) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(s[i]);
		}
		System.out.println();  
	}
	
	static void Try(int i , int s[] , int b[] , int n) {
		for(int j = 1; j <= n ; j++) {
			if(b[j] == 1 ) {
				s[i] = j;
				b[j] = 0;
				if(i == n) Out(s,n);
				else Try(i+1,s,b,n);
				b[j] = 1;
			}
 		}
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Input n: ");
		 int n = sc.nextInt();
		 int [] b = new int[n + 1];
		 int [] s = new int[n + 1];		 
		 for(int i = 1; i  <= n ; i++) {
			 b[i] = 1;
		 }
		 Try(1,s,b,n);
		 
	}
}
