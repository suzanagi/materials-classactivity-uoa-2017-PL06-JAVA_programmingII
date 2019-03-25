class ClassifyingToys{
    public static void main(){
	Data[] triangle = new Data[11];
	triangle[] = new Data(0.03, 0.04, 0.05);
    }
}

class Data{
    float a2, b2, c2;
    /*shapeは、acute(鋭角)なら1, right(直角)なら2, obtuse(鈍角)なら3*/
    int shape;
    
    Data(float a, float b, float c){
	a2 = a * a;
	b2 = b * b;
	c2 = c * c;
    }

    /*三平方の定理よりshapeを求める*/
    void shape(){
	if(a2 + b2 == c2){
	    shape = 2;
	}
	else if(a2 + b2 < c2){
	    shape = 3;
	}
	else{
	    shape = 1;
	}
    }
}
