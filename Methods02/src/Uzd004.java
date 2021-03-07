import java.util.Scanner;
public class Uzd004 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int n = 9;
		
		int counter = 0;
		
		int num;
		
		while (true) {
			System.out.println("Iveskite skaiciø: ");
			num = reader.nextInt();
			if (num==0) {
				break;
			}
			
			if (n==getSum(num)) {
				counter++;
			}
		}
		
		System.out.println(counter + " kartø/us");
		reader.close();
	}

	private static int getSum(int a) {
		int sum = 0;
		
		while (a > 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		return sum;
	}

}
