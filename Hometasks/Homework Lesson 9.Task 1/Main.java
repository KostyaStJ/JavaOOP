package hwnine;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		List();

	}
	public static void List () {
		ArrayList<Integer>a = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a.add(i);
			
		}
		
		a.remove(0);
		a.remove(1);
		a.remove(7);
		
		
		System.out.println(Arrays.toString(a.toArray()));
		
	}

}
