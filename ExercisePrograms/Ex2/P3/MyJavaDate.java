import java.util.Date;

class MyJavaDate{
    public static void main(String[] args){
	Date date = new Date();
	String name = "Yuta";
	System.out.print("Nice to see you, ");
	System.out.print(name + '!');
	System.out.println(" It is " + date.toString() + '.');
    }
}
