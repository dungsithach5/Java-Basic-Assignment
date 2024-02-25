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
/*
Điểm học phần của môn Tin học được tính như sau: chuyên cần (20%), giữa kỳ (30%), cuối kỳ (50%). Và điểm học phần được xếp loại như sau:
điểm >=8.5		: Hạng A
7 <= điểm < 8.5	: Hạng B
5.5 <= điểm < 7	: Hạng C
4 <= điểm < 5.5	: Hạng D
điểm < 4		: Hạng F
	Viết chương trình nhập điểm môn Tin học và in ra cho người dùng biết điểm học phần môn này và xếp hạng gì?

*/

public class Baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        
        if ( n >= 8.5 ) {
            System.out.println("Rank A");
        }
        if ( n >= 7 && n < 8.5 ){
            System.out.println("Rank B");
        }
        if ( n >= 5.5 && n < 7 ){
            System.out.println("Rank C");
        }
        if ( n >= 4 &&  n < 5.5 ){
            System.out.println("Rank D");
        }
        if ( n < 4 ) {
            System.out.println("Rank F");
        }
               
        
    }
}
