package Thuat_Toan_Tham_Lam;

public class Person {
	int tong;
	int bat_dau;
	int ket_thuc;
	
	public Person(int tong, int bat_dau, int ket_thuc) {
		this.tong = tong;
		this.bat_dau = bat_dau;
		this.ket_thuc = ket_thuc;
	}
	
	public int getTong() {
		return tong;
	}
	public void setTong(int tong) {
		this.tong = tong;
	}
	public int getBat_dau() {
		return bat_dau;
	}
	public void setBat_dau(int bat_dau) {
		this.bat_dau = bat_dau;
	}
	public int getKet_thuc() {
		return ket_thuc;
	}
	public void setKet_thuc(int ket_thuc) {
		this.ket_thuc = ket_thuc;
	}
	
	
}
