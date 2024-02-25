package ClassObject;
/*
1. Viết lớp MyPoint có
Thuộc tính:
mPosX: tọa độ X
mPosY: tọa độ Y
Phương thức
MyPoint(): khởi tạo X, Y mặc định là 0, 0
MyPoint(int x, int y)
display(): hiển thị tọa độ X, Y
setX(int x): thiết lập giá trị cho X
getX(): trả về giá trị X
setY(int y): thiết lập giá trị cho Y
getY(): trả về giá trị Y
distance(MyPoint p): trả về khoảng cách với tọa độ p
distance(MyPoint p1, MyPoint p2): khoảng cách giữa 2 tọa độ p1 và p2
Viết 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
*/

import java.util.Scanner;

public class MyPoint {
	private int mPosY;
    private int mPosX;
    
    MyPoint() {
        mPosX = 0;
        mPosY = 0;
    }
    
    MyPoint(int x , int y) {
        mPosY = y;
        mPosX = x;
    }
    

    
    public String displayMyPoint() { // dùng toString đẻ display
        return"(" + mPosX + "," + mPosY + ")";
    }

    public void setmPosY(int mPosY) {
        this.mPosY = mPosY;
    }

    public void setmPosX(int mPosX) {
        this.mPosX = mPosX;
    }

    public int getmPosY() {
        return mPosY;
    }

    public int getmPosX() {
        return mPosX;
    }
    
    double distance(MyPoint p) {
    	return Math.sqrt((mPosX - p.mPosX) * (mPosX - p.mPosX) + (mPosY - p.mPosY) * (mPosY - p.mPosY));
    	// Công thức tính khoảng cách giữa 2 điẻm AB = sprt((x-p) * (x-p) + (y-p) * (y-p)) 
    }
    
    double distance(MyPoint p1 , MyPoint p2) {
    	return Math.sqrt((p1.mPosX - p2.mPosX) * (p1.mPosX - p2.mPosX) + (p1.mPosY - p2.mPosY) * (p1.mPosY - p2.mPosY));
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        MyPoint A = new MyPoint();
        MyPoint B = new MyPoint();
        
        System.out.print("Nhap toa do X cua A = ");
        A.setmPosX(sc.nextInt());
        System.out.print("Nhap toa do Y cua A = ");
        A.setmPosY(sc.nextInt());
        
        System.out.print("Nhap toa do X cua B = ");
        B.setmPosX(sc.nextInt());
        System.out.print("Nhap toa do Y cua B = ");
        B.setmPosY(sc.nextInt());
        
        System.out.println("Toa do A" + A.displayMyPoint());
	    System.out.println("Toa do B" + B.displayMyPoint());
        
        System.out.println("Khoang cach giua 2 diem AB la : " + A.distance(B));
        
    }
}
