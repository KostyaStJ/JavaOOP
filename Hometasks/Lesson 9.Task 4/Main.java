package trtwo;

import java.sql.DriverPropertyInfo;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input cups");
		int cups = sc.nextInt();
		ArrayDeque<String> och = new ArrayDeque<>();
		och.add("Sheldon");
		och.add("Leonard");
		och.add("Volovits");
		och.add("Kutrapalli");
		och.add("Penny");
		
		System.out.println(drinkCola(och, cups));
			
		}
	
	public static ArrayDeque<String> drinkCola(ArrayDeque<String> o,int c){
		
		for(int i=0; i<c; i++) {
			o.addLast(o.getFirst());
			o.addLast(o.getFirst());
			o.removeFirst();
		}
		
		
		return o;
		
		
	}
		
	}


