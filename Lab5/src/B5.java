import java.util.*;
import java.util.ArrayList;

public interface B5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so phan tu cho mang: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		System.out.println("Nhap gia tri cho cac phan tu trong mang: ");
		for(int i = 0; i<n; i++) {
			System.out.printf("Phan tu thu %d: ",i+1);
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("Nhap so thuc can tim: ");
		double A = sc.nextDouble();
		
		Set<Double> set = new HashSet<>();
		for(double element : arr) {
			set.add(element);
		}
		if(set.contains(A)) {
			System.out.println("Mang chua so thuc: "+A);
		}else System.out.println("Mang khong chua so thuc: "+A);
		
		Map<Double, Integer> mp = new HashMap<>();
		for(double element : arr) {
			mp.put(element, mp.getOrDefault(element, 0)+1);
		}
		
		Set<Double> st = new TreeSet<>(Comparator.reverseOrder());
		for(Map.Entry<Double, Integer> entry : mp.entrySet()) {
			if(entry.getValue()==1) {
				st.add(entry.getKey());
			}
		}
		
		System.out.println("Cac phan tu xuat hien 1 lan theo thu tu giam dan: ");
		for(double element : st) {
			System.out.println(element);
		}
	}
}
