package ExcecptionInJava;

public class ExceptionHandle {
	
public static void main(String[] args) throws InterruptedException {
		
		int i = 9/0 ;   // ArithmeticException
		System.out.println(i);
		
		Thread.sleep(2000);
		
		String s = null;
		System.out.println(s.length()); // null pointer
	
	}

}
