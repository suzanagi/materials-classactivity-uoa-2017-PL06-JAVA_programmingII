
public class Circle implements Shape {
	private double radius;
	private Point p = new Point();
	
	public Circle(double r, double x, double y){
		this.radius = r;
		p.setX(x);
		p.setY(y);
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
