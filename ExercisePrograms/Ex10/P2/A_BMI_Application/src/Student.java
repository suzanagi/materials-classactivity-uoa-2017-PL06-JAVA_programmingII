
public class Student implements Relatable {

	private String name;
	private int age;
	private float weight;
	private float height;
	
	public Student(String name, int age, float weight, float height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public float getBMI(){
		return weight / (height * height);
	}
	
	@Override
	public int isLargerThan(Relatable other) {
		Student otherStudent = (Student)other;
		if(this.getBMI() < otherStudent.getBMI()) return -1;
		else if(this.getBMI() > otherStudent.getBMI()) return 1;
		else return 0;
	}

}
