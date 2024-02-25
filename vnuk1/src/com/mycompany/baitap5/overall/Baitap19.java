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
//Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay không

public class Baitap19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isPrimeNumber = true; // isPrimeNumber la so nguyen to
        
        System.out.println("n = ");
        n = sc.nextInt();
        
        if (n <= 1) {
            isPrimeNumber = false;
        }else{
            for (int i = 2 ; i <= Math.sqrt(n); i++) {
                if ( n % i == 0 ) {
                    isPrimeNumber = false ;
                    break;
                }
            }
        }
        if(isPrimeNumber) {
            System.out.println(n + "is prime number ");
        }else{
            System.out.println(n + "is not prime number");
        }
    }
}
