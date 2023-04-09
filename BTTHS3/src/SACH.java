import java.util.Scanner;

public class SACH {
    private String ma, ten, tg;
    private int trang, tap, gia;
    private String loai, nxb;

    void NHAPSACH() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        ma = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        ten = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tg = sc.nextLine();
        System.out.print("Nhap so trang: ");
        trang = sc.nextInt();
        System.out.print("Nhap so tap: ");
        tap = sc.nextInt();
        System.out.print("Nhap loai sach: ");
        loai = sc.nextLine();
        loai = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nxb = sc.nextLine();
        System.out.print("Nhap gia sach: ");
        gia = sc.nextInt();
    }

    void INSACH() {
        System.out.println("Ma sach: " + ma);
        System.out.println("Ten sach: " + ten);
        System.out.println("Ten tac gia: " + tg);
        System.out.println("So trang: " + trang);
        System.out.println("So tap: " + tap);
        System.out.println("Loai sach: " + loai);
        System.out.println("Nha xuat ban: " + nxb);
        System.out.println("Gia sach: " + gia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach can nhap: ");
        int n = sc.nextInt();
        SACH[] dsSach = new SACH[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho cuon sach thu " + (i+1) + ":");
            dsSach[i] = new SACH();
            dsSach[i].NHAPSACH();
        }

        System.out.println("\nDanh sach cac cuon sach da nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sach thu " + (i+1) + ":");
            dsSach[i].INSACH(); 
            
        }
    }
}
