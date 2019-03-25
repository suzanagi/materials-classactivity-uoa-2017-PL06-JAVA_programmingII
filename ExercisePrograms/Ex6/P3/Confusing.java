class Confusing { 
    private Confusing (Object o) { // DO NOT CHANGE THIS LINE
	System.out.println("Object");
    }
    private Confusing (double[] dArray) { // DO NOT CHANGE THIS LINE
	System.out.println("double array");
    }
    public static void main(String[] args) {
	Confusing o;
	o = new Confusing(null); // DO NOT CHANGE THIS LINE
    }
}
    
