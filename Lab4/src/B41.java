class Nguoi {
	private 
		String ten;
		int tuoi;
		char gioiTinh;
		
	public Nguoi() {
		super();
	}

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String toString() {
		return "Ten: " + ten + "\nTuoi: " + tuoi + "\nGioi tinh: " + gioiTinh;
	}
}

class BenhVien extends BenhNhan {
	private
		String ten;
		String diaChi;
		String giamDoc;

	public BenhVien() {
			super();
		}

	public BenhVien(String ten, String diaChi, String giamDoc) {
			super();
			this.ten = ten;
			this.diaChi = diaChi;
			this.giamDoc = giamDoc;
		}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	@Override
	public String toString() {
		return "Ten benh vien: " + ten + "\nDia chi: " + diaChi + "\nGiam doc: " + giamDoc;
	}
	
	
}

class BenhNhan extends Nguoi {
	private 
		String tienSu;
		String chanDoan;
		BenhVien benhVien;
		
	public BenhNhan() {
			super();
		}

	public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
	    super(ten, tuoi, gioiTinh);
	    this.tienSu = tienSu;
	    this.chanDoan = chanDoan;
	    this.benhVien = benhVien;
	  }

	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	@Override
	public String toString() {
	    return "Ten: " + getTen() + "\nTuoi: " + getTuoi() + "\nGioi tinh: " + getGioiTinh() +
	        "\nTien su benh: " + tienSu + "\nChan doan: " + chanDoan + "\n" + benhVien;
	  }
	
}
public class B41 {
	public static void main(String[] args) {
		BenhVien bv = new BenhVien("Vien Huyet hoc - Truyen mau Trung uong","Ha Noi","Nguyen Ha Thanh");
		BenhNhan bn = new BenhNhan("Nguyen Van A",48,'0',"Dau bung","Xuat huyet da day",bv);
		System.out.println("\nThong tin cua benh nhan:");
		System.out.println(bn);
		
		bn.setTienSu("Dau dau");
		bn.setChanDoan("Thieu mau len nao");
		System.out.println("\nThong tin cua benh nhan:");
		System.out.println(bn);
	}
}
