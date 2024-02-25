/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class InputDEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String address;
        
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Address: ");
        address = sc.nextLine();
        
        sc.next();
        System.out.printf("name: %s , age: %d , address: %s" , name , age , address);
    }
    
}