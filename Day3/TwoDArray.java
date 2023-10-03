package Day3;

public class TwoDArray {
	public static void main(String[] args) {
		int firstArrayMatrix[][] = { { 1, 1, 1 }, { 1, 1, 1 } };
		int secondArrayMatrix[][] = { { 2, 2, 2 }, { 2, 2, 2 } };
		int thirdArrayMatrix[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				thirdArrayMatrix[i][j] = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];
				System.out.print(thirdArrayMatrix[i][j] + " ");
			}
			System.out.println();// new line
		}
	}

}
