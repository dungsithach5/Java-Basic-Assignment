package HuynhAnhTien;

import java.util.Scanner;

public class Baitap4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String ");
        String str = sc.nextLine();
        
        str = str.replaceAll(" ","");
        
        int S = 0;
        for (int i = 0; i < str.length(); i++) {           
            S++;
        }
        System.out.println(S1);
    }

}
