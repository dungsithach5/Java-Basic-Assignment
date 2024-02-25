package ClassObject;
import java.util.Scanner;
import ClassObject.MyPoint;
/*3. Viết lớp MyRectangle có
Thuộc tính:
mPos: tọa độ (MyPoint)
mWidth: chiều dài
mHeight: chiều rộng
Phương thức:
MyRectangle (): khởi tạo mặc định là 0, 0, 100, 100
MyRectangle (int x, int y, int width, int height)
display(): hiển thị tọa độ kích thước
setX(int x): thiết lập giá trị cho X
getX(): trả về giá trị X
setY(int y): thiết lập giá trị cho Y
getY(): trả về giá trị Y
setPos(MyPoint p) : thiết lập tọa độ
getPos(): trả về tọa độ
setWidth(int w): thiết lập chiều dài
getWidth(): trả về chiều dài
setHeight(int h): thiết lập chiều cao
getHeight(): trả về giá trị chiều cao
area(): tính diện tích hình chữ nhật
Viết hàm 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
*/

public class MyRectangle {
	private MyPoint P; //MyPoint
	private int X; 
	private int Y;
	private int W; // Width
	private int H; // Height
	
	MyRectangle() {
		X = 0;
		Y = 0;
		W = 100;
		H = 100;
	}
	MyRectangle(int x , int y , int width , int height) {
		X = x;
		Y = y;
		W = width;
		H = height;
		
	}
	
	
	
	public String displayMyRectangle() {
		return "Width: " + W + ", Height: " + H;
	}
	
	double area() {
		return W*H;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public MyPoint getP() {
		return P;
	}

	public void setP(MyPoint p) {
		P = p;
	}

	public int getW() {
		return W;
	}

	public void setW(int w) {
		W = w;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyPoint A = new MyPoint();
//		MyRectangle A = new MyRectangle();
		MyRectangle Size = new MyRectangle();
		MyRectangle S = new MyRectangle();
		MyRectangle width = new MyRectangle();
		MyRectangle height = new MyRectangle();
		
		System.out.println("Cho Toa do A :");
		
		System.out.print("Nhap toa do X cua A = ");
        A.setmPosX(sc.nextInt());
        System.out.print("Nhap toa do Y cua A = ");
        A.setmPosY(sc.nextInt());
        System.out.println("Toa do A" + A.displayMyPoint());
        
//        System.out.print("Nhap chieu dai W = ");
//        width.setW(sc.nextInt());
//        System.out.print("Nhap chieu cao H = ");
//        height.setH(sc.nextInt());
        
        System.out.println(Size.displayMyRectangle());
        System.out.println("Dien Tich cua HINH CHU NHAT la : " + S.area());
        
        
        
	}

}
