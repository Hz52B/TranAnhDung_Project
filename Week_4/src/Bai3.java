<<<<<<< HEAD
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		int ns = sc.nextInt();
		
		int tuoi = 2023 - ns;
		
		if(tuoi < 16) {
			System.out.println("Ban " + name + " o do tuoi vi thanh nien");
		}else if(tuoi >= 16 && tuoi <18 ) {
			System.out.println("Ban " + name + " o do tuoi truong thanh");
		}else {
			System.out.println("Ban " + name + " da gia");
		}
	}
}
=======
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		int ns = sc.nextInt();
		
		int tuoi = 2023 - ns;
		
		if(tuoi < 16) {
			System.out.println("Ban " + name + " o do tuoi vi thanh nien");
		}else if(tuoi >= 16 && tuoi <18 ) {
			System.out.println("Ban " + name + " o do tuoi truong thanh");
		}else {
			System.out.println("Ban " + name + " da gia");
		}
	}
}
>>>>>>> 09b004b515920c2f8454ea752603a7380544c0a6
