import java.util.Scanner;
public class Uzd001 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite intervalo pirmaji sveikaji skaiciu: ");
		int a = reader.nextInt();
		System.out.println("Iveskite intervalo antraji sveikaji skaiciu: ");
		int b = reader.nextInt();
		System.out.println("Skaitmenu suma: " + skaitmenuSuma(a));
		System.out.println("-------------------------------------");
		System.out.println("Skaitmenu suma: " + skaitmenuSuma(b));
		System.out.println("-------------------------------------");
		intervalas(a, b);
		System.out.println("-------------------------------------");
		
		reader.close();
		
	}
	
	private static void intervalas(int i, int j) {
		while (i < j) {
			i++;
			
			System.out.println(i);
		}
		
		
	}

	private static int skaitmenuSuma(int e) {
				int suma = 0;
				while (e>0) {
					suma += e % 10;
					e = e / 10;
					
				}
				return suma;
	}
}
