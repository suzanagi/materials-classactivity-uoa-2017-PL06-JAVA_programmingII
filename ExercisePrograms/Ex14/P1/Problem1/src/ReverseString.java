import java.io.*;
import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		File file = new File("../input.txt"); //create a file object
		ArrayList al = new ArrayList(); // create an ArrayList
		int ch; //variable to store the current byte
		try{
			FileInputStream fin = new FileInputStream(file);
			while( (ch = fin.read()) != -1 )
				al.add(ch);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream("output_q1.txt");
			
			for(int i = al.size(); i > 0; i--){
				int o = (int) al.get(i - 1);
				char c = (char) o;
				fout.write(c);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("File " + file.getAbsolutePath() + " could not be found on filesystem");
		}catch(IOException ioe){
			System.out.println("Exception while reading the file" + ioe);
		}
		System.out.println("\n Program is finished.");
	}

}
