package HuynhAnhTien;

import java.lang.reflect.Array;
import java.util.Scanner;

import HuynhAnhTien_thigiuaki.ArrayList;

public class Baitap3 {
	public static void inputArray(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.printf("[%d][%d] = " , i , j );
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void printArray(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	


    static void HoandoiArray2D(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        System.out.print("col1 = ");
        int a = sc.nextInt() - 1;
        System.out.print("col2 = ");
        int b = sc.nextInt() - 1;

        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = tmp;
        }
        printArray(arr);
        
//        System.out.println("The matrix with columns " + (a + 1) + " and " + (b + 1) + " swapped is:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Create ArrayList from matrix
//        ArrayList<Integer> arrayList = new Array<Integer>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arrayList.add(arr[i][j]);
//            }
//        }
//        System.out.println("The ArrayList from the matrix is: " + arrayList);
    }
    
	
	
	public static void main(String[] args) {
		int row, col;
		int iArray[][];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Row : "); // dòng
		row = sc.nextInt();
		System.out.print("Col : "); // cột
		col = sc.nextInt();
		
		iArray = new int[row][col];
		
		System.out.println("Input array : ");
		inputArray(iArray);
		System.out.println("Entered array : ");
		printArray(iArray);
		
		System.out.println("Hoan doi :");
		HoandoiArray2D(iArray);
		
		
	}
}
