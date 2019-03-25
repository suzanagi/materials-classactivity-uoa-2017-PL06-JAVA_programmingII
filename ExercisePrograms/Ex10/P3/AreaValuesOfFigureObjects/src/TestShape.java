
public class TestShape {

	public static void main(String[] args) {
		/*
		 * create 
		 * 3 objects of the Point class, 
		 * 4 objects of the Circle class, 
		 * and 
		 * 5 objects of the Rectangle class.
		 */	
		Object[] o = new Object[12];
		
		o[0] = new Point();
		o[1] = new Point();
		o[2] = new Point();
		
		o[3] = new Circle (3.0, 0.0, 0.0);
		o[4] = new Circle (3.0, 0.0, 0.0);
		o[5] = new Circle (3.0, 0.0, 0.0);
		o[6] = new Circle (3.0, 0.0, 0.0);
		
		o[7] = new Rectangle(5.0, 3.0, 0.0, 0.0);
		o[8] = new Rectangle(5.0, 3.0, 0.0, 0.0);
		o[9] = new Rectangle(5.0, 3.0, 0.0, 0.0);
		o[10] = new Rectangle(5.0, 3.0, 0.0, 0.0);
		o[11] = new Rectangle(10.0, 6.0, 0.0, 0.0);
		
		double area = 0.0;
		
		for(int i = 0; i < 12; i++){
			area += ((Shape) o[i]).getArea();
		}
		
		System.out.println("Sum of the area is: " + area);
	}

}
