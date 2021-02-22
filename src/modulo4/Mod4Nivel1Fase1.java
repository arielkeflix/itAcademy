package modulo4;

import java.util.Scanner;

public class Mod4Nivel1Fase1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] platos = { "Pasta", "Pizza", "Bistec", "Patatas", "Salmon", "Ensalada", "Sopa" };// new
																									// int[CANT_PLATOS];
		int[] precio = { 8, 10, 14, 5, 18, 7, 3 };

//		int billete100 = 0;  no se usan hasta el "Nivel 3"
//		int billete50 = 0;
//		int billete20 = 0;
//		int billete10 = 0;
//		int billete5 = 0;
//	    int billete1 = 0;

		int precioTotal = 0;
		int codigoPlato = 1;

		System.out.println("********Menu del restaurant*********");
		for (int i = 0; i < 7; i++) {
			System.out.println(platos[i] + "  Precio: €" + precio[i] + " codigo: " + i);
		}
		while (codigoPlato != 0) {
			System.out.println(
					"ingrese el codigo del plato elegido (entre 1 y 7) de a uno por vez('0' para finalizar el pedido):");
			codigoPlato = input.nextInt();
			if (codigoPlato != 0) {
				System.out.println("has elegido el un plato de: " + platos[codigoPlato - 1]);
				precioTotal += precio[codigoPlato - 1];
			}
		}
		System.out.println("El costo total de su pedido es: €" + precioTotal);

	}

}
