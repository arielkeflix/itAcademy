package modulo2;

import java.util.Scanner;

public class Mod2Nivel2Fase1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un numero mayor a 1");

		int numero = input.nextInt();
		int i = 1;
		while ( i<= numero  ) {			
			for (int x = 1; x <= i; x++) {
				System.out.print(" " + x);
			}
			i++;		
			System.out.println("" );
		}

	}

}
