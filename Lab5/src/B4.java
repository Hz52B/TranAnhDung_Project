import java.util.*;

public class B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong phan tu cho mang: ");
		int n  = sc.nextInt();
		
		double[] arr = new double[n];
		
		System.out.println("Nhap cac phan tu cho mang: ");
		for(int i= 0; i<n; i++) {
			System.out.printf("Phan tu thu %d: ",i+1);
			arr[i] = sc.nextDouble();
		}
		
		Set<Double> unE = new HashSet<>();
		Set<Double> duE = new HashSet<>();
		
		for(double element :arr) {
			if(!unE.contains(element)) {
				unE.add(element);
			}else {
				duE.add(element);
			}
		}
		
		System.out.println("Cac phan tu xuat hien 1 lan: ");
		for(double element : unE) {
			if(!duE.contains(element)){
				System.out.println(element);
			}
		}
		
		Map<Double,Integer> mp = new HashMap<>();
		for(double element : arr) {
			mp.put(element, mp.getOrDefault(element, 0)+1);
		}
		
		System.out.println("Cac phan tu xuat hien 1 lan: ");
		for(Map.Entry<Double, Integer> entry : mp.entrySet()){
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
