package modulo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mod4Nivel2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Map<String, Integer> menu = new HashMap<String, Integer>();
		List<String> listComida = new ArrayList<String>();

//			int billete100 = 0; no se usan hasta en el nivel 3
//			int billete50 = 0;
//			int billete20 = 0;
//			int billete10 = 0;
//			int billete5 = 0;
//		    int billete1 = 0;
		final int CANTIDAD_PLATOS = 3;

		int costoTotal = 0;
		boolean seguir = true;
		//********************ingreso de nombre y precio de los platos del menu**************************
		for (int i = 0; i < CANTIDAD_PLATOS; i++) {
			seguir = true;
			System.out.print("ingrese el nombre del plato " + (i + 1) + ": ");
			String plato = input.nextLine().toLowerCase();

			while (seguir) {

				System.out.print("ingrese el precio del plato: ");
				try {
					int precio = input.nextInt();
					menu.put(plato, precio);
					seguir = false;
				} catch (Exception e) {
					System.out.println("Tiene que ingresar un valor numerico entero, intente  de nuevo");
				}
				input.nextLine();
			}

		}
		//******************** Fin de ingreso de nombre y precio de los platos del menu**************************
		System.out.println("********Menu del restaurant*********");
		for (String i : menu.keySet()) {
			System.out.println("plato de " + i + " precio: " + menu.get(i));
		}
		System.out.println("");
		seguir = true;
		//****************platos que elige el cliente ***********************************
		while (seguir) {

			System.out.print("ingrese el plato elegido :");
			String auxPlato = input.nextLine().toLowerCase();

			if (menu.containsKey(auxPlato)) {
				listComida.add(auxPlato);
				costoTotal += menu.get(auxPlato);
			} else
				System.out.println("Lo siento no tenemos ese plato en el menu");
			boolean continuar = true;
			while (continuar) {
				System.out.println("Quiere pedir otro plato ( 'si' o 'no') : ");
				String auxSeguir = input.nextLine();

				if (auxSeguir.toLowerCase().contentEquals("no")) { // si termino el pedido temrmina los 2 while
					continuar = false;
					seguir = false;
				} else if (auxSeguir.toLowerCase().contentEquals("si")) {// si quiere continuar pidiendo termina este
																			// while de validacion y sigue en el otro
					continuar = false;
					seguir = true;
				} else {
					System.out.println("Debe escribir por teclado la palabra 'no' o 'si' y presionar enter");
					continuar = true; // si pone un palabra errada le aviso y vuelve a tener que ingresar si/no
				}
			}
		}
		//**************** Fin de platos que elige el cliente ***********************************

		System.out.println("Los platos pedidos son: ");
		for (String i : listComida)
			System.out.print(i + ", ");
		System.out.println("El costo de la comida es: " + "€" + costoTotal);
	}

}
