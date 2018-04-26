package trtwo;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input cups");
		int cups = sc.nextInt();
		Deque<String> och = new ArrayDeque<>();
		och.add("Sheldon");
		och.add("Leonard");
		och.add("Volovits");
		och.add("Kutrapalli");
		och.add("Penny");
		
		System.out.println(drinkCola(och, cups));
			
		}
	
	public static Deque<String> drinkCola(Deque<String> och,int c){
		
		for(int i=0; i<c; i++) {
			och.addLast(och.getFirst());
			och.addLast(och.getFirst());
			och.removeFirst();
		}
		
		
		return och;
		
		
	}
		
	}


