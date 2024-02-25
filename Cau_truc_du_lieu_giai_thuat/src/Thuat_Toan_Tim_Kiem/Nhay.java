package Thuat_Toan_Tim_Kiem;

// THUẬT TOÁN TÌM KIẾM NHẢY (jump search)
/*
 Ý tưởng :
 - thay vì tìm kiếm từng bước , chúng ta có thể nhảy những đoạn xa để có kết
 quả nhanh hơn , tiét kiệm thời gian
 - xuất phát từ vị trí đầu tien , tìm kiếm theo từng bước nhảy d> 1 . Dừng lại khi gặp
 phần tử có giá trị > K , hoặc di qua độ dài của dãy
 - sau đso tiến hành tìm kiếm tuần tự trong khoảng có độ dài d
 */
public class Nhay {
	public static void main(String[] args) {
		int[] a = {1, 10, 20, 30, 57, 68, 90, 99}; // n = 7
		int n = a.length - 1;
		int k = 90;
		
		System.out.println(JumpSearch(a,k,n));
	}
	
	public static int JumpSearch(int[] a , int k , int n) {
		int d = 3; // số lượng bước nhảy > 1
		int i = 0;
		int j = i + d;
		
		while (j < n && a[j] < k) { // nhảy theo bước d
			j = j + d;
			i = i + d;
		}
		
		if(j >= n) {
			j = n - 1;
		}
		
		while (a[i] < k) {
			i = i + 1;
			if (i >= n || i > j) {
				return -1;
			}
		}
		
		if(a[i] == k) {
			return i;
		} else {
			return -1;
		}
	}
	
}
