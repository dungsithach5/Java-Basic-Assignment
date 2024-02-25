package Thuat_Toan_Sap_Xep;

// THUẬT TOÁN SẮP XẾP CHÈN
/*
 Ý tưởng :
 	for i =2 to n
 		chèn ai vào vị trí sắp xếp đúng của dãy a1 ... ai-1
 	- Thao tác quan trọng là CHÈN
 	
 */
public class Insert {
	public static void main(String[] args) {
		int[] a = {5,2,6,7,3};
		int n = a.length - 1;

		//InsertionSort1(a,n);
		InsertionSort2(a,n);
		for(int i = 0 ; i <= n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	// cách 1 : vừa chuyển phần từ , vừa đổi chỗ 2 phần tử
	public static void InsertionSort1(int[] a , int n) {
		for (int i = 1 ; i <= n ; i++) {
			int j = i;
			while (j > 0 && a[j] <= a[j-1]) {
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				j--;
			}
		} 
	}
	
	//cách 2 : Chuyển phần từ , không đổi chỗ 2 phần tử
	public static void InsertionSort2(int[] a , int n) {
		for (int i = 1 ; i <= n ; i++) {
			int key = a[i];
			int j = i-1;
			while (j >= 0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		} 
	}
}
