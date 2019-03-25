class ClassifyingToys{
    public static void main(String[] args){
	float[][] data = {
	    {0.03F, 0.04F, 0.05F},
	    { 3.0F,  4.0F,  5.0F},
	    { 0.3F,  0.4F,  0.5F},
	    {   2F,    3F,    4F},
	    {   5F,   12F,   13F},
	    { 0.5F,  1.2F,  1.3F},
	    {19.0F, 19.0F, 19.0F},
	    { 0.9F,  4.0F,  4.1F},
	    { 3.0F,  3.0F,  3.0F},
	    { 1.0F,  2.0F,  3.0F},
	    { 5.0F, 12.0F, 13.0F}
	};

	System.out.println("Length of the sides\tClassification");
	
	for(int i = 0; i < 11; i++){
	    for(int j = 0; j < 3; j++){
		System.out.print(String.format("%5.2f ",data[i][j]));
	    }
	    System.out.print("\t");
	    float a2 = data[i][0] * data[i][0];
	    float b2 = data[i][1] * data[i][1];
	    float c2 = data[i][2] * data[i][2];

	    /*三平方の定理より判別する(誤差を0.1認める)*/
	    if(a2 + b2 < c2 - 0.001){
		System.out.println("obtuse-angled");
	    }
	    else if(a2 + b2 > c2 + 0.1){
		System.out.println("acute-angled");
	    }
	    else{
		System.out.println("right-angled");
	    }
	    
	}
    }
}
