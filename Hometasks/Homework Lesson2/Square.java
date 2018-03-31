package trainOne;

public class Square extends Shape {
	private Point a = new Point();
	private Point b = new Point();
	private Point c = new Point();
	private Point d = new Point();

	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Square() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	double getPerimetr() {
		double distAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		double p = distAB * 4;
		return p;
	}

	@Override
	double getArea() {
		double distAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		double ar = Math.pow(distAB, 2);
		return ar;
	}

}
