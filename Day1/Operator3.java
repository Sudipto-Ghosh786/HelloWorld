package Day1;

class Operator3 {

	public static void main(String[] args) {
		int intval = 10;
		float floatVal = 3.0f;
		boolean bool1 = true;
		boolean bool3 = true;

		System.out.println(intval + "%" + floatVal + "=" + (intval % floatVal));
		System.out.println();
		System.out.println("String concatenation");
		System.out.println("Day " + 2 + " Session");
		System.out.println("\n" + 2 + 3 + "\n" + (2 + 3));
		System.out.println();
		System.out.println("Realtional");
		System.out.println(intval + "==" + floatVal + " = " + (intval == floatVal));
		
		floatVal = 10.0f;
		
		System.out.println(intval + "==" + floatVal + " = " + (intval == floatVal));
		System.out.println();
		boolean bool2 = false;
		if (bool1 || (bool1 && (bool2 = false))) {
			System.out.println("Success");

		} else {
			System.out.println("failure");
		}
		System.out.println("bool2 value: " + bool2);

	}
}
