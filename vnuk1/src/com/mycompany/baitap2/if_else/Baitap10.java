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
/*Bạn có thời gian rảnh và đi làm thêm cho một cửa hàng tạp hóa. Bạn được nhận tiền hoa hồng dựa vào doanh số bán hàng như sau:
5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
20 % nếu tổng doanh số là lớn hơn 300 triệu.
	Viết chương trình nhập vào tổng doanh số bạn bán được và tính số tiền hoa hồng bạn nhận được.
*/

public class Baitap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doanhso = sc.nextInt();
        
        if ( doanhso <= 100){
            System.out.println(" hoa hong nhan duoc la " + doanhso*5/100);
        }
        if ( doanhso <= 300){
            System.out.println("hoa hong nhan duoc la " + doanhso*10/100);
        }
        if ( doanhso > 300){
            System.out.println("hoa hong nhan duoc la " + doanhso*20/100);
        }
    }  
        
}
