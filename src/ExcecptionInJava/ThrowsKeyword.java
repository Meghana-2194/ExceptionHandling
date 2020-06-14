package ExcecptionInJava;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("Success");

	}

	public void sum() {
		try {
			div();
		} catch (Exception e) {

		}
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
	}

}
