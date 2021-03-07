import java.util.Arrays;

//Exercise 24
//Duotas sveikøjø skaièiø masyvas arrS(n) (n=10). Raskite pirmo neigiamo masyvo elemento numerá. 

public class Uzduotis024 {
	public static void main(String[] args) {
		int[] arrS = Metodai.randomArray(10, -20, 20);
		
		System.out.println(Arrays.toString(arrS));
		for(int i = 0; i < arrS.length; i++) {
			if (arrS[i] < 0) {
				System.out.println("Index[" + (i + 1) +"] : " + arrS[i]);
				break;
			}
		}
	}
}
