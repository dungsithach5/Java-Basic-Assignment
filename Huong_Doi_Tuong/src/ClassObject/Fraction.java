package ClassObject;
import java.util.Scanner;
public class Fraction {
	private int tu;
	private int mau;

	    public void PhanSo(int tu, int mau) {
	        this.tu = tu;
	        this.mau = mau;
	    }

	    public void Input() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap tu so: ");
	        this.tu = sc.nextInt();

	        System.out.print("Nhap mau so: ");
	        this.mau = sc.nextInt();

	        
	    }

	    public void print() {
	        System.out.printf("%d/%d", this.tu, this.mau);
	    }

	    public boolean check() {
	        if (this.tu == 0 || this.mau == 0) {
	            return false;
	        }
	        return true;
	    }

	    public void rutGon() {
	        int rut = Math.abs(gcd(Math.abs(this.tu), Math.abs(this.mau)));
	        this.tu = this.tu / rut;
	        this.mau = this.mau / rut;
	    }

	    public void quyDong(Fraction b) {
	        this.rutGon();
	        b.rutGon();

	        this.tu = this.tu * b.mau;
	        b.tu = b.tu * this.mau;

	        this.mau = b.mau = this.mau * b.mau;
	    }

	    public Fraction congPhanSo(Fraction b) {
	        this.quyDong(b);
	        Fraction c = new Fraction();
	        c.tu = this.tu + b.tu;
	        c.mau = this.mau;
	        c.rutGon();
	        return c;
	    }

	    public Fraction truPhanSo(Fraction b) {
	        this.quyDong(b);
	        Fraction c = new Fraction();
	        c.tu = this.tu - b.tu;
	        c.mau = this.mau;
	        c.rutGon();
	        return c;
	    }

	    public Fraction nhanPhanSo(Fraction b) {
	    	Fraction c = new Fraction();
	        c.tu = this.tu * b.tu;
	        c.mau = this.mau * b.mau;
	        c.rutGon();
	        return c;
	    }

	    public Fraction chiaPhanSo(Fraction b) {
	    	Fraction c = new Fraction();
	        c.tu = this.tu * b.mau;
	        c.mau = this.mau * b.tu;
	        c.rutGon();
	        return c;
	    }

	    public void setTu(int tu) {
	        this.tu = tu;
	    }

	    public void setMau(int mau) {
	        this.mau = mau;
	    }

	    public int getTu() {
	        return this.tu;
	    }

	    public int getMau() {
	        return this.mau;
	    }

	    private int gcd(int a, int b) { // bội ước chung
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Fraction A = new Fraction();
	        Fraction B = new Fraction();

	        System.out.println("Nhap phan so A");
	        A.Input();
	        System.out.println("Nhap phan so B");
	        B.Input();

	        System.out.println();
	        System.out.print("Phan so A: ");
	        A.print();
	        System.out.print("\nPhan so B: ");
	        B.print();

	        if (!A.check()) {
	            System.out.println("\n=>Phan so A khong hop le");
	            return;
	        }
	        if (!B.check()) {
	            System.out.println("\n=>Phan so B khong hop le");
	            return;
	        }
	        
	        System.out.println();
	        System.out.println("RUT GON PHAN SO");
	        System.out.print("Phan so A: ");
	        A.rutGon();
	        A.print();
	        System.out.print("\nPhan so B: ");
	        B.rutGon();
	        B.print();

	        System.out.println("\nQUY DONG PHAN SO");
	        System.out.print("\nPhan so A: ");
	        A.quyDong(B);
	        A.print();
	        System.out.print("\nPhan so B: ");
	        B.quyDong(A);
	        B.print();

	        System.out.println();
	        System.out.println("CONG HAI PHAN SO");
	        System.out.println("\nTong phan so: ");
	        Fraction tong = A.congPhanSo(B);
	        tong.print();
	        

	        System.out.println("\nTRU HAI PHAN SO");
	        System.out.println("\nHieu phan so: ");
	        Fraction hieu = A.truPhanSo(B);
	        hieu.print();

	        System.out.println("\nNHAN HAI PHAN SO");
	        System.out.println("\nTich phan so: ");
	        Fraction tich = A.nhanPhanSo(B);
	        tich.print();
	        
	        
	        System.out.println("\nCHIA HAI PHAN SO");
	        System.out.println("\nThuong phan so: ");
	        Fraction thuong = A.chiaPhanSo(B);
	        thuong.print();

	        
	    }

}
