package modulo2;

import java.util.Scanner;

public class Mod2Nivel2Fase2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese altura de la piramide de asteriscos con un numero mayor a 1");

		int cantidad = input.nextInt();
		cantidad = cantidad * 2 - 1;
		int i = 0;

		while (cantidad > 0) {

			for (int x = 0; i > x; x++) {
				System.out.print(" ");
			}
			
			for (int j = cantidad; j > 0; j--) {
				System.out.print("*");
			}
			cantidad = cantidad - 2;
			System.out.println("");
			i++;
		}

	}

}
