package ClassObject;

import java.util.Scanner;

/*2. Viết lớp MyCircle có
Thuộc tính:
mPosX: tọa độ X
mPosY: tọa độ Y
mRas: bán kính
Phương thức:
MyCircle (): khởi tạo X, Y và bán kính mặc định là 0, 0, 10
MyCircle (int x, int y, int radius)
display(): hiển thị tọa độ và bán kính
setX(int x): thiết lập giá trị cho X
getX(): trả về giá trị X
setY(int y): thiết lập giá trị cho Y
getY(): trả về giá trị Y
setRadius(int y): thiết lập giá trị cho bán kính
getRadius(): trả về giá trị bán kính
distance(MyCircle c): trả về khoảng cách tới c
area(): tính diện tích hình tròn
Viết 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
*/

public class MyCircle {
	private int Y;
    private int X;
    private int R;
    public static final double PI = 3.14;
    
    MyCircle() {
    	X = 0;
    	Y = 0;
    	R = 10;
    }
    
    MyCircle(int x , int y) {
    	X = x;
    	Y = y;
    }
    
    double distance(MyCircle c) {
    	return Math.sqrt((this.X - c.X) * (this.X - c.X) + (this.Y - c.Y) * (this.Y - c.Y));
    }
    double area() {
    	return Math.PI*R*R;
    }

	@Override
	public String toString() {
		return "(" + X + "," + Y + ")";
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		this.Y = y;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		this.X = x;
	}

	public int getR() {
		return R;
	}

	public void setR(int y) {
		this.R = y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCircle A = new MyCircle();
		MyCircle y = new MyCircle();
		MyCircle r = new MyCircle();
		
		System.out.println("Cho toa do A:");
		System.out.print("Nhap toa do x = ");
		A.setX(sc.nextInt());
		System.out.print("Nhap toa do y = ");
		A.setY(sc.nextInt());
		
		System.out.print("Nhap R = ");
		r.setR(sc.nextInt());
		
		
		System.out.println("Toa do A" + A.toString());
		System.out.println("Dien Tich Hinh Tron la : " + r.area());
		
		
	}
    
    
    
}
