package PP_Quay_Lui;

import java.util.Scanner;

public class Bai_Toan_Xep_Hau {
	static int d = 0 ;
	public static void Out(int[] x,int n) {
		System.out.print(++d + " ");
		for (int i=1; i<=n ; i++) {
			System.out.print(x[i]);
		}
		System.out.println("");
	}
	
	public static void init(int[]a,int[] b, int[]c , int n) {
		for (int i =1; i<=n;i++) {
			a[i]=1;
		}
		for(int i=2; i<=2*n; i++) {
			b[i] = 1;
		}
		for(int i=1-n; i<=n-1;i++) {
			c[n+i]=1;
		}
		
	}
	public static void Try(int i, int[] x, int[]a, int[]b, int[] c, int n) {
		
		for (int j = 1; j<=n;j++) {
			if(a[j]==1 && b[i+j]==1&&c[n+i-j]==1) {
				x[i]=j;
				a[j]=0;
				b[i+j]=0;
			    	c[n+i-j]=0;
				if(i==n) {
					Out(x,n);
					
				}else {Try(i+1,x,a,b,c,n);}
				a[j]=1;
				b[i+j]=1;
				c[n+i-j]=1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.print("nhap n = ");
		int n = Obj.nextInt();
		int[] a = new int [n+1];
		int[] b = new int [2*n+2];
		int[] c = new int[100];
		int[] x = new int[n+1];
		init(a,b,c,n);
		Try(1,x,a,b,c,n);
	}
}
