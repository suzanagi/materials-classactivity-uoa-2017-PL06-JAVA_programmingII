class Person {
  private String name;
 public Person(String name) {
   this.name = name;
 }
 public String introduction() {
    return "My name is " + name + ".";
  }
}
class Student extends Person {
  private String id;
  public Student(String name, String id){
    super(name);
    this.id = id;
  }
  public String introduction() {
    return "I am a student. " + super.introduction() + " My ID is "+ id + ".";
  }
}
public class PolymorphismDemo {
  public static void main(String[] args) {
       Student s = 
          new Student("Saito","s115333"); 
        Person h = s;  
        System.out.println(s.introduction());
        System.out.println(h.introduction());
   }
}
