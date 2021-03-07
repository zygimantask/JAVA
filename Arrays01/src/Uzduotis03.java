import java.util.Arrays;
import java.util.Scanner;

// randomGrades() - kuri suraðo á masyvà n atsitiktiniø reikðmiø, gautø ið funkcijos randomNumber().

public class Uzduotis03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite kiek bus reiksmiu");
		int n = reader.nextInt();
		int min = -10;
		int max = 10;

		System.out.println(Arrays.toString(randomGrades(n, min, max)));
		reader.close();

	}

	private static int randomNumber(int min, int max) {
		int range = max - min + 1;
		return (int) (Math.random() * range) + min;

	}

	private static int[] randomGrades(int n, int min, int max) {
		int[] masyvas = new int[n];
		for (int i = 0; i < n; i++) {
			masyvas[i] = randomNumber(min, max);
		}
		return masyvas;
	}
}
