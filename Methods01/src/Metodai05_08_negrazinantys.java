
public class Metodai05_08_negrazinantys {

	public static void main(String[] args) {
		printSquare(10);
	}

	private static void printSquare(int s) {
		for (int i = 0; i < s; i++) {
			printStart(s);
		}
	}

	private static void printStart(int s) {
		for (int i = 0; i < s; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
