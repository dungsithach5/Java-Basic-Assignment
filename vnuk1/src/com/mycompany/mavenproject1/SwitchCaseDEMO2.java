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
public class SwitchCaseDEMO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt() , year = sc.nextInt();
        
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "/" + year + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "/" + year + " has 30 days");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(month + "/" + year + " has 29 days");
                }else{
                    System.out.println(month + "/" + year + " has 28 days");
                }
                break;
            default:
                System.out.println(month + "/" + year + " is not valid");
                
        }
    }
}
