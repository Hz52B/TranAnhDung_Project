import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum = 0;
		do {
			System.out.println("Nhap vao so nguyen bat ky: ");
			n = sc.nextInt();
			sum += n;
		}while(sum <= 100);
			System.out.println("Tong cua cac so da nhap la: " + sum);
			sc.close();
	}
}
