package modulo1;

public class Mod1Nivel3 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(" El array original es: ");
		
		for (int x = 0; x < array.length; x++) {
			System.out.print( array[x] +", ");
		}
		
		for (int x = 0; x < array.length/2; x++) {
			int j;
			
			j = array[x];			
			array[x] = array[array.length - x - 1];
			array[array.length - x - 1] = j;					
		}
		
		System.out.println();
		System.out.println(" El array girado de atras hacia adelante quedaria asi: ");
		
		for (int x = 0; x < array.length; x++) {
			System.out.print( array[x] +", ");
		}

	}

}
