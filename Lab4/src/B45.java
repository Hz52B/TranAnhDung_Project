import java.util.Scanner;

abstract class GiangVien {
	private 
		String Hoten;
		String Diachi;
		int Loaigiangvien;
	
	public Scanner sc = new Scanner(System.in);	
		
	public GiangVien() {
		
	}

	public GiangVien(String hoten, String diachi, int loaigiangvien) {
		super();
		Hoten = hoten;
		Diachi = diachi;
		Loaigiangvien = loaigiangvien;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public String getDiachi() {
		return Diachi;
	}

	public void setDiachi(String diachi) {
		Diachi = diachi;
	}

	public int getLoaigiangvien() {
		return Loaigiangvien;
	}

	public void setLoaigiangvien(int loaigiangvien) {
		Loaigiangvien = loaigiangvien;
	};
	
	public void nhapThongtin() {
		System.out.println("Nhap ho va ten giang vien: " );
		this.Hoten = sc.nextLine();
		System.out.println("Nhap dia chi cua giang vien: ");
		this.Diachi = sc.nextLine();
		do {
			System.out.println("Nhap loai giang vien (1:GVTG, 2:GVCH):");
			this.Loaigiangvien = sc.nextInt();
		}while(this.Loaigiangvien != 1 && this.Loaigiangvien != 2);
	}
	
	public abstract double tinhLuong();
	
	public void inThongtin() {
		System.out.println("Ho ten: " + this.Hoten);
		System.out.println("Dia chi: " + this.Diachi);
		if(Loaigiangvien == 1) {
            System.out.println("Loai Giang vien: Co Huu");
        } else if (Loaigiangvien == 2) {
            System.out.println("Loai Giang vien: Thinh Giang");
        }
		System.out.println("Luong thang: " + tinhLuong());
	}
}

class GVCoHuu extends GiangVien {
	private
		double Luongcoban;
		double Hesoluong;
		int Namcongtac;
		
	public GVCoHuu() {
		
	}

	public GVCoHuu(String Hoten, String Diachi, double Luongcoban, double Hesoluong, int Namcongtac) {
        super(Hoten, Diachi, 1);
        this.Luongcoban = Luongcoban;
        this.Hesoluong = Hesoluong;
        this.Namcongtac = Namcongtac;
    }	

	public double getLuongcoban() {
		return Luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		Luongcoban = luongcoban;
	}

	public double getHesoluong() {
		return Hesoluong;
	}

	public void setHesoluong(double hesoluong) {
		Hesoluong = hesoluong;
	}

	public int getNamcongtac() {
		return Namcongtac;
	}

	public void setNamcongtac(int namcongtac) {
		Namcongtac = namcongtac;
	}

	public double tinhLuong() {
		double Phucap = 0;
		if(Namcongtac >= 5) {
			Phucap = (Namcongtac - 5) * 0.01 * Luongcoban + 0.05 * Luongcoban;
		}
		return Luongcoban * Hesoluong + Phucap;
	}
	
	public void nhapThongtin() {
		super.nhapThongtin();
		System.out.println("Nhap luong co ban: ");
		this.Luongcoban = sc.nextDouble();
		System.out.println("Nhap he so luong: ");
		this.Hesoluong = sc.nextDouble();
		System.out.println("Nhap nam cong tac: ");
		this.Namcongtac = sc.nextInt();
	}
}

class GVThinhGiang extends GiangVien {
	private
		int Sotiet;
		double Dongia;
		
	public GVThinhGiang() {
		
	}

	public GVThinhGiang(String Hoten, String Diachi, int Sotiet, double Dongia) {
        super(Hoten, Diachi, 2);
        this.Sotiet = Sotiet;
        this.Dongia = Dongia;
    }	
	
	public int getSotiet() {
		return Sotiet;
	}

	public void setSotiet(int sotiet) {
		Sotiet = sotiet;
	}

	public double getDongia() {
		return Dongia;
	}

	public void setDongia(double dongia) {
		Dongia = dongia;
	}

	public double tinhLuong() {
		return Sotiet*Dongia-0.15*(Sotiet*Dongia);
	}
	
	public void nhapThongtin() {
		super.nhapThongtin();
		System.out.println("Nhap so tiet day: ");
		this.Sotiet = sc.nextInt();
		System.out.println("Nhap don gia: ");
		this.Dongia = sc.nextDouble();
	}
}
public class B45 {
	public static void main(String[] args) {
		GVCoHuu ch = new GVCoHuu("Nguyen A", "HN", 5000000, 1.5, 5);
		ch.inThongtin();
		
		GVCoHuu hc = new GVCoHuu();
		hc.nhapThongtin();
		hc.inThongtin();
		
		GVThinhGiang tg = new GVThinhGiang("Nguyen B","PL",30,150000);
		tg.inThongtin();
		
		tg.nhapThongtin();
		tg.inThongtin();
	}
}
