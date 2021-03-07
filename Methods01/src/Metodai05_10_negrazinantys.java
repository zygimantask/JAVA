
public class Metodai05_10_negrazinantys {

	public static void main(String[] args) {
		printTriangle(4);
	}
	private static void printTriangle(int size) {
		for (int i = 0; i <= size; i++) {
			printStars(i);
		}
	}
	private static void printStars(int s) {
		for (int i = 0; i < s; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
