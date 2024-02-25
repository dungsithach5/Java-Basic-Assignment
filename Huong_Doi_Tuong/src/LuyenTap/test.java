package LuyenTap;

import java.util.Scanner;



public class test {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Nhập vào cạnh a: ");
		    int a=(input.nextInt());
		    System.out.println("Nhập vào cạnh b: ");
		    int b = input.nextInt();
		    System.out.println("Nhập vào cạnh c: ");
		    int c = input.nextInt();
		    if( a<b+c && b<a+c && c<a+b ){
		      if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
		        System.out.println("Đây là tam giác vuông");
		      else if(a==b && b==c)
		        System.out.println("Đây là tam giác đều");
		      else if(a==b || a==c || b==c)
		        System.out.println("Đây là tam giác cân");
		      
		    }
		    else
		      System.out.println("Ba cạnh a, b, c không phải là ba cạnh của một tam giác");
		  }
}
