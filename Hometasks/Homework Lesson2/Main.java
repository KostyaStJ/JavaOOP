package trainOne;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(3,-1);
		Point b = new Point(3, 1);
		Point c = new Point(3, 1);
		Point d = new Point(3,1);
		
		Triangle x = new Triangle(a,b,c);
		System.out.println(x.getPerimetr());
		System.out.println(x.getArea());
		
		Square v = new Square(a,b,c,d);
		System.out.println(v.getPerimetr());
		System.out.println(v.getArea());
	}

}
