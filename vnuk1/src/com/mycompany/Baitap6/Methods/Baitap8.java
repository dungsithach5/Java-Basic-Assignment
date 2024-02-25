package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Nhập số nguyên n. Viết hàm đếm số lượng chữ số của số nguyên dương n (

public class Baitap8 {
	public static int Demsoluong(int n) {
		int count = 0;
        int i = 0;
        
        
        do {
            n /= 10;
            i++;
            count++;
        }while(n > 0);
        return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Yeu cau nhap lai n > 0");
            }else{
                break;
            }
        }

		System.out.println("dem so so luong chu so " + Demsoluong(n));
	}
}
