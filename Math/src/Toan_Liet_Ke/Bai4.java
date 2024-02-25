package Toan_Liet_Ke;

import java.util.Scanner;

public class Bai4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số phần tử n: ");
	        int n = scanner.nextInt();
	        System.out.print("Nhập số phần tử cần chọn k: ");
	        int k = scanner.nextInt();

	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = i + 1;
	        }

	        int[] result = new int[k];
	        for (int i = 0; i < k; i++) {
	            result[i] = i + 1;
	        }

	        while (true) {
	            print_result(result);

	            int i;
	            for (i = k - 1; i >= 0; i--) {
	                if (result[i] != n - k + i + 1) {
	                    break;
	                }
	            }

	            if (i < 0) {
	                break;
	            }

	            result[i]++;
	            for (int j = i + 1; j < k; j++) {
	                result[j] = result[j - 1] + 1;
	            }
	        }
	    }

	    public static void print_result(int[] result) {
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + " ");
	        }
	        System.out.println();
	    }
}
