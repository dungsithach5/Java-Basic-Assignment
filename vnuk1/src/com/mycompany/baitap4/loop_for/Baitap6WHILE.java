/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4.loop_for;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Baitap6WHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int S=1;
		
                if (n % 2 == 0){
                    int i = 2;
                    while(i <= n) {
                        S *= i;
                        i+=2;
                    }
                }else{
                    int i = 1;
                    while(i <= n) {
                        S *= i;
                        i+=2;
                    }
                }
                System.out.println(S);
    }
}
