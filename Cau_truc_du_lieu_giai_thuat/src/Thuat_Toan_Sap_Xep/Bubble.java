package Thuat_Toan_Sap_Xep;

//THUẬT TOÁN SẮP XẾP NỔI BỌT
/*
 Ý tưởng :
 - Liên tục so sánh 2 phần tử kề nhau , nếu chúng sắp xếp không đúng chỗ thì hoán đổi 
 vị trí của chúng
 - Lặp lại quá trình này nhiều lần , cho dến khi không còn hai phần tử cạnh nhau mà vị trí 
 sắp xếp không đúng thì dừng
 */
public class Bubble {
	public static void main(String[] args) {
		int[] a = {5,2,6,7,3};
		int n = a.length - 1;
		
		BubbleSort(a,n);
		for(int i = 0 ; i <= n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	// tương đương dạng sáp xếp tăng dần
	public static void BubbleSort(int[] a , int n) {
		for (int i = 0 ; i <= n-1  ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(a[j] > a[j + 1]) { // tăng dần 
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
