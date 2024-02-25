package ClassObject;

import java.util.Scanner;

/*
 4. Xây dựng lớp tam giác (Triangle) có
Thuộc tính:
a, b, c là ba cạnh của tam giác
Phương thức:
Hàm dựng
Kiểm tra tam giác (là tam giác thường, vuông, cân, đều hoặc không phải
tam giác)
Tính chu vi
Tính diện tích
Viết hàm 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạ
 */
public class Triangle {
	public double a;
	public double b;
	public double c;

	public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            a = 0;
            b = 0;
            c = 0;
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

	
	public boolean isTriangle() {
		if (a + b <= c || a + c <= b || b + c <= a) {
			return false;
		}
		return true;
	}

	// Ham kiem tra tam giac deu
	public boolean checkTGD() {
		if ((a == b) && (b == c)) {
			return true;
		}
		return false;
	}

	// Ham kiem tra tam giac can
	public boolean checkTGC() {
		if ((a == b) || (a == c) || (b == c)) {
			return true;
		}
		return false;
	}

	// Ham kiem tra tam giac vuong
	public boolean checkTGV() {
		if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
			return true;
		}
		return false;
	}

	

	// Ham tra ve thong tin kieu tam giac tam giac
	public String getType() {
		if (checkTGD()) {
			return "Tam giac deu";
		} else if (checkTGC()) {
			return "Tam giac can";
		} else if (checkTGV()) {
			return "Tam giac vuong";
		}
		return "Tam giac thuong";
	}

	// Ham tinh dien tich tam giac
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	// Ham tra ve thong tin cua tam giac
	public String display1() {
		return "\tDo dai cac canh lan luot la: " + a + "; " + b + " va " + c;
	}
	
	public String display2() {
		return "\tLoai tam giac: " + getType();
	}
	
	public String display3() {
		return "\tDien tich tam giac: " + area();
	}
	
}

