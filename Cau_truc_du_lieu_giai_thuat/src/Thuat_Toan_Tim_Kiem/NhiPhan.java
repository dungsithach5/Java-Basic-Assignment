package Thuat_Toan_Tim_Kiem;

// THUẬT TOÁN TÌM KIẾM NHỊ PHÂN (TÌM PHẦN TỬ Ở GIỮA)
/*
 yeu cầu tương tự như tìm kiém nhảy
 - Ý tưởng :
 NHỊ PHÂN = CHIA ĐÔI
 1. tìm giá trị phần tử nằm giữa dãy , gọi là X
 2.Nếu X  == K thì X là kết quả và thông bảo chỉ số
 3. Có 2 tình huống:
 	- Nếu X < K => Tìm kiếm ở nửa sau dãy số
 	- Nếu X < K => Tìm kiếm ở nửa đầu dãy số
 4. Lập lại các bước cho đến khi tìm thấy hoặc đến khi khu vực tìm kiếm rỗng (-1)
 */
public class NhiPhan {
	public static void main(String[] args) {
		int[] a = {2,5,8,12,16,23,38,56,72,91,97};
		int n = a.length - 1;
		int k = 38;
		
		System.out.println(BinarySearch(a,k,n));
	}
	
	public static int BinarySearch(int[] a , int k , int n) {
		int l = 0; // đặt giá trị ở vị trí đầu
		int r = n; // đặt giá trị ở vị trí cuối
		while (l <= r) {
			int mid = (l+r)/2; // lấy phần nguyên và xác định vị trí của mid
			if(a[mid] == k) {
				return mid;
			} else if (a[mid] < k) { // nếu mid bé hơn k thì tìm kiếm nửa bến phải của mảng
				l = mid + 1;
			} else { // nếu mid lớn hơn k thì tìm kiếm nửa bên trái của mảng
				r = mid - 1;
			}
		}
		return -1;
	}
}
