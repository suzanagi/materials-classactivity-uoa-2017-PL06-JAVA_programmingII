class TestObjects{
    public static void main(String[] args){
	float rectSides;
	float boxSides;
	
	Rectangle rect = new Rectangle(2.0f, 3.0f);
	Box mass = new Box(2.0f, 3.0f, 4.0f);

	rectSides = rect.lengthOfSides();
	boxSides = mass.lengthOfSides();

	System.out.println("rectangle length of sides: " + rectSides);
	System.out.println("length: " + rect.returnLength());
	System.out.println("height: " + rect.returnHeight());

	System.out.println("box length of sides: " + boxSides);
	System.out.println("length: " + mass.returnLength());
	System.out.println("height: " + mass.returnHeight());
	System.out.println("width: " + mass.returnWidth());

    }
}


class Rectangle{
    protected float length;
    protected float height;
    public Rectangle(float len, float hei){
	length = len;
	height = hei;
    }
    public float lengthOfSides(){
	return length * 2 + height * 2;
    }
    public float returnLength(){
	return length;
    }
    public float returnHeight(){
	return height;
    }

}

class Box extends Rectangle{
    private float width;
    public Box(float len, float hei, float wid){
	super(len, hei);
	width = wid;
    }
    public float lengthOfSides(){
	return length * 4 + height * 4 + width * 4;
    }
    public float returnWidth(){
	return width;
    }

}
