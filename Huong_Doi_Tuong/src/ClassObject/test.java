package ClassObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThiSinh {
    private String tenThiSinh;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public void nhapThiSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên thí sinh: ");
        tenThiSinh = scanner.nextLine();
        System.out.print("Nhập điểm Toán: ");
        diemToan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        diemLy = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        diemHoa = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng trống
    }

    public void inThongTin() {
        System.out.println("Tên thí sinh: " + tenThiSinh);
        System.out.println("Tổng điểm 3 môn: " + tinhTongDiem());
    }

    public double tinhTongDiem() {
        return diemToan + diemLy + diemHoa;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public double getTongDiem() {
        return tinhTongDiem();
    }
}

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập danh sách thí sinh");
            System.out.println("2. In danh sách thí sinh");
            System.out.println("3. In danh sách điểm giảm dần");
            System.out.println("4. In danh sách trúng tuyển (điểm chuẩn 17)");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    ThiSinh thiSinh = new ThiSinh();
                    thiSinh.nhapThiSinh();
                    danhSachThiSinh.add(thiSinh);
                    break;
                case 2:
                    System.out.println("Danh sách thí sinh:");
                    for (ThiSinh ts : danhSachThiSinh) {
                        ts.inThongTin();
                    }
                    break;
                case 3:
                    System.out.println("Danh sách điểm giảm dần:");
                    danhSachThiSinh.sort((ts1, ts2) -> Double.compare(ts2.getTongDiem(), ts1.getTongDiem()));
                    for (ThiSinh ts : danhSachThiSinh) {
                        System.out.println(ts.getTenThiSinh() + " - " + ts.getTongDiem());
                    }
                    break;
                case 4:
                    System.out.println("Danh sách trúng tuyển (điểm chuẩn 17):");
                    for (ThiSinh ts : danhSachThiSinh) {
                        if (ts.getTongDiem() >= 17) {
                            System.out.println(ts.getTenThiSinh() + " - " + ts.getTongDiem());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);

        scanner.close();
    }
}

