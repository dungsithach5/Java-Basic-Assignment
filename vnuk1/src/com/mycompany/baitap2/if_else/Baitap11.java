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
Nhà bạn hàng tháng phải đóng tiền điện và được tính như sau:
Từ 0 - 50 kwh				đơn giá 1 480 vnđ/kwh
Từ 51 kwh trở đi đến 100 kwh 		đơn giá 1 500 vnđ/kwh
Từ 101 kwh trở đi đến 200 kwh 		đơn giá 1 700 vnđ/kwh
Từ 201 kwh trở lên		 		đơn giá 2 800 vnđ/kwh
	Viết chương trình nhập vào tổng số kwh điện đã dùng và tính số tiền phải trả? 	

*/

public class Baitap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n > 0 && n < 50) {
            System.out.println("So tien phai tra la " + n * 1480);
        }
        if (n > 51 && n < 100) {
            System.out.println("So tien phai tra la " + n * 1500);
        }
        if (n > 101 && n < 200) {
            System.out.println("So tien phai tra la " + n * 1700);
        }
        if (n > 201) {
            System.out.println("So tine phai tra la " + n * 2000);
        }
    }
}
