package com.mycompany.Baitap6.Methods;
//Liệt kê tất cả các số nguyên tố nhỏ hơn n (Sử dụng hàm kiểm tra số nguyên tố)

import java.util.Scanner;

public class Baitap18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.printf("Liet ke cac so nguyen to nho hon %d la: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
     
    /**
     * check so nguyen to
     * 
     * @author viettuts.vn
     * @param n: so nguyen duong
     * @return true la so nguyen so, 
     *         false khong la so nguyen to
     */
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

