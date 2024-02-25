package API_Collection;

import java.util.*;

public class ARRAYLIST_SORT {
	public static void main(String[] args) {
		Integer a[] = { 1, 3, 4, 2, 7, 5};
		System.out.print("\nComparator: ");
		Arrays.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
