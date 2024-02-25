package Thuat_Toan_Chia_De_Tri;

//THUẬT TOÁN SẮP XẾP TRỘN
public class MergeSort {
	public static void merge(int[] a , int l , int mid , int r) {
		// bên trái : l -> mid
		int len_left = mid - l + 1;
		
		// bên phải : mid + 1 -> r
		int len_right = r - mid;
		
		// tạo mảng tạm thời
		int[] a_left = new int[len_left];
		int[] a_right = new int[len_right];
		
		for(int i = 0 ; i < len_left; i++) {
			a_left[i] = a[l + i];
		}
		for(int i = 0 ; i < len_right; i++) {
			a_right[i] = a[mid + 1 + i];
		}
		
		// gộp hai mảng theo quy tắc phần tử nhỏ hơn được đưa vào mang gộp trước
		int i1 = 0; // vị trí hiện tại của phần tử mảng bên trái
		int i2 = 0; // vị trí hiện tai của phần tử mảng bên phải
		int k = l;
		while (i1 < len_left && i2 < len_right) {
			if (a_left[i1] <= a_right[i2]) {
				a[k] = a_left[i1];
				i1++;
			}else {
				a[k] = a_right[i2];
				i2++;
			}
			k++;
		}
		
		// copy những phần của mnagr bên trái chưa đưa vào
		while(i1 < len_left) {
			a[k] = a_left[i1];
			i1++;
			k++;
		}
		while(i2 < len_right) {
			a[k] = a_right[i2];
			i2++;
			k++;
		}
	}
	
	public static void mergeSort(int[] a , int l , int r) {
		if(l < r) {
			int mid = (l+r)/2;
			
			// gọi dệ quy sort từng phần bên trái và bên phải
			mergeSort(a, l, mid);
			mergeSort(a, mid + 1, r);
			
			merge(a, l, mid, r);
			
		}
	}
	
	public static void main(String[] args) {
		int[] a = {5,2,6,7,3};
		int n = a.length;
		
		mergeSort(a, 0, n - 1);
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
