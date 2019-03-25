
public class Word {
	String name;
	int count;
	public Word(String name){
		this.name = name;
		this.count = 1;
	}
	public String returnWord(){
		return name;
	}
	public void plusCount(){
		count ++;
	}
	public int returnCount(){
		return count;
	}
}
