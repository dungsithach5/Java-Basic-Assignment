/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biatap3.switch_case;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
/*Nhập vào ký tự A →  F hoặc a →  f. In ra học lực như sau:
	A hoặc a	: Excellent
	B hoặc b	: Good
	C hoặc c	: Pretty good
	D hoặc d	: Average
	F hoặc f	: Failed
	Ký tự khác	: UNKNOWN*/

public class Baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        switch(n) {
            
            case "A":
            case "a":
                System.out.println("Excellent");
                break;
            case "B":
            case "b":
                System.out.println("Good");
                break;
            case "C":
            case "c":
                System.out.println("Pretty good");
                break;
            case "D":
            case "d":
                System.out.println("Average");
                break;
            case "F":
            case "f":
                System.out.println("Failed");
                break;
            default:
                System.out.println("UNKNOWN");
        }
    }
}
