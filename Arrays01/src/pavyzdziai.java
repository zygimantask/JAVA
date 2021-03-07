import java.util.Arrays;

public class pavyzdziai {

	public static void main(String[] args) {

		int[] pazymiai = new int[6];

		pazymiai[0] = 9;
		pazymiai[1] = 8;
		pazymiai[2] = 5;
		pazymiai[3] = 6;
		pazymiai[4] = 9;
		pazymiai[5] = 5;

		for (int i = 0; i < pazymiai.length; i++) {
			System.out.println(pazymiai[i]);
		}
		
		System.out.println("kitas budas masyvo (2)");
		
		int[] pazymiai2 = { 9, 8, 5, 6, 9, 5 };
		System.out.println(pazymiai2.length); // parodo masyvo elementu skaiciu
		System.out.println(pazymiai2); //nerasyti taip
		System.out.println(Arrays.toString(pazymiai2)); //taip yra teisingai
	}
}
