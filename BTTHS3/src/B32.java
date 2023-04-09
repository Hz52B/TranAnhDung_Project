import java.util.Scanner;
import java.lang.Math;

class Diem {
    private
        double x, y;
    public
        Scanner sc = new Scanner(System.in);
        void Nhapdiem() {
            System.out.print("Nhap toa do x: ");
            x = sc.nextInt();
            System.out.print("Nhap toa do y: ");
            y = sc.nextInt();
        }
        void InDiem() {
            System.out.printf("Toa do diem la: (%f, %f)\n", this.x, this.y);
            }
        double DoDai(Diem A, Diem B){
            return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
        }
}

class TamGiac extends Diem {
    private
        Diem A = new Diem(), B = new Diem(), C = new Diem();
    public
        Scanner sc = new Scanner(System.in);
        void NhapTG() {
        	System.out.println("Nhap toa do 3 diem cua tam giac:");
            System.out.print("\nNhap toa do diem A: \n");
            this.A.Nhapdiem();
            System.out.print("\nNhap toa do diem B: \n");
            this.B.Nhapdiem();
            System.out.print("\nNhap toa do diem C: \n");
            this.C.Nhapdiem();
            
        }
        void InTamGiac() {
            System.out.println("\nTam giac co toa do 3 diem la:");
            System.out.print("Diem A: ");
            this.A.InDiem();
            System.out.print("Diem B: ");
            this.B.InDiem();
            System.out.print("Diem C: ");
            this.C.InDiem();
        }
        boolean KiemTra() {
            if(DoDai(A,B) + DoDai(B,C) > DoDai(C,A) && DoDai(B,C) + DoDai(C,A) > DoDai(A,B) 
            && DoDai(C,A) + DoDai(A,B) > DoDai(B,C)) {
            	return true; }
            else {
            	return false;
            }
        }
        double ChuVi() {
            return (DoDai(A,B) + DoDai(B,C) + DoDai(C,A));
        }
        double DienTich() {
            double p = ((DoDai(A,B) + DoDai(B,C) + DoDai(C,A)) / 2);
            return Math.sqrt(p * (p - DoDai(A,B)) * (p - DoDai(B,C)) * (p - DoDai(C,A)));
        }
}

class DuongTron extends Diem {
    private
        Diem O = new Diem();
        double r;
    public
        void NhapDT() {
            System.out.println("Nhap toa do tam O: ");
            O.Nhapdiem();
            System.out.print("Nhap ban kinh: ");
            r = sc.nextDouble();
        }
    void InDuongTron() {
        System.out.println("\nDuong tron tam O co toa do:");
        System.out.print("Tam O: ");
        this.O.InDiem();
        System.out.print("Ban kinh r: " + r);
        }
        double ChuVi() {
            return (2 * 3.14 * r);
        }
        double DienTich() {
            return (3.14 * r * r);
        }
}

public class B32 {
    public static void main(String[] args) {
        TamGiac ABC = new TamGiac();
        ABC.NhapTG();
        ABC.InTamGiac();
        if(ABC.KiemTra()) System.out.println("ABC la Tam Giac");
        else System.out.print("ABC Khong Phai Tam Giac");
        System.out.println("Chu Vi Tam Giac la:" + ABC.ChuVi()); 
        System.out.println("Dien Tich Tam Giac la:" + ABC.DienTich()); 

        DuongTron O = new DuongTron();
        O.NhapDT();
        O.InDuongTron();
        System.out.println("Chu Vi Duong Tron la:" + O.ChuVi()); 
        System.out.println("Dien Tich Duong Tron la:" + O.DienTich()); 
    }
}