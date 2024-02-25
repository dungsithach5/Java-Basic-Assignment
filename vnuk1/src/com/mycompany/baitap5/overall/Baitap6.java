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
//Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93

public class Baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1 ; i <= 100 ; i+=2) {
            if (i != 5 && i != 7 && i != 93) {
                System.out.print(i + " ");
            }
        }
    }
}
