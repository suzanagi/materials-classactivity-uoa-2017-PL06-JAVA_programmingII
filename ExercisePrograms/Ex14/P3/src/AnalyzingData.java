import java.io.*;
public class AnalyzingData {
	static final String dataFile = "DataStream";
	public static void main(String[] args) {
		DataInputStream in = null;
		try{
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
			try{
				double averageBreath = 0.0;
				for(int i = 0; i < 60; i++){//データ数は60
					averageBreath += (double)in.readInt();
				}
				averageBreath /= 60.0;
				if(averageBreath > 30.0) System.out.println("Treatment is necessary: average rate of breath per minute is " + averageBreath);
			}catch(Exception e){
				System.out.println(e);
			}
			in.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
