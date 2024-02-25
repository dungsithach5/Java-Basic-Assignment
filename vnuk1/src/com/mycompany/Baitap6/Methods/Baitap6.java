package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

// Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số nguyên tố hay không

public class Baitap6 {
	public static void isPrimeNumber(int n) {
        boolean isPrimeNumber = true; // isPrimeNumber la so nguyen to
        
        
        if (n <= 1) {
            isPrimeNumber = false;
        }else{
            for (int i = 2 ; i <= Math.sqrt(n); i++) {
                if ( n % i == 0 ) {
                    isPrimeNumber = false ;
                    break;
                }
            }
        }
        if(isPrimeNumber) {
            System.out.println(n + "is prime number ");
        }else{
            System.out.println(n + "is not prime number");
        }
        return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("n = ");
		isPrimeNumber(n);
	}
}
