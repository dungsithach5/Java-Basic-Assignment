package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

public class DEMO2 {
	static boolean isPrimeNumber(int n) {
		if (n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	static int sumElements(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		boolean a = isPrimeNumber(n);
		System.out.println(a);
		System.out.println(isPrimeNumber(n));
	
	}

}

// void gặp return sẽ dừng và ko chạy tiếp các lệnh khác
// chuyển tham trị vs chuyển tham chiếu
// chuyển tham trị là chuyền 1 giá trị copy r đưa vào hàm và ko ảnh hưởng cái gốc
/* VD : add( int a , int b ) Ơ
a = a - 10;
b = b - 10;
return a + b;
Ư
main 
a = 10;
b = 20;
// chuyển tham chiếu là 
