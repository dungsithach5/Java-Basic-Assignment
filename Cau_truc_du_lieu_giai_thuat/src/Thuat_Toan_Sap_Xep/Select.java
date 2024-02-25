package Thuat_Toan_Sap_Xep;

// THUẬT TOÁN SẮP XẾP CHỌN
/*
 Ý tưởng :
 	- Thao tác "Chọn" như sau:
 		- với mỗi phần tử dầu đến phần tử cuối dãy (1 đến n - 1)
 		Chúng ta chọn phần tử nhỏ nhất trong dãy con ai,ai+!,...an và đổi chỗ cho ai 
 		- Sau bước trên phần tử ai là phần tử nhỏ nhất của dãy : ai ,ai+1, ...an;
 */
public class Select {
	public static void main(String[] args) {
		int[] a = {6,7,9,8,0};
		int n = a.length - 1;

		
		selectionSort(a,n);
		for(int i = 0 ; i <= n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void selectionSort(int[] a , int n) {
		for(int i = 0; i < n - 1 ; i++ ) {
			int i_min = i;

			for(int j = i + 1 ; j < n; j++) {
				if(a[j] < i_min) {
					i_min = j;
				}
			}
			int temp = a[i_min];
			a[i] = a[i_min];
			a[i] = temp;
		}		
	}
	
//	public static void selectionSort(int[] array) {
//        int n = array.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//
//            // Tìm phần tử nhỏ nhất trong phần chưa được sắp xếp
//            for (int j = i + 1; j < n; j++) {
//                if (array[j] < array[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên của phần chưa được sắp xếp
//            int temp = array[minIndex];
//            array[minIndex] = array[i];
//            array[i] = temp;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = {64, 25, 12, 22, 11};
//
//        System.out.println("Mảng trước khi sắp xếp:");
//        printArray(array);
//
//        selectionSort(array);
//
//        System.out.println("\nMảng sau khi sắp xếp:");
//        printArray(array);
//    }
//
//    public static void printArray(int[] array) {
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }
}
