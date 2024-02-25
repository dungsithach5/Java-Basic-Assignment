/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2.if_else;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
//Viết một chương trình nhập 3 số nguyên và tìm giá trị lớn nhất.

public class Baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
        
        if (a > b && a > c) {
            System.out.println("a la gia tri lon nhat");
        }
        if (b > a && b > c) {
            System.out.println("b la gia tri lon nhat");
        }
        if (c > a && c > b) {
            System.out.println("c la gia tri lon nhat");
        }
    }
}
