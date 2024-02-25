package LyThuyet_HDT;

import java.util.Scanner;

// CLASS VARIABLE vs INSTANCE VARIABLE

public class Static {
	int a; 
	static int b; // chứa 1 giá trị duy nhất	
	public void  test(){
		//a = 5;// instant variable chỉ nằm trong 1 hàm nhất định
		b = 5;// class variable  có thể chạy ở mọi hàm
		//(static methods kiểu void)
	}
	
	void sum1() { // instance method , chứa nhiều giá trị khác nhau
		
	}
	
	static void sum() { // class static method , chứa duy nhất 1 giá trị
		
	}
	
	public static void main(String[] args) {
		Static num1 = new Static();
		System.out.println(num1.a); // phải khởi tạo object trc r mới in ra
		
		num1.b=6; // chứa 1 giá trị duy nhất
		System.out.println(b); // in ra b ko cần phải khởi tạo object
	}

}
