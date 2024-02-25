/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap4.loop_for;

/**
 *
 * @author LENOVO
 */
public class Baitap7DOWHILE {
    public static void main(String[] args) {
        int n = 0;
        int i = 1 , j = 1;
        do{
            do{
                System.out.print(n + " ");
                n++;
                j++;
            }while (j < 11);
            System.out.println();
            j = 1;
            j++;
           
        }while (i < 11 );
    }
         
}
