import java.io.*;
import java.util.*;

public class WordCounting {

	public static void main(String[] args) {
		File fin = new File("input.txt");
		
		/*Scannerを用意*/
		Scanner s = null;
		
		/*wordを記憶する配列(出現する単語は最大で200wordまでと想定する)*/
		Word[] words = new Word[300];
		/*すべての単語数（重複を含む）*/
		int allWord = 0;
		/*出現したwordの数（重複を含まない）*/
		int wordNum = 0;
		
		try{
			/*scannerに格納する*/
			s = new Scanner(new BufferedReader(new FileReader(fin)));
			
			/*一行ずつbufferに読み込み、wordを分解して処理する*/
			String buffer;
			while(s.hasNext()){
				buffer = s.next();
				boolean pass = false;
				allWord++; //重複を含む語数に加算
				for(int i = 0; i < wordNum; i++){
					if(buffer.equals(words[i].returnWord())){//すでに単語が存在したらcountを加算
						pass = true;
						words[i].plusCount();
						break;
					}
				}
				if(pass == false){//初めての単語だったらwordsに新しく生成
					words[wordNum] = new Word(buffer);
					wordNum++; //重複を含まない語数に加算
				}
			}
			/*テスト出力
				System.out.println("All words: "+allWord);
				System.out.println("Word num: "+wordNum);
				for(int i = 0; i < wordNum; i++){
					System.out.println(words[i].returnWord() + " : " + words[i].returnCount() + ", " + (double)words[i].returnCount() / (double) allWord);
				}
			*/
		}catch(FileNotFoundException e){
			System.out.println("File " + fin.getAbsolutePath() + " could not be found on filesystem");
		}catch(IOException ioe){
			System.out.println("exception while reading the file" + ioe);
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}catch(Exception e){
			System.out.println(e);
		}finally{
			/*Scannerが存在したらクローズする*/
			if(s != null) s.close();
		}
		
		
		File fout = new File("output_q2.txt");
		
		try{
			PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(fout)));
			p.println("Wordcount: " + allWord + ", Number of Words: " + wordNum);
			for(int i = 0; i < wordNum; i++){
				p.println(words[i].returnWord() + " : " + words[i].returnCount() + ", " + (double)words[i].returnCount() / (double) allWord);
			}
			p.close();
		}catch(FileNotFoundException e){
			System.out.println("File " + fout.getAbsolutePath() + " could not be found on filesystem");
		}catch(IOException ioe){
			System.out.println("exception while reading the file" + ioe);
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
