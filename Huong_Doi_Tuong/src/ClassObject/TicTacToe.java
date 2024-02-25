package ClassObject;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
# # #        1 2 3
# # #   <=>  4 5 6
# # # 		 7 8 9

 */

public class TicTacToe {
	static ArrayList<Integer> Player1 = new ArrayList<Integer>();
	static ArrayList<Integer> Player2 = new ArrayList<Integer>();
	
	public static void printgameboard(char[][] Boardgame) { 
		for(char [] row : Boardgame) { // for each các kí tự mảng trong Boardgame
			for(char c : row) { // các kí tự trong Boardgame
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void PlayerX(char[][] Boardgame , int pos , String user) { // Setup cho player X
		Player1.add(pos); // kiểm tra vị trí player1
		switch(pos) {
		case 1:
			Boardgame[0][0] = 'X';
			break;
		case 2:
			Boardgame[0][2] = 'X';
			break;
		case 3:
			Boardgame[0][4] = 'X';
			break;
		case 4:
			Boardgame[2][0] = 'X';
			break;
		case 5:
			Boardgame[2][2] = 'X';
			break;
		case 6:
			Boardgame[2][4] = 'X';
			break;
		case 7:
			Boardgame[4][0] = 'X';
			break;
		case 8:
			Boardgame[4][2] = 'X';
			break;
		case 9:
			Boardgame[4][4] = 'X';
			break;
		default:
			break;
		}
		
	}
	
	public static void PlayerO(char[][] Boardgame , int pos , String user) { // Setup cho player O	
		Player2.add(pos); // kiểm tra vị trí player2
		switch(pos) {
		case 1:
			Boardgame[0][0] = 'O';
			break;
		case 2:
			Boardgame[0][2] = 'O';
			break;
		case 3:
			Boardgame[0][4] = 'O';
			break;
		case 4:
			Boardgame[2][0] = 'O';
			break;
		case 5:
			Boardgame[2][2] = 'O';
			break;
		case 6:
			Boardgame[2][4] = 'O';
			break;
		case 7:
			Boardgame[4][0] = 'O';
			break;
		case 8:
			Boardgame[4][2] = 'O';
			break;
		case 9:
			Boardgame[4][4] = 'O';
			break;
		default:
			break;
		}
		
	}
	
	public static String checkWinner(String userX , String userO) {
		// sử dụng ArraysList để tìm ra người chiến thắng
		List topRow = Arrays.asList(1,2,3); // asList : chuyển đổi mảng thành 1 list ( KQ trả về ptu của mảng được truyền vào )
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(1,5,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(7,5,3);
		
		List<List> winning = new ArrayList<List>(); // gom các list trên lại cho 1 list mới (winning)
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		for(List l : winning) { // điều kiện biến l ở trong winning
			if(Player1.containsAll(l)) { // nếu Player 1 chứa 1 hoặc tất cả trường hợp ở trong l
				return userX + " Won!"; 
			} else if(Player2.containsAll(l)) { // nếu Player 2 chứa 1 hoắc tất cả trường hợp ở trong l
				return userO + " Won!";
			} else if(Player1.size() + Player2.size() == 9) { // tổng số ptu(list) của 2 người chơi
				return "Tie!";
			}
		}
		
		return"";
	}
	
	public static void checkHistory() { // không biết có đúng không
		// tạo file để lưu trữ lịch sử người chơi 
		try {	    
		    FileWriter writer = new FileWriter("History TicTacToe.txt");

		    // Ghi thông tin của trận đấu vào tệp
		    writer.write("Ngày giờ: 2023-10-08 13:30\n");
		    writer.write("Người chơi 1: Tiến\n");
		    writer.write("Người chơi 2: Khoa\n");
		    writer.write("Kết quả: Khoa thắng\n");

		   
		    writer.close();

		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] Boardgame={{' ' , '|' , ' ','|' , ' '} , // tao table chạy XO trên i = 0 , 2 , 4 ;
				{'-' , '+' , '-','+' , '-'} , 
				{' ' , '|' , ' ','|' , ' '} , 
				{'-' , '+' , '-','+' , '-'} , 
				{' ' , '|' , ' ','|' , ' '}};
		
		System.out.println("Welcome to Tic Tac Toe ! Play with your way!");
		
		printgameboard(Boardgame);
		
		System.out.println("if you find any problem , please contact Tien@.com");
		System.out.println("SELECT YOUR MODE (1 -PLAYGAME ; 2 REPLAYGAME ; 3 - EXIT)");
		int mode = sc.nextInt();
		
		String user1 = "";
		String user2 = "";
		
		switch(mode) {
		case 1:
			System.out.print("Name player 1 : ");
			user1 = sc.next();
			System.out.print("Name player 2 : ");
			user2 = sc.next();
			
			while(true) {
				
				System.out.println("Nhap vao vi tri cua ban (1 - 9) : ");
				
				System.out.print(user1 + " Turn : ");
				int pos1 = sc.nextInt();
				while(Player1.contains(Player2) || Player2.contains(Player1)) {
					System.out.println("Vi tri cua ban bi trung , vui long nhap lai!"); // lỗi
					pos1 = sc.nextInt();
				}
				PlayerX(Boardgame , pos1 , user1);
				
				printgameboard(Boardgame); // Update lại Table
				
				String result = checkWinner(user1 , user2); // kiểm tra người chơi chiến thắng 
				if(result.length() > 0) { // trả về độ dài > 0 là 1 trong 2 ng chiếng thắng hoặc hòa
					System.out.println(result);
					break; // hết thúc vòng lập
				}
				
				System.out.print(user2 + " Turn : ");
				int pos2 = sc.nextInt();
				while(Player1.contains(Player1) || Player2.contains(Player2)) {
					System.out.println("Vi tri cua ban bi trung , vui long nhap lai!"); // lỗi
					pos2 = sc.nextInt();
				}
				PlayerO(Boardgame , pos2 , user2);
				
				printgameboard(Boardgame); // Update lại Table
				
				result = checkWinner(user1 , user2);
				if(result.length() > 0) {
					System.out.println(result);
					break;
				}
			}
			break;
		
		case 2:
			checkHistory();
			break;
		case 3:
			System.out.println("SEE YOU NEXT TIME!");
			break;
		default:
			break;
		}
		
	}
}
