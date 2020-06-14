package ExcecptionInJava;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("ABC");

		try {
			throw new Exception("New Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("PQR");
	
	String excep_flag = "  ";
	if(excep_flag.equals("  "))
	{
		try {
			throw new Exception("New Blank Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}}
