class TestFigures{
    public static void main(String[] args){
	String str;
	float value1, value2, value3;
	boolean bool;

	System.out.println(">Problem 1");
	
	/*Circle: (名前, 半径)*/
	Circle cir = new Circle("circle", 3.0f);
        str = cir.toString();
	value1 = cir.returnPerimeter();
	value2 = cir.returnArea();
	System.out.println(str);
	System.out.println("perimeter: " + value1 + "  area: " + value2);

	System.out.println();//改行

	/*Rectangle: (名前, 高さ, 底辺)*/
	Rectangle rect = new Rectangle("rectangle", 2.0f, 3.0f);
	str = rect.toString();
	value1 = rect.returnPerimeter();
	value2 = rect.returnArea();
	System.out.println(str);
	System.out.println("perimeter: " + value1 + "  area: " + value2);

	System.out.println();//改行
	
	/*Square: (名前, 辺の長さ)*/
	Square squ = new Square("square", 7.0f);
	str = squ.toString();
	value1 = squ.returnPerimeter();
	value2 = squ.returnArea();
	System.out.println(str);
	System.out.println("perimeter: " + value1 + "  area: " + value2);

	System.out.println();//改行
	
	/*Rhombus: (名前, 辺の長さ, 対角線の長さ)*/
	Rhombus rho = new Rhombus("rhombus", 10.0f, 4.0f);
	str = rho.toString();
	value1 = rho.returnPerimeter();
	value2 = rho.returnArea();
	System.out.println(str);
	System.out.println("perimeter: " + value1 + "  area: " + value2);

	System.out.println();//改行
	
	/*Parallelogram: (名前, 縦の辺の長さ, 横の辺の長さ, 対角線の長さ)*/
	Parallelogram par = new Parallelogram("parallelogram", 15.0f, 25.0f, 16.0f);
	str = par.toString();
	value1 = par.returnPerimeter();
	value2 = par.returnArea();
	System.out.println(str);
	System.out.println("perimeter: " + value1 + "  area: " + value2);

	System.out.println();//改行

	System.out.println(">Problem 2");

	Square S1 = new Square("S1", 7.0f);
	Square S2 = new Square("S2", 7.000001f);
	str = S1.toString();
	System.out.println(str);
	System.out.println("and");
	str = S2.toString();
	System.out.println(str);
	System.out.print("are ");
	bool = S1.equals(S2);

	if(bool == true) System.out.println("equal to each other");
	else System.out.println("different with each other");

	System.out.println();

	Rhombus rh1 = new Rhombus("rhombus", 7.0f, 4.0f);
	str = S1.toString();
	System.out.println(str);
	System.out.println("and");
	str = rh1.toString();
	System.out.println(str);
	System.out.println("are");
	bool = S1.equals(rh1);

	if(bool == true) System.out.println("equal to each other");
	else System.out.println("different with each other");
    }
}

class Shape {
    private String name;
    public Shape(String name) { 
	this.name = name;
    }
    public Shape() {
	name = "no name";
    }
    public String getName() {
	return name;
    }
    public String toString() {
	return getClass().getName() + " " + name;
    }
    public boolean equals(Shape obj){
	if(obj == null) return false;
	else if(getClass() == obj.getClass()){
	    return obj.getName() == name;
	}
	else return false;
    }
}

class Circle extends Shape {
    private float radius;
    public Circle(String name, float radius){
	super(name);
	this.radius = radius;
    }
    public float returnRadius(){
	return radius;
    }
    public float returnPerimeter(){
	return radius * 2.0f * (float)Math.PI;
    }
    public float returnArea(){
	return radius * radius * (float)Math.PI;
    }
    public String toString() {
	return getClass().getName() + " " + getName() + "  radius " + radius;
    }
    public boolean equals(Circle obj){
	if(obj == null) return false;
	else if(getClass() == obj.getClass()){
	    return radius == obj.returnRadius();
	}
	else return false;
    }
}

class Rectangle extends Shape {
    protected float height, width;
    public Rectangle(String name, float height, float width){
	super(name);
	this.height = height;
	this.width = width;
    }
    public float returnHeight(){
	return height;
    }
    public float returnWidth(){
	return width;
    }
    public float returnPerimeter(){
	return height * 2.0f + width * 2.0f;
    }
    public float returnArea(){
	return height * width;
    }
    public String toString() {
	return getClass().getName() + " " + getName()
	    + "  side one " + height + "  side two " + width;
    }
    public boolean equals(Rectangle obj){
	if(obj == null) return false;
	else if(getClass() == obj.getClass()){
	    return obj.returnHeight() == height && obj.returnWidth() == width;
	}
	else return false;
    }
}

class Square extends Rectangle{
    /*誤差許容範囲を固定*/
    private static final float Tolerance = 0.00001f;    

    public Square(String name, float side){
	super(name, side, side);
    }
    public float returnPerimeter(){
	return height * 4.0f;
    }
    public float returnArea(){
	return height * height;
    }
    public String toString() {
	return getClass().getName() + " " + getName()
	    + "  side " + height;
    }
    public boolean equals(Square obj){
        
	if(obj == null) return false;
	else if(getClass() == obj.getClass()){
	    return obj.returnHeight() <= this.height + Tolerance 
		|| obj.returnHeight() >= this.height - Tolerance;
	}
	else return false;
    }
}

class Rhombus extends Square{
    private float diagonal;
    public Rhombus(String name, float side, float diagonal){
	super(name, side);
	this.diagonal = diagonal;
    }
    public float returnDiagonal(){
	return diagonal;
    }
    public float returnPerimeter(){
	return height * 4.0f;
    }
    public float returnArea(){
	/*ここではヘロンの公式を用いる*/
	double s = (height * 2.0 + diagonal) / 2.0;
	double e = s * (s - height) * (s - height) * (s - diagonal);
	double result = Math.sqrt(e) * 2.0;
	return (float)result;
    }
    public String toString() {
	return getClass().getName() + " " + getName()
	    + "  side " + height + "  diagonal " + diagonal;
    }
    public boolean equals(Rhombus obj){
	if(obj == null) return false;
	else if(getClass() == obj.getClass()){
	    return obj.returnHeight() == this.height 
		&& obj.returnDiagonal() == diagonal;
	}
	else return false;
    }
}

class Parallelogram extends Rectangle{
    private float diagonal;
    public Parallelogram(String name, float height, float width, float diagonal){
	super(name, height, width);
	this.diagonal = diagonal;
    }
    public float returnDiagonal(){
	return diagonal;
    }
    public float returnPerimeter(){
	return height * 2 + width * 2;
    }
    public float returnArea(){
	double s = (height + width + diagonal) / 2.0;
	double e = s * (s - height) * (s - width) * (s - diagonal);
	double result = Math.sqrt(e) * 2.0;
	return (float)result;
    }
    public String toString() {
	return getClass().getName() + " " + getName()
	    + "  side1 " + height + "  side2 " + width +"  diagonal " + diagonal;
    }
    public boolean equals(Parallelogram obj){
	if(obj == null) return false;
	else if(getClass() == obj.getClass()){
	    return obj.returnHeight() == this.height
		&& obj.returnWidth() == this.width
		&& obj.returnDiagonal() == this.diagonal;
	}
	else return false;
    }
}
