import java.util.Arrays;

//Exercise 20
//Kai kuriose sportin�se var�ybose sportininko pasirodym� vertina keletas teis�j�.
//I� gaut� bal�  atmetamas pats auk��iausias ir pats �emiausias �vertinimas ir tada randamas likusi� bal� vidurkis. 
//Jei  auk��iausiu balu �vertino keli teis�jai, tai atmetamas tik vienas auk��iausias balas. 
//Analogi�kai  pasielgiama ir kai keli teis�jai �vertina �emiausiu balu. 
//� masyv� �vedami a�tuoni� teis�j� pateikti  sportininko pasirodymo �vertinimai balais (1-10). 
//Para�ykite program� sportininko pasirodymo galutiniam  �vertinimui rasti. 


public class Uzduotis020 {
	public static void main(String[] args) {
		int[] ivertinimai = Metodai.randomArray(8, 1, 10);

		System.out.println(Arrays.toString(ivertinimai));
		Arrays.sort(ivertinimai);
		System.out.println(Arrays.toString(ivertinimai));
		double suma = 0;
		for (int i = 1; i < ivertinimai.length - 1; i++) {
			suma += ivertinimai[i];
		}
		double vidurkis = 0;
		vidurkis = suma / 6;

		System.out.println("Didziausias balas: " + Metodai.maxArray(ivertinimai));
		System.out.println("Maziausias balas: " + Metodai.minArray(ivertinimai));
		System.out.printf("Vidurkis: " + "%.2f", vidurkis);

	}

}
