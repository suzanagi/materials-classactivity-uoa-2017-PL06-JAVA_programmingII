import java.util.Random;

public class CalculatingWorkingHours {
	public static void main(String[] args) { 
		  /*労働者のオブジェクト*/
	      Employee[] e; 
	      /*給与の合計*/
	      int salary = 0;
	      // Randomクラスのインスタンス化
	      Random rand = new Random(); 
	      e = new Employee[rand.nextInt(500)]; 
	      /*ランダムな数の社員をランダムな役職で生成する*/
	      for(int i = 0; i< e.length; i++) { 
	         switch (rand.nextInt(4)) {
	           case 0: 
	            e[i] = new Regular(2000); 
	            break; 
	           case 1: 
	            e[i] = new PartTime(1000); 
	            break; 
	           case 2: 
	            e[i] = new Engineer(2500); 
	            break; 
	           case 3: 
	            e[i] = new Manager(2900);
	            break; 
	         } 
	         e[i].generateNumberHours();
	         salary += e[i].getH() * e[i].getW();
	      } 
	      /*総労働者数を表示*/
	      System.out.println("Workers: "+ e.length);
	      /*支払う給与を表示*/
	      System.out.println("Salary: "+ salary);
	/* your code */ 
	   } // the end of the main method 
}    // the end of the class CalculatingWorkingHours 


