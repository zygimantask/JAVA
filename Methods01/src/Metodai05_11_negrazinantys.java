
public class Metodai05_11_negrazinantys {

	public static void main(String[] args) {
		xMassTree(20);
	}

	private static void xMassTree(int size) {
		for (int i = 1; i <= size; i++) {
			printTarpai(size - i);
			printVirsune(2 * i - 1);
			System.out.println();
		}
		printKamienas(3, 2, size);
	}

	private static void printKamienas(int i, int j, int size) {
		for (int n = 0; n < j; n++) {
			printTarpai(size - j);
			printVirsune(2 * j - 1);
			System.out.println();
		}

	}

	private static void printTarpai(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(" ");
		}

	}

	private static void printVirsune(int s) {
		for (int i = 0; i < s; i++) {
			System.out.print("*");
		}

	}

}
