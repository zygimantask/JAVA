import java.util.Scanner;

public class Taromatas_UZD_01 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int m = 0;
		int s = 0;
		int p = 0;
		String tara;

		while (true) {
			System.out.println("Áveskite duomenis (m, s, p)");
			tara = reader.nextLine();
			if (tara.equals("0")) {
				break;
			}

			if (tara.equals("m")) {
				m++;
			} else if (tara.equals("s")) {
				s++;
			} else if (tara.equals("p")) {
				p++;
			} else {
				System.out.println("Klaida");
			}

		}
		reader.close();
		printInfo(m, s, p);
		printTotal(m, s, p);
		printMax(m, s, p);
	}

	private static void printMax(int m, int s, int p) {
		int max = Math.max(m, Math.max(s, p));
		if (max == m) {
			System.out.println("Metaliniø pakuoèiø priimta daugiausiai");
		} else if (m == p) {
			System.out.println("Plastikiniø pakuoèiø priimta daugiausiai");
		} else
			System.out.println("Stikliniø pakuoèiø priimta daugiausiai");
	}

	private static void printTotal(int m, int s, int p) {
		double suma = m + s + p;
		double sumaTotal = (suma * 0.1);
		System.out.printf("%.2f Eur", sumaTotal);
		System.out.println();
	}

	private static void printInfo(int m, int s, int p) {
		System.out.println("Metaliniø: " + m);
		System.out.println("Stikliniø: " + s);
		System.out.println("Plastikiniø: " + p);
	}

}
