package ExcecptionInJava;

public class ExceptionSoultion {

	public static void main(String[] args) {
		
		
		// 1. Try Catch Block
		try {
			int i = 9 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage()); // gives actual error 

			 e.printStackTrace(); // prints exception 
		}

		System.out.println("Expection handled success");

	}
	


}
