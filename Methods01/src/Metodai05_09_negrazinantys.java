
public class Metodai05_09_negrazinantys {

	public static void main(String[] args) {
		printRectangle(17, 3);
	}

	private static void printRectangle(int i, int j) {
		for (int b = 0; b < j; b++) {
			printStart(i);
		}
	}

	private static void printStart(int i) {
		for (int a = 0; a < i; a++) {
			System.out.print("*");
		}
		System.out.println();
	}
}