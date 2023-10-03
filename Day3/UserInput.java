package Day3;

public class UserInput {
	public static void main(String[] args) {
		int num, iteration;
		num = Integer.parseInt(args[0]);
		iteration = Integer.parseInt(args[1]);
		for (int i = 1; i <= iteration; i++) {
			System.out.println(num * i);
		}
	}
}
