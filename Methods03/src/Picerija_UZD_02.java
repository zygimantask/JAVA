import java.util.Scanner;

public class Picerija_UZD_02 {

	public static void main(String[] args) {

		int picosDydis;
		int picosIngredientuSk;
		String picosTipas;
		String picosIngredientai = "";

		Scanner reader = new Scanner(System.in);
		System.out.println("Pasigamink pica:");
		System.out.println("1 �ingsnis. Picos tipas - storapade ar plonapade: ");
		picosTipas = reader.nextLine();

		System.out.println("2 �ingsnis. Picos dydis - 20cm, 30cm, 50cm:");
		picosDydis = reader.nextInt();

		System.out.println("3 �ingsnis. Ingredientai: ");
		System.out.println("1. S�ris");
		System.out.println("2. Kumpis");
		System.out.println("3. De�ra");
		System.out.println("4. Pomidorai");
		System.out.println("5. Pievagrybiai");
		System.out.println("6. Alyvuog�s");
		System.out.println("7. Marinuoti agurk�liai");
		System.out.println("");

		System.out.println("Kiek reikia ingredient�?");
		picosIngredientuSk = reader.nextInt();

		System.out.println("�veskite ingredientus vienoje eilut�je: ");
		picosIngredientai = reader.nextLine();

		reader.close();

		System.out.println("Uzsakyta pica: ");
		System.out.println(picosTipas + ", " + picosDydis + "cm, " + picosIngredientai);
		System.out.println("Kaina: "
				+ printPizzaPrice(printPadas(picosTipas), printSkersmuo(picosDydis), printIngSk(picosIngredientuSk))
				+ " Eur");

	}

	private static double printPizzaPrice(double printPadas, double printSkersmuo, double printIngSk) {
		double suma = (printPadas + printSkersmuo + printIngSk);
		return suma;
	}

	private static double printIngSk(int picosIngredientuSk) {
		double suma = picosIngredientuSk * 0.5;
		return suma;
	}

	private static double printSkersmuo(double picosDydis) {
		double suma = 0;
		if (picosDydis == 20) {
			suma = 0.5;
		} else if (picosDydis == 30) {
			suma = 1.0;
		} else if (picosDydis == 50) {
			suma = 2.0;
		} else
			System.out.println("Netinkamas skersmuo");
		return suma;

	}

	private static double printPadas(String picosTipas) {
		double suma = 0;
		if (picosTipas.equals("storapade")) {
			suma = 2;
			return suma;
		} else if (picosTipas.equals("plonapade")) {
			suma = 1.5;
			return suma;
		} else
			System.out.println("Blogai �vestas tipas.");
		return 0;
	}
}
