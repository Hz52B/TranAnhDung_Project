import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong so nguyen: ");
		int n = sc.nextInt();
		float sum = 0;
		for(int i = 1; i <= n; i++) {
			System.out.printf("Nhap gia tri thu %d :",i);
			int num = sc.nextInt();
			sum += num;
		}
		System.out.printf("Trung binh cong cua %d so tren la: %.2f",n,sum/n);
	}
}
