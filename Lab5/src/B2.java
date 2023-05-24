import java.util.*;
public class B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st = new Stack<>();
		int m;
		
		System.out.println("Nhap so phan tu cho Stack: ");
		int n = sc.nextInt();
		
		System.out.println("Nhap gia tri cho tung phan tu: ");
		for(int i = 0; i<n; i++) {
			System.out.printf("Nhap gia tri cho phan tu thu %d: ",i+1);
			int s = sc.nextInt();
			st.push(s);
		}
		
		do {
		System.out.println("Nhap so luong phan tu can lay: ");
		m = sc.nextInt();
		}while(m > n);
		
		System.out.println("Danh sach phan tu muon lay: ");
		for(int i = 0; i<m; i++) {
			if(!st.isEmpty()) {
				int s = st.pop();
				System.out.println(s);
			}else {
				System.out.println("Stack trong!");
				break;
			}
		}
	}
}
