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
/*Viết chương trình tính:
		n!! = 1 * 3 * 5 *… * n (nếu n lẻ)
                            = 2 * 4 * 6 * … *n (nếu n chẵn)
	Ví dụ: n = 7 → n!! = 1 * 3 * 5 * 7 = 105
		n = 6 → n!! = 2 * 4 * 6 = 48
*/

public class Baitap6FOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = 1;
    /*
        if (n % 2 ==0){
            for (int i = 2 ; i <= n ; i+=2){
                S*=i;
            }
        }else{
            for (int i = 1 ; i <= n ; i+=2){
                S*=i;
            }
        }
        System.out.println(S);
    */
        for(int i = n ; i > 0 ; i -= 2) {
            S *= i;
        }
        System.out.println(S);
    }
}
