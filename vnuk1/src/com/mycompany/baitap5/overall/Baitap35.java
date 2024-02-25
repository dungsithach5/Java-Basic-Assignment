package com.mycompany.baitap5.overall;

import java.util.Scanner;

// Nhập số nguyên N. Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N

public class Baitap35 {
	public static void main(String[] args) {
		int m = 0 , n, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" n: ");
            n = sc.nextInt();
        } while (n < 0 && n > 10);
         
        while ((sum + m) < n) {
            sum += ++m; // tăng m lên 1 đơn vị và tính sum = sum + m
            System.out.print(m);   
            if ((sum + m) < n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum + " <= " + n);
  
        
        System.out.println("m  = " + m);
	}

}
