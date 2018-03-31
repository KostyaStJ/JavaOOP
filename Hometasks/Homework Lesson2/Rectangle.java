package trainOne;

public class Rectangle extends Shape {
	private Point a = new Point();
	private Point b = new Point();
	private Point c = new Point();
	private Point d = new Point();
	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Rectangle() {
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
		double distBC = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
		double distCD = Math.sqrt(Math.pow((d.getX() - c.getX()), 2) + Math.pow((d.getY() - c.getY()), 2));
		double distDA = Math.sqrt(Math.pow((d.getX() - a.getX()), 2) + Math.pow((d.getY() - a.getY()), 2));
		double p = distAB + distBC + distCD + distDA;
		return p;
	}
	@Override
	double getArea() {
		double area;
		double distAB = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		double distBC = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
		double distCD = Math.sqrt(Math.pow((d.getX() - c.getX()), 2) + Math.pow((d.getY() - c.getY()), 2));
		double distDA = Math.sqrt(Math.pow((d.getX() - a.getX()), 2) + Math.pow((d.getY() - a.getY()), 2));
		if(distAB>distBC | distAB<distBC) {
			area = distAB*distBC;
		}else if(distCD > distDA | distCD < distDA) {
			area = distCD*distDA;
		}else {
			area = distBC*distCD;
		}
		return area;
	}
	
	
}
