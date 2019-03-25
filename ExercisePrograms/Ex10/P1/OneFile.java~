interface Relatable {
	
   // this (object calling isLargerThan) and
   // other must be instances of the same class
   // returns 1, 0, -1 if this is greater
   // than, equal to, or less than other
   public int isLargerThan(Relatable other);
   
}

class Point {
    private int x = 0;
    private int y = 0;
	// a constructor!
    public Point(int x, int y) {
	this.x = x;
	this.y = y;
    }
    // a method for moving the point
    public void move(int x, int y) {
	this.x = x;
	this.y = y;
    }
}

class RectanglePlus implements Relatable {
    private int width = 0;
    private int height = 0;
    private Point origin;

    // two constructors
    public RectanglePlus() {
	origin = new Point(0, 0);
    }

    public RectanglePlus(int w, int h) {
	origin = new Point(0, 0);
	width = w;
	height = h;
    }


    // a method for moving the rectangle
    public void move(int x, int y) {
	origin.move(x,y);
    }

    // a method for computing the area of the rectangle
    public int getArea() {
	return width * height;
    }
    
    // a method to implement Relatable
    public int isLargerThan(Relatable other) {
    	RectanglePlus otherRect = (RectanglePlus)other;
    	if (this.getArea() < otherRect.getArea())
    		return -1;
    	else if (this.getArea() > otherRect.getArea())
    		return 1;
    	else
    		return 0;    		
    }
}

public class OneFile {
	public static void main(String[] args) {
		RectanglePlus r1 = new RectanglePlus(10, 20);
		RectanglePlus r2 = new RectanglePlus(40, 50);
		switch (r1.isLargerThan(r2)) {
			case 1:
				System.out.println("r1 is greater than r2");
				break;
			case 0:
				System.out.println("r1 is equal to r2");
				break;
			default:
				System.out.println("r1 is less than r2");
				break;

		}

	}
}