package LyThuyet_HDT;

import java.util.Scanner;

public class Singleton extends B {
	private Singleton() {}
	private static Singleton insC;
	
	public static Singleton getInstance() {
		if(insC == null) {
			insC = new Singleton();
		}
		return insC;
	}
	
	public static void main(String[] args) {
		
	}
}
