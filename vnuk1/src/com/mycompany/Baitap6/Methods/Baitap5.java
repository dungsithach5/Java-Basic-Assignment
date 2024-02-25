package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

public class Baitap5 {
	public static int PrimeNumber(int n) {
        int S = 0;
        int i;
        for ( i = 1 ; i <= n/2 ; i++) {
            if (n % i == 0 ) {
                S += i;
            }
        }
        if(S==n) {
            System.out.println(n);
        }
        return S;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("So hoan hao = " + PrimeNumber(n));
	}
}
