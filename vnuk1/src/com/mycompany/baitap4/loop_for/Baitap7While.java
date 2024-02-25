/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4.loop_for;

/**
 *
 * @author LENOVO
 */
public class Baitap7While {
    public static void main(String[] args) {
        int n = 0;
        int i = 1 , j = 1;
        while (i < 11) {
            while (j < 11) {
                System.out.print(n  + " ");
                n++;
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
            
}
