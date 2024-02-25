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
public class LoopDEMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        
        // Lệnh while
       /* while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
       */
       
       // Lệnh do while
      /* do {
           sum += i;
           i++;
       } while (i <= n);
       System.out.println("Sum: "+ sum);
       */
      
      // Lệnh for
      /*
           sum +=i;
           i++;
           for(i = 0 ; i <= n ; i++){
               sum +=i;
           }
           System.out.println("Sum: " + sum);
      */
    }
}
