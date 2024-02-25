package Toan_Liet_Ke;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
        System.out.print("input n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        Method(a, n);
    }

    public static int islast(int[] a, int n) {
        for (int i = 1; i <= n - 1; i++) {
            if (a[i] < a[i + 1]) return 0;
        }
        return 1;
    }

    public static void gen(int[] a, int n) {
        int i = n - 1;
        while (a[i] > a[i + 1]) {
            i--;
        }
        int k = n;
        while (a[k] < a[i]) {
            k--;
        }
        int t = a[i];
        a[i] = a[k];
        a[k] = t;

        int l = i + 1;
        int r = n;
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void Method(int[] a, int n) {
        init(a, n);
        out(a, n);
        int stop = islast(a, n);
        while (stop == 0) {
            gen(a, n);
            out(a, n);
            stop = islast(a, n);
        }
    }

    public static void init(int[] a, int n) {
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }
    }
    
    static int d = 0;
    public static void out(int[] a, int k) {
        System.out.print(++d + ": ");
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
