
public class Metodai05_07_negrazinantys {

	public static void main(String[] args) {
		printStart(5);
		printStart(3);
		printStart(9);

	}

	private static void printStart(int s) {
		for(int i=0; i < s; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
