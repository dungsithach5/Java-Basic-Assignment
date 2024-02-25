package Thuat_Toan_Chia_De_Tri;

//THUẬT TOÁN SĂP XẾP NHANH
/*
 Ý tưởng :
 - Nếu dãy chỉ có 1 phần tử => đã được sắp xếp
 - Chia : 
 	+ chọn 1 phần tử làm phần tử chốt(pivot)
 	+ Chia dãy thành 2 dãy con :
 		- Dãy bên trái : những phần tử nhỏ hơn phần tử chốt
 		- Dãy bên phải : những phần tử lớn hơn phần tử chốt
 - Trị : Đối với từng dãy con ta gọi đệ quy để sắp xếp dãy con đó
 - Tổng hợp dãy :
 	[Dãy bên trái , pivot , dãy bên phải]
 	
 	Cách chọn phần tử chốt (pivot)
 	- phần tử đầu tiên
 	- phần tử cuối cùng
 	- phần tử ở giữa
 	- ngẫu nhiên
 */
public class QuickSort {
	public static void Swap(int[] a , int x , int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	
	public static int partition(int[] a , int l , int r) {
		// Giá trị pivot bằng giá trị phần tử đầu tiên
		int pivot = a[l];
		
		int count = 0;
		// đếm số lượng phần tử nằm bên trái pivot
		for(int i = l+1 ; i<= r ; i++) {
			if(a[i] <= pivot) {
				count++;
			}
		}
		
		// lấy vị trí cho giá trị pivot
		int pivotIndex = l + count;
		
		// Hoán vị 
		Swap(a,l,pivotIndex);
		
		int i = l;
		int j = r;
		while(i < pivotIndex && j > pivotIndex) {
			while(a[i] <= pivot) {
				i++;
			}
			while(a[j] > pivot) {
				j--;
			}
			if(i < pivotIndex && j > pivotIndex) {
				Swap(a,i,j);
			}
		}
		return pivotIndex;
	}
	
	
	public static void QuickSort(int[] a , int l , int r) {
		if(l >= r) {
			return;
		}
		//Chia
		int pivot = partition(a,l,r);
		
		//Tri:
		//Sắp xếp dãy bên trái
		QuickSort(a,l,pivot-1);
		
		//Sắp xếp dãy bên phải
		QuickSort(a,pivot+1,r);
	}
	
	
	public static void main(String[] args) {
		int[] a = {5,2,6,7,3};
		int n = a.length;
		
		QuickSort(a, 0, n - 1);
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
