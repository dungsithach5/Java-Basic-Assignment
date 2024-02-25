package API_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class COLLECTION_SORT {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(7);
		al.add(4);
		
		System.out.println("List : " + al);
		Collections.sort(al);
		System.out.println("xếp thứ tự từ thấp lên cao : " + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("xếp thứ tự từ cao xuống thấp : " + al);
	
	}
}
