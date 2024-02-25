package LuyenTap;

import java.util.Scanner;

public class Baitap5 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        float a = sc.nextFloat() , b = sc.nextFloat() , c = sc.nextFloat();
	        
	        float delta = b*b - 4*a*c;
	        
	        if (delta < 0) {
	            System.out.println("Phuong trinh VN");
	        }else{
	            double x1 = (-b + Math.sqrt(delta))/(2*a);
	            double x2 = (-b - Math.sqrt(delta))/(2*a);
	            System.out.println("x1 = " + x1 + ",x2 = " + x2);
	        }if (delta == 0) {
	            System.out.println("[Phuong trinh co nghiem kep x1 = x2 = " + -b/2*a);
	        }
	}
}
