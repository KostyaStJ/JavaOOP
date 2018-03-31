package trainOne;

public class Triangle extends Shape {
	private Point a = new Point();
	private Point b = new Point();
	private Point c = new Point();

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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

	@Override
	double getPerimetr() {
		double distAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		double distBC = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
		double distCA = Math.sqrt(Math.pow((a.getX() - c.getX()), 2) + Math.pow((c.getY() - a.getY()), 2));

		double p = distAB + distBC + distCA;
		return p;
	}

	@Override
	double getArea() {
		double distAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		double distBC = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
		double distCA = Math.sqrt(Math.pow((a.getX() - c.getX()), 2) + Math.pow((c.getY() - a.getY()), 2));
		double p = (distAB + distBC + distCA) / 2.0;
		double ar = Math.sqrt(p * (p - distAB) * (p - distBC) * (p - distCA));
		return ar;
	}

}
