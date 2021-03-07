
public class Metodai {

	public static int[] randomArray(int a, int min, int max) {
		int[] randomArray = new int[a];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Metodai.random(min, max));
		}
		return randomArray;

	}

	public static int random(int min, int max) {
		int range = max - min + 1;
		return (int) (Math.random() * range) + min;

	}

	public static int maxArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) { // 8 > 5 => True
				max = arr[i]; // max = 8
			}
		}
		return max;
	}

	public static int minArray(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
}