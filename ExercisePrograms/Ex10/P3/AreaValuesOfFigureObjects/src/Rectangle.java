
public class Rectangle implements Shape {
	private double width, height;
	private Point p = new Point();
	
	public Rectangle(double width, double height, double x, double y){
		this.width = width;
		this.height = height;
		p.setX(x);
		p.setY(y);
	}
	
	@Override
	public double getArea() {
		return width * height;
	}

}
