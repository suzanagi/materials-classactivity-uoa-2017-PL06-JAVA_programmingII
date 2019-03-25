public class TestRelatable {    

    public static void main(String[] args) {
	MyRectangle[] r = new MyRectangle[3];
        r[0] = new MyRectangle(10, 20);
        r[1] = new MyRectangle(40, 50);
	r[2] = new MyRectangle(30, 50);
	switch (r[0].isLargerThan(r[2])) {
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

