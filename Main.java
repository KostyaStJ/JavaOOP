package OOP1;

public class Main {

	public static void main(String[] args) {
		Car carOne = new Car();
		carOne.setYear(1990);
		carOne.setWeight(2000);
		carOne.setColor("Green");
		
		carOne.beep();
		
		Car carTwo = new Car("Red", 1500, 2001);
		System.out.println();
		
		System.out.println(carOne);
		System.out.println(carTwo);

	}

}
