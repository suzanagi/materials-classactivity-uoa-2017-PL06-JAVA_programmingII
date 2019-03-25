class PeopleIntroduction{
	public static void main(String[] args){
	    int num = 6;
	    Person[] p = new Person[num];
	    p[0] = new Person("Nemoto");
	    p[1] = new Student("Nemoto", "s1240234");
	    p[2] = new EnglishPerson("Nemoto");
	    p[3] = new EnglishStudent("Nemoto", "s1240234");
	    p[4] = new JapanesePerson("Nemoto");
	    p[5] = new JapaneseStudent("Nemoto", "s1240234");

	    for(int i = 0; i < num; i++)
		System.out.println(p[i].Greeting());
	}
}

class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public String Greeting(){
		return "My name is " + name + ". ";
	}
}

class EnglishPerson extends Person{
	public EnglishPerson(String name){
		super(name);
	}
	public String Greeting(){
		return "How do you do? " + super.Greeting();
	}
}

class JapanesePerson extends Person{
	public JapanesePerson(String name){
		super(name);	
	}
	public String Greeting(){
		return "Hajime mashite. " + super.Greeting();
	}
}

class Student extends Person{
	private String id;
	public Student(String name, String id){
		super(name);
		this.id = id;
	}
	public String Greeting(){
		return "I am a student. " + super.Greeting() + "My ID is " + this.id;	
	}
}

class EnglishStudent extends Student{
	public EnglishStudent(String name, String id){
		super(name, id);
	}
	public String Greeting(){
		return "How do you do?"	+ super.Greeting();
	}
}

class JapaneseStudent extends Student{
	public JapaneseStudent(String name, String id){
		super(name, id);	
	}
	public String Greeting(){
		return "Hajime mashite. " + super.Greeting();	
	}
}
