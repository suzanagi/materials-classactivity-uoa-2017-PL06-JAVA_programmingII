
public class Point implements Shape{
	private double x, y;
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}

	@Override
	public double getArea() {
		return 0.0;
	}
}
