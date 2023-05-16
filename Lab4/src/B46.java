import java.util.Scanner;

abstract class CongNhan {
	private
		String Hoten;
		String Diachi;
		String Ngaysinh;
		int Loaicongnhan;
	
	public Scanner sc = new Scanner(System.in);
	
	public CongNhan() {
		
	}

	public CongNhan(String hoten, String diachi, String ngaysinh, int loaicongnhan) {
		super();
		Hoten = hoten;
		Diachi = diachi;
		Ngaysinh = ngaysinh;
		Loaicongnhan = loaicongnhan;
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

	public String getNgaysinh() {
		return Ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		Ngaysinh = ngaysinh;
	}

	public int getLoaicongnhan() {
		return Loaicongnhan;
	}

	public void setLoaicongnhan(int loaicongnhan) {
		Loaicongnhan = loaicongnhan;
	}

	public void nhapThongTin() {
		System.out.println("Nhap ho va ten nhan vien: ");
		this.Hoten = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		this.Ngaysinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.Diachi = sc.nextLine();
		do {
			System.out.println("Nhap loai giang vien (1:GVTG, 2:GVCH):");
			this.Loaicongnhan = sc.nextInt();
		}while(this.Loaicongnhan != 1 && this.Loaicongnhan != 2);	
	}
	
	public abstract double tinhLuong();
	
	public void inThongTin() {
		System.out.println("Ho ten: " + this.Hoten);
		System.out.println("Ngay sinh: " + this.Ngaysinh);
		System.out.println("Dia chi: " + this.Diachi);
		if(Loaicongnhan == 1) {
            System.out.println("Loai Cong nhan: CNKSP");
        } else if (Loaicongnhan == 2) {
            System.out.println("Loai Cong nhan: CNTCN");
        }
		System.out.println("Luong thang: " + tinhLuong());
	}
}

class CNKSP extends CongNhan {
	private 
		int soSP;
		double dongiaSP;
		
	public CNKSP() {
		
	}

	public CNKSP(String Hoten,String Ngaysinh,String Diachi,int soSP, double dongiaSP) {
		super(Hoten, Ngaysinh, Diachi, 1);
		this.soSP = soSP;
		this.dongiaSP = dongiaSP;
	}

	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}

	public double getDongiaSP() {
		return dongiaSP;
	}

	public void setDongiaSP(double dongiaSP) {
		this.dongiaSP = dongiaSP;
	}
	
	public double tinhLuong() {
		double thuong = 0;
		if(getSoSP() >= 100 && getSoSP() < 150) thuong = 1000000;
		else if(getSoSP() >= 150) thuong = 1500000;
		return soSP * dongiaSP + thuong;
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap so SP: ");
		this.soSP = sc.nextInt();
		System.out.println("Nhap don gia SP: ");
		this.dongiaSP = sc.nextDouble();
	}
}

class CNTCN extends CongNhan {
	private 
		double Luongcoban;
		double Hesl;
		int Ngaycong;
		
	public CNTCN() {
		
	}

	public CNTCN(String Hoten,String Ngaysinh,String Diachi,double Luongcoban, double Hesl, int Ngaycong) {
		super(Hoten, Ngaysinh, Diachi, 2);
		this.Luongcoban = Luongcoban;
		this.Hesl = Hesl;
		this.Ngaycong = Ngaycong;
	}
	
	public double getLuongcoban() {
		return Luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		Luongcoban = luongcoban;
	}

	public double getHesl() {
		return Hesl;
	}

	public void setHesl(double hesl) {
		Hesl = hesl;
	}

	public int getNgaycong() {
		return Ngaycong;
	}

	public void setNgaycong(int ngaycong) {
		Ngaycong = ngaycong;
	}

	public double tinhLuong() {
		double thuong = 0;
		if(getNgaycong() < 20 ) thuong = 0;
		else thuong = 1.2*Luongcoban;
		return Luongcoban * Hesl + thuong;
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap luong co ban: ");
		this.Luongcoban = sc.nextDouble();
		System.out.println("Nhap he so luong: ");
		this.Hesl = sc.nextDouble();
		do {
			System.out.println("Nhap so ngay cong: ");
			this.Ngaycong = sc.nextInt();
		}while(this.Ngaycong >0 && this.Ngaycong <31);
	}
}
public class B46 {
	public static void main(String[] args) {
		CNKSP cnsp =  new CNKSP();
		cnsp.nhapThongTin();
		cnsp.inThongTin();
		
		CNTCN cncn = new CNTCN("MRTK","1/1/2000","Phu Tho",12000,1.5,1);
		cncn.inThongTin();
	}
}
