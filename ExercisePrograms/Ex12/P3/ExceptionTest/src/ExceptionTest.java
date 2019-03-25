
public class ExceptionTest {

	public static void main(String[] args) {
		try{
		    int[] a = new int[9]; //java.lang.NegativeArraySizeException
		    int[] b = new int[20]; //java.lang.OutOfMemoryError
		    int[] c = new int[9];
		    
		    Object tc = new TestClass();
		    ((Integer)tc).byteValue(); //java.lang.ClassCastException
		    tc = null;
		    tc.toString(); //java.lang.NullPointerException
		    
			for(int i=0; i<10; i++){
			    c[i] = i/(5-i); //java.lang.ArithmeticException
			    b[i] = i; //java.lang.ArrayIndexOutOfBoundsException
			}
		} catch(NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmaticException");
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("ArrayIndexOutOfBoundsException");
		} catch (ClassCastException e) {
			System.out.println("ClassCastException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}
	


