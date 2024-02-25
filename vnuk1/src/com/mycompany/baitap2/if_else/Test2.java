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
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat() , b = sc.nextFloat() , c = sc.nextFloat();
        
        float delta = b*b - 4*a*c;
        
        if (delta < 0) {
            System.out.println("Phuong trinh VN");
        }else if (delta == 0){
            float x = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        }else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Nghiem x1 = " + x1 + ",x2 = " + x2);
        }
    }
}
