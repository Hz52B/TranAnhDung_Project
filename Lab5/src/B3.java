import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class B3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		
		Queue<Integer> qe = new ArrayDeque<>();
		
		System.out.println("Nhap so luong phan tu cho day: ");
		int n = sc.nextInt();
		
		System.out.println("Nhap gia tri cho day: ");
		for(int i = 0; i<n; i++) {
			System.out.printf("Phan tu thu %d:",i+1);
			int s = sc.nextInt();
			qe.add(s);
		}
		
		do {
			System.out.println("Nhap so luong phan tu can lay: ");
			m = sc.nextInt();
			}while(m > n);
		
		for(int i=0; i<m; i++) {
			if(!qe.isEmpty()) {
				int s = qe.poll();
				System.out.println(s);
			}else {
				System.out.println("Day rong!");
				break;
			}
		}
	}
}
