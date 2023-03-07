import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,gt = 1;
		do {
			System.out.println("Nhap vao so nguyen duong n: ");
			n = sc.nextInt();
		}while(n <= 0);
		for(int i = n; i > 0; i--) {
			gt *= i;
		}
		System.out.println("Giai thua cua " + n + " la: " + gt);
	}
}
