package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.ArrayList;
import java.util.Collections;

public class DEMOArraylist {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add("AVC");
		int a = (int)array.get(1);
		System.out.print(array);
		
//		ArrayList<String> sArray = new ArrayList();
//		sArray.add("A");
//		sArray.add("C");
//		sArray.add("B");
//		
//	//	Collections.sort(sArray); // sap xep tang dan
//		Collections.reverse(sArray); // sap xep giam dan
//		
//		for(String s : sArray) {
//			System.out.print(s);
//		}
	}
}
