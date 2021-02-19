package modulo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod3Nivel1Fase1 {

	public static void main(String[] args) {
		String ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6;

		Scanner input = new Scanner(System.in);

		System.out.println("***************INGRESE 6 CIUDADES**************************");
		System.out.println();

		System.out.println("Ingrese la ciudad 1: ");
		ciudad1 = input.nextLine();
		System.out.println("Ingrese la ciudad 2: ");
		ciudad2 = input.nextLine();
		System.out.println("Ingrese la ciudad 3: ");
		ciudad3 = input.nextLine();
		System.out.println("Ingrese la ciudad 4: ");
		ciudad4 = input.nextLine();
		System.out.println("Ingrese la ciudad 5: ");
		ciudad5 = input.nextLine();
		System.out.println("Ingrese la ciudad 6: ");
		ciudad6 = input.nextLine();

		System.out.println("Las 6 ciudades ingresadas son: ");

		System.out.println(ciudad1);
		System.out.println(ciudad2);
		System.out.println(ciudad3);
		System.out.println(ciudad4);
		System.out.println(ciudad5);
		System.out.println(ciudad6);

	}
}
