/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap5.overall;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
//Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25

public class Baitap17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1;
        int i;
        for(i = 1 ; i <= n ; i++) {
            if (i % 2 != 0 && n % i == 0 && max < i) {
                max = i;
            }
        }
        System.out.println("uoc so le lon nhat la :" + max);
    }
}
