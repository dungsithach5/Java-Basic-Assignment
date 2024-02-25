package HuynhAnhTien;

import java.util.Scanner;



public class Baitap2 {
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("[%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static boolean KTPrimeNumber(int[] arr , int n) {
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
	
	public static int PrimeCount(int [] arr , int n) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++){
	        if (KTPrimeNumber(arr, arr[i])) {
	            count++;
	        }
	    }
	    return count;
	}
	
	public static void PrintPrime(int [] arr , int n) {
		int S = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (KTPrimeNumber(arr, arr[i])) {
	            S += arr[i];
	        }
	    }
	    System.out.print(S);
	}
	
	public static void MinArray(int[] arr) {
		int min = 10;
		int n;
		for(int i = 0 ; i < arr.length - 2 ; i++) {
				if (min > arr[i] ) {
					min = arr[i];
				}
				System.out.printf("%d " , arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
            System.out.print("Num = ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.println("Yeu cau nhap lai n > 0 va n < 10");
            }else{
                break;
            }
        }
		int [] iArray;
		
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		KTPrimeNumber(iArray , n);
		PrimeCount(iArray , n);
		System.out.print("\nTong : ");
		PrintPrime(iArray , n);
		System.out.print("\n3 phan tu lien tiep nho nhat : ");
		MinArray(iArray);
		
	}

}
