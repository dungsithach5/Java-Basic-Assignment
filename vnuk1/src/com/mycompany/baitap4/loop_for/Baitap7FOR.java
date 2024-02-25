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
/*
Tạo bảng số như dưới
0	1	2	3	4	5	6	7	8	9
10	11	12	13	14	15	16	17	18	19
…
90	91	92	93	94	95	96	97	98	99

*/
public class Baitap7FOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for (int i = 1 ; i <= 10 ; i++){
            for(int j = 1 ; j <= 10 ; j++) {
                    System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
