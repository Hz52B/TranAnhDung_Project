import java.util.*;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<Object> ArrL = new ArrayList<>();
		
		ArrL.add(100);
		ArrL.add(3.14);
		ArrL.add(true);
		ArrL.add("Hello Kitty");
		
		for(Object value : ArrL) {
			System.out.println(value);
		}
	}
}
