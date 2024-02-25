package Toan_Liet_Ke;

import java.util.Scanner;

// Bài toán liệt kê tập con k phần tử của tập n phần tử

public class Bai2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n = ");
        int n = scanner.nextInt();

        System.out.print("Input k = ");
        int k = scanner.nextInt();

        int[] a = new int[k + 1];
        method(a, n, k);

        scanner.close();
    }

    public static int isLast(int[] a, int n, int k) {
        for (int i = 1; i <= k; i++) {
            if (a[i] != n - k + i) return 0;
        }
        return 1;
    }

    public static void generate(int[] a, int n, int k) {
        // Bước 1
        int i = k;
        while (a[i] == n - k + i) {
            i--;
        }
        // Bước 2
        a[i] = a[i] + 1;
        // Bước 3
        for (int j = i + 1; j <= k; j++) {
            a[j] = a[i] + j - i;
        }
    }

    public static void method(int[] a, int n, int k) {
        init(a, k);
        out(a, k);
        int stop = isLast(a, n, k);
        while (stop == 0) {
            generate(a, n, k);
            out(a, k);
            stop = isLast(a, n, k);
        }
    }

    public static void init(int[] a, int k) {
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
    }

    public static void out(int[] a, int k) {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
	
}
