class Nguoi1 {
	private 
		String ten;
		int tuoi;
		char gioiTinh;
		
	public Nguoi1() {
		super();
	}

	public Nguoi1(String ten, int tuoi, char gioiTinh) {
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
class Truong {
	private
		String ten,diaChi,hieuTruong;

	public Truong() {
		super();
	}

	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
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

	public String getHieuTruong() {
		return hieuTruong;
	}

	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}

	@Override
	public String toString() {
		return "Ten truong: " + ten + "\nDia chi truong: " + diaChi + "\nHieu truong: " + hieuTruong;
	}
	
}

class SinhVien extends Nguoi{
	private 
		String lop,nganh;
		Truong truong;
		
	public SinhVien() {
		super();
	}
	
	public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
	    super(ten, tuoi, gioiTinh);
	    this.lop = lop;
	    this.nganh = nganh;
	    this.truong = truong;
	}
	
	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}

	@Override
	public String toString() {
		return super.toString() + "\nLop sinh vien theo hoc: " + lop + "\nNganh: " + nganh + "\n" + truong;
	}
	
	
}

public class B42 {
	public static void main(String[] args) {
		Truong tr = new Truong("Dai hoc MDC", "Ha Noi", "Pham Van B");
		SinhVien sv = new SinhVien("Nguyen Van A",20,'0',"DCCTCT66L2", "CNTT",tr);
		System.out.println(sv);
	}
}
