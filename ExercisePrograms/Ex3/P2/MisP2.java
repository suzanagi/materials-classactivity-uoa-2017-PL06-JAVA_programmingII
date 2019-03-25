class SumTriangularMatrices{
    public static void main(String[] args){
	
        UpperTriangleArray U = new UpperTriangleArray(1);

	U.displayTriangle();
	
    }
}

class UpperTriangleArray{

    int matrix[][] = new int[6][6];
    
    UpperTriangleArray(int num){
	for(int i = 0; i < 6; i++){
	    for(int j = 0 + i; j < 6;  j++){
		matrix[i][j] = num;
		num++;
	    }
	}
    }

    void displayTriangle(){
	for(int i = 0; i < 6; i++){
	    for(int j = 0 + i; j < 6; j++){
		if(matrix[i][j] == null)
		System.out.print(String.format("%-2d ",matrix[i][j]));
	    }
	    System.out.println();
	}
    }
}

class LowerTriangleAllay{

}
