import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		int ns = sc.nextInt();
		
		LocalDate today = LocalDate.now();
		int tuoi = Period.between(LocalDate.of(ns, 1, 1), today).getYears();
		
		if(tuoi < 16) {
			System.out.println("Ban " + name + " o do tuoi vi thanh nien");
		}else if(tuoi >= 16 && tuoi <18 ) {
			System.out.println("Ban " + name + " o do tuoi truong thanh");
		}else {
			System.out.println("Ban " + name + " da gia");
		}
	}
}
