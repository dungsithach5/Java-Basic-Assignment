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
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a , b;
        
        System.out.print("a = ");
        a = sc.nextFloat();
        
       System.out.print("b = ");
       b = sc.nextFloat();
       
       if (a != 0) {
           System.out.println("x = " + -b/a);
       }else{
           if (b == 0) {
               System.out.println("Phuong trinh VSM");
           }else{
               System.out.println("Phuong trinh VN");
           }
       }
        
    }
}
