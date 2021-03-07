import java.util.Arrays;

//Exercise 20
//Kai kuriose sportinëse varþybose sportininko pasirodymà vertina keletas teisëjø.
//Ið gautø balø  atmetamas pats aukðèiausias ir pats þemiausias ávertinimas ir tada randamas likusiø balø vidurkis. 
//Jei  aukðèiausiu balu ávertino keli teisëjai, tai atmetamas tik vienas aukðèiausias balas. 
//Analogiðkai  pasielgiama ir kai keli teisëjai ávertina þemiausiu balu. 
//Á masyvà ávedami aðtuoniø teisëjø pateikti  sportininko pasirodymo ávertinimai balais (1-10). 
//Paraðykite programà sportininko pasirodymo galutiniam  ávertinimui rasti. 


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
