import java.util.Scanner;

abstract class Hocvien {
	private 
		String hoTen;
		String diaChi;
		int loaiUuTien;
		int loaiChuongtrinh;
	
	public Hocvien() {
	};
	
	public Hocvien(String hoTen, String diaChi, int loaiUuTien, int loaiChuongtrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongtrinh = loaiChuongtrinh; };
		
	
	public String getHoTen() {
		return hoTen;
	};

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	};

	public String getDiaChi() {
		return diaChi;
	};

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	};

	public int getLoaiUuTien() {
		return loaiUuTien;
	};

	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	};

	public int getLoaiChuongtrinh() {
		return loaiChuongtrinh;
	};

	public void setLoaiChuongtrinh(int loaiChuongtrinh) {
		this.loaiChuongtrinh = loaiChuongtrinh;
	};

	public abstract double HocPhi();
	
	public void nhapThongtin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhap loai uu tien (1 hoac 2): ");
        this.loaiUuTien = sc.nextInt();
        System.out.print("Nhap loai chuong trinh (1:Do hoa hoac 2:Lap trinh): ");
        this.loaiChuongtrinh = sc.nextInt();
     };
	
	public void inThongTin() {
        System.out.println("\nHo ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Loai uu tien: " + this.loaiUuTien);
        System.out.println("Loai chuong trinh dang ki hoc: " + this.loaiChuongtrinh);
        System.out.printf("Hoc phi: %.2f VND\n",HocPhi());
    };
}
	
	class HocvienDH extends Hocvien {
		private 
			int soBuoiHocDH;
			double giaTienMoiBuoiDH;
			
		public HocvienDH(){
			
		};

		public HocvienDH(String hoTen, String diaChi, int loaiUuTien, int loaiChuongtrinh, int soBuoiHocDHDH,
	            double giaTienMoiBuoiDHDH) {
	        super(hoTen, diaChi, loaiUuTien, loaiChuongtrinh);
	        this.soBuoiHocDH = soBuoiHocDHDH;
	        this.giaTienMoiBuoiDH = giaTienMoiBuoiDHDH;
	    };
		
		public int getsoBuoiHocDH() {
			return soBuoiHocDH;
		};


		public void setsoBuoiHocDH(int soBuoiHocDH) {
			this.soBuoiHocDH = soBuoiHocDH;
		};


		public double getgiaTienMoiBuoiDH() {
			return giaTienMoiBuoiDH;
		};


		public void setgiaTienMoiBuoiDH(double giaTienMoiBuoiDH) {
			this.giaTienMoiBuoiDH = giaTienMoiBuoiDH;
		};


		public void nhapThongTin() {
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongtin();
	        System.out.print("Nhap so buoi: ");
	        this.soBuoiHocDH = sc.nextInt();
	        System.out.print("Nhap don gia DH: ");
	        this.giaTienMoiBuoiDH = sc.nextDouble();
	    };
		
		public int UuTien() {
			if(getLoaiUuTien() == 1) {
				return 1000000;
			}
			else if(getLoaiUuTien() == 2) {
				return 500000;
			}
			else return 0;
		};
		
		public double HocPhi() {
			double hocphi = soBuoiHocDH * giaTienMoiBuoiDH - UuTien();
	        if(hocphi > 0) return hocphi;
	        else return 0;
	    };
	};
	
	class HocvienLT extends Hocvien {
	    private 
		    int soBuoiHocLT;
		    double giaTienMoiBuoiLT;

		public HocvienLT() {
			
		};
		    
	    public HocvienLT(String hoTen, String diaChi, int loaiUuTien, int loaiChuongtrinh, int soBuoiHocLT,
	            double giaTienMoiBuoiLT) {
	        super(hoTen, diaChi, loaiUuTien, loaiChuongtrinh);
	        this.soBuoiHocLT = soBuoiHocLT;
	        this.giaTienMoiBuoiLT = giaTienMoiBuoiLT;
	    };
	    
	    public int getsoBuoiHocLT() {
			return soBuoiHocLT;
		};

		public void setsoBuoiHocLT(int soBuoiHocLT) {
			this.soBuoiHocLT = soBuoiHocLT;
		};

		public double getgiaTienMoiBuoiLT() {
			return giaTienMoiBuoiLT;
		};

		public void setgiaTienMoiBuoiLT(double giaTienMoiBuoiLT) {
			this.giaTienMoiBuoiLT = giaTienMoiBuoiLT;
		};

		public void nhapThongTin() {
	    	Scanner sc = new Scanner(System.in);
	    	super.nhapThongtin();

	    	System.out.print("Nhap so buoi hoc: ");
	    	this.soBuoiHocLT = sc.nextInt();

	    	System.out.print("Nhap don gia moi buoi hoc: ");
	    	this.giaTienMoiBuoiLT = sc.nextDouble();
	    	};
		
		public int UuTien() {
			if(getLoaiUuTien() == 1) {
				return 1000000;
			}
			else if(getLoaiUuTien() == 2) {
				return 800000;
			}
			else return 0;
		};
		
		public double HocPhi() {
	        double hocphi = soBuoiHocLT * giaTienMoiBuoiLT - UuTien();
	        if(hocphi > 0) return hocphi;
	        else return 0;
	}
}
	
public class B44 {
	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        HocvienDH hvDH = new HocvienDH();
	        hvDH.nhapThongTin();
	        hvDH.inThongTin();

	        HocvienLT hvLT = new HocvienLT();
	        hvLT.nhapThongTin();
	        hvLT.inThongTin();
	        sc.close();
	   }}

