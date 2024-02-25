package ClassObject;

import java.util.Scanner;
import ClassObject.Triangle;

public class Triangle2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   double a, b, c;

		   do {
		       System.out.print("Nhap vao canh thu nhat: ");
		       a = sc.nextDouble();
		       System.out.print("Nhap vao canh thu hai: ");
		       b = sc.nextDouble();
		       System.out.print("Nhap vao canh thu ba: ");
		       c = sc.nextDouble();

		       if (a + b <= c || a + c <= b || b + c <= a) {
		           System.out.println("Khong thoa man canh tam giac. Hay nhap lai!");
		       }
		    } while (a + b <= c || a + c <= b || b + c <= a);

		    Triangle tg = new Triangle(a,b,c);

		    System.out.println("Thong tin tam giac la:");
		    System.out.println(tg.display1());
		    System.out.println(tg.display2());
		    System.out.println(tg.display3());
		     
		}
	
}
