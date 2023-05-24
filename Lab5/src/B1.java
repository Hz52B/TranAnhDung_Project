import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu nhien n: ");
		int n = sc.nextInt();
		
		ArrayList<Integer> cs = new ArrayList<>();
		int tam = n;
		while (tam > 0) {
			int s = tam%10;
			cs.add(s);
			tam /= 10;
		}
		
		boolean stn = true;
		int size = cs.size();
		for(int i=0; i<size/2; i++) {
			if(cs.get(i) != cs.get(size-i-1)) {
				stn = false;
				break;
			}
		}
		
		if(stn) {
			System.out.println(n + " la so thuan nghich");
		}else {
			System.out.println(n + " khong phai la so thuan nghich");
		}
	}
}
