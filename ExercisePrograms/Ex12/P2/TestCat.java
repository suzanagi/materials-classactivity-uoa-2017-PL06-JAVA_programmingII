import java.io.*;
import java.util.*;

public class TestCat{
    public static void main(String[] args){
	File file1 = new File("./sample");
	File file2 = new File("./example");
	
	cat(file2);
    }
    public static void cat(File file) {
	RandomAccessFile input = null;
	String line = null;
	
	try {
	    input = new RandomAccessFile(file, "r");
	    while ((line = input.readLine()) != null) {
		System.out.println(line);
	    }
	    if (input != null) {
		input.close();
	    }
	    return;
	} catch (FileNotFoundException e) {
	    System.out.println("FileNotFound");
	} catch (IOException e) {
	    System.out.println("IOException");
	}
	//finally {
	//    
	//}
    }   
}
