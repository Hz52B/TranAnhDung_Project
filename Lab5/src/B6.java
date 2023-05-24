import java.util.*;

class SinhVien {
	private
		String MaSV;
		String Hoten;
		String Lop;
		
	public SinhVien() {
		
	}
		
	public SinhVien(String maSV, String hoten, String lop) {
		super();
		MaSV = maSV;
		Hoten = hoten;
		Lop = lop;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String maSV) {
		MaSV = maSV;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}
	
}
public class B6 {
	public static void main(String[] args) {
		Map<String,SinhVien> sinhVienmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i+1) +":");
			System.out.println("Nhap ma sinh vien: ");
			String MaSV = sc.nextLine();
			System.out.println("Nhap ho va ten: ");
			String Hoten = sc.nextLine();
			System.out.println("Nhap lop: ");
			String Lop = sc.nextLine();
			
			SinhVien sv = new SinhVien(MaSV,Hoten,Lop);
			sinhVienmap.put(Lop, sv);
		}
		
		System.out.println("Nhap ten lop can tim: ");
		String Lopcantim = sc.nextLine();
		
		System.out.println("Cac sinh vien thuoc lop " + Lopcantim + " : ");
		for(SinhVien sv : sinhVienmap.values()) {
			if(sv.getLop().equals(Lopcantim)) {
				System.out.println("Ma SV: "+sv.getMaSV()
								+"\nHo va ten: "+sv.getHoten()
								+"\nLop: "+sv.getLop());
			}
		}
		
		System.out.println("Nhap ma sinh vien can tim: ");
		String MaSvcantim = sc.nextLine();
		
		if(sinhVienmap.containsKey(MaSvcantim)) {
			SinhVien sv = sinhVienmap.get(MaSvcantim);
			System.out.println("Ho va ten: "+sv.getHoten()
			+"\nLop: "+sv.getLop());
		}else {
			System.out.println("Khong tim thay sinh vien co ma: "+MaSvcantim);
		}
		
	}
}
