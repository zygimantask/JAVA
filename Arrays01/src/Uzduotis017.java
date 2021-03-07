import java.util.Arrays;
import java.util.Scanner;

//Exercise 17
//Paraðykite programà, kuri áterptø á masyvà arrQ[n] (n=50) prieð k-tàjá elementà reikðmæ X,
//suraðant  reikiamus elementus á naujà masyvà arrY[n+1]. Atspausdinkite masyvà arrY[n+1]. 

public class Uzduotis017 {

	public static void main(String[] args) {

		int[] arrQ = Metodai.randomArray(50, -10, 20);

		System.out.println(Arrays.toString(arrQ));

		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite elemento reiksme x, kuria norite prideti: ");

		int x = reader.nextInt();

		System.out.println("Iveskite elementa k, pries kuri norite gauti reiksme X: ");

		int k = reader.nextInt();
		
		reader.close();
	
		int[] arrY = new int[arrQ.length + 1]; 
		
		System.out.println(arrY.length);
		
		for (int i = 0; i < arrQ.length; i++) { 
			if (i < k) { 
				arrY[i] = arrQ[i];  
				} else if (i == k) { 
				 arrY[i] = x;
				 arrY[i + 1] = arrQ[i];
				} else 
					arrY[i + 1] = arrQ[i];
			}
			
			System.out.println(Arrays.toString(arrY));
		}
		
	}


