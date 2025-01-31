
public class TestSphere {

	public static void main(String[] args) {
		Sphere ball1, ball2, ball3;
		/*ball1とball2の半径は同じく3.0, ball3の半径を5.0とする.*/
		ball1 = new Sphere(3.0f);
		ball2 = new Sphere(3.0f);
		ball3 = new Sphere(5.0f);

		System.out.println("ball1 volume is " + ball1.volumeSphere());
		System.out.println("ball2 volume is " + ball2.volumeSphere());
		System.out.println("ball3 volume is " + ball3.volumeSphere());

		System.out.println("height between ball1 to ball2 is" + ball1.heightContactPoint(ball2));
		System.out.println("height between ball1 to ball3 is" + ball1.heightContactPoint(ball3));
		System.out.println("height between ball2 to ball1 is" + ball2.heightContactPoint(ball1));
		System.out.println("height between ball2 to ball3 is" + ball2.heightContactPoint(ball3));
		System.out.println("height between ball3 to ball1 is" + ball3.heightContactPoint(ball1));
		System.out.println("height between ball3 to ball2 is" + ball3.heightContactPoint(ball2));

	}

}

class Sphere{
    float radius; //sphere's radius(cm)
    Sphere(float f){
	radius = f;
    }
    float volumeSphere(){//V = (4/3) x Pi x r^3
	return ((float)4/(float)3) * (float)Math.PI * radius * radius * radius;
    }
    float heightContactPoint(Sphere secondSphere){
	float compradius = secondSphere.radius;
	float height;

	//System.out.println("radius: " + radius + "compradius: " + compradius);
	
	if(radius < compradius){
	    height = radius * ((compradius - radius) / (compradius + radius) + 1);
	}
	else if(radius > compradius){
	    height = compradius * ((radius - compradius) / (radius + compradius) + 1);
	}
	else{
	    height = radius;
	}
	return height;
    }
}

