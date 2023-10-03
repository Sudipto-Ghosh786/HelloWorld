package Day1;

public class Operator1 {
	public static void main(String[] args) {
		int intVal = 100;
		byte byteVal = (byte) intVal;

		byte maxVal = 127;
		byte minVal = -128;

		byte sum = (byte) (maxVal + minVal);

		System.out.println("Sum:- " + sum);
	}
}
