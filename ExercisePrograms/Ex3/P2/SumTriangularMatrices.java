class SumTriangularMatrices{
    public static void main(String[] args){

	//int row = 6;
	
	int[][] L= {
	    {60},
	    {61, 62},
	    {63, 64, 65},
	    {66, 67, 68, 69},
	    {70, 71, 72, 73, 74},
	    {75, 76, 77, 78, 79, 80},
	};

	int[][] U= {
	    { 1,  2,  3,  4,  5,  6},
	    { 7,  8,  9, 10, 11},
	    {12, 13, 14, 15},
	    {16, 17, 18},
	    {19,20},
	    {21}
	};

	int[][] S = new int[6][6];

	for(int i = 0; i < 6; i++){
	    for(int j = 0; j < 6; j++){
		if(i == j){
		    /*重複している部分(i == j)は加算して入れる*/
		    S[i][j] = U[i][j-i] + L[i][j];
		}
		else if(j > i){
		    /*右上の部分(j > i)はUのデータを入れる*/
		    S[i][j] = U[i][j-i];
		    }
		else{
		    /*左下の部分(i > j)はLのデータを入れる*/
		    S[i][j] = L[i][j];
		}
	    }
	}

	System.out.println("Sum =");
	for(int i = 0; i < 6; i++){
	    for(int j = 0; j < 6; j++){
		System.out.print(String.format("%3d ",S[i][j]));
	    }
	    System.out.println();
	}
    }
}
