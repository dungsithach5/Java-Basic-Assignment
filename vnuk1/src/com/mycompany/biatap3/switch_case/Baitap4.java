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
/*Nhập tháng và năm. In ra màn hình tháng đó có bao nhiêu ngày. 
Ví dụ:
Nhập 3 ⇒ Thang 3 co 31 ngay
Nhap 13 ⇒ Khong co thang 13
Ghi chú: cách xác định năm nhuận: năm chia hết cho 4 và không chia hết cho 100, hoặc chia hết cho 400. 
*/

public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        
        System.out.print("Month = ");
        month = sc.nextInt();
        
        System.out.print("Year = ");
        year = sc.nextInt();
        
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    System.out.print(month + "/" + year + " has 31 days" );
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print(month + "/" + year + " has 30 days");
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.print(month + "/" + year + " has 29 days"); 
            } else { 
                    System.out.print(month + "/" + year + " has 28 days");
            }     
                break;
            default:
                System.out.print(month + "/" + year + " is not valid");
            }               
        }

}
