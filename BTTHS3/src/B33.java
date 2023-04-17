import java.util.ArrayList;
import java.util.Scanner;

class NgayThang {
    private 
    	int ngay,thang,nam;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }

     
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}

class HangHoa {
    protected 
    	String maHang,tenHang,nhaSanXuat;
    	double gia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("Nhap gia: ");
        gia = sc.nextDouble();
    }

     
    public String toString() {
        return "Ma hang: " + maHang + "\n"
                + "Ten hang: " + tenHang + "\n"
                + "Nha san xuat: " + nhaSanXuat + "\n"
                + "Gia: " + gia + "\n";
    }
}

class HangSanhSu extends HangHoa {
	private String loaiNguyenLieu;

	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap loai nguyen lieu: ");
		loaiNguyenLieu = sc.nextLine();
}

	 
	public String toString() {
		return super.toString() + "Loai nguyen lieu: " + loaiNguyenLieu + "\n";
}
}

class HangThucPham extends HangHoa {
	private NgayThang ngaySanXuat;
	private NgayThang ngayHetHan;
	public void nhap() {
	    super.nhap();
	    Scanner sc = new Scanner(System.in);
	    ngaySanXuat = new NgayThang();
	    System.out.println("Nhap ngay san xuat:");
	    ngaySanXuat.nhap();
	    ngayHetHan = new NgayThang();
	    System.out.println("Nhap ngay het han:");
	    ngayHetHan.nhap();
	}

	 
	public String toString() {
	    return super.toString() + "Ngay san xuat: " + ngaySanXuat.toString()
	            + "\nNgay het han: " + ngayHetHan.toString() + "\n";
	}
}

class HangDienMay extends HangHoa {
	private 
		int thoiGianBaoHanh,dienAp,congSuat;

	public void nhap() {
	    super.nhap();
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap thoi gian bao hanh (thang): ");
	    thoiGianBaoHanh = sc.nextInt();
	    System.out.print("Nhap dien ap: ");
	    dienAp = sc.nextInt();
	    System.out.print("Nhap cong suat: ");
	    congSuat = sc.nextInt();
	}

	 
	public String toString() {
	    return super.toString() + "Thoi gian bao hanh: " + thoiGianBaoHanh + " thang\n"
	            + "Dien ap: " + dienAp + "V\n"
	            + "Cong suat: " + congSuat + "W\n";
	}
}
public class B33 {
    public static void main(String[] args) {
        ArrayList<HangHoa> dsHH = new ArrayList<>();
        nhapHang(dsHH);
        inDSHang(dsHH);
    }

    public static void nhapHang(ArrayList<HangHoa> dsHH) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hang hoa: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin hang hoa thu " + i + ":");
            System.out.println("Loai hang hoa (1: Dien may, 2: Sanh su, 3: Thuc pham): ");
            int loai = sc.nextInt();
            switch (loai) {
                case 1:
                    HangDienMay hdm = new HangDienMay();
                    hdm.nhap();
                    dsHH.add(hdm);
                    break;
                case 2:
                    HangSanhSu hss = new HangSanhSu();
                    hss.nhap();
                    dsHH.add(hss);
                    break;
                case 3:
                    HangThucPham htp = new HangThucPham();
                    htp.nhap();
                    dsHH.add(htp);
                    break;
                default:
                    System.out.println("Loai hang hoa khong hop le");
            }
        }
    }

    public static void inDSHang(ArrayList<HangHoa> dsHH) {
        System.out.println("\nDanh sach hang hoa:");
        for (HangHoa hh : dsHH) {
            if (hh instanceof HangDienMay) {
                System.out.println("Loai hang: Dien may");
                System.out.println(hh.toString());
            } else if (hh instanceof HangSanhSu) {
                System.out.println("Loai hang: Sanh su");
                System.out.println(hh.toString());
            } else if (hh instanceof HangThucPham) {
                System.out.println("Loai hang: Thuc pham");
                System.out.println(hh.toString());
            }
        }
    }
}
