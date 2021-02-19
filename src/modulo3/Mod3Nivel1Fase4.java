package modulo3;

import java.util.Scanner;

public class Mod3Nivel1Fase4 {
	
	public static char[] asignarStringAarrayCharYreverso(String ciudad) {
		int largo = ciudad.length();
		char[] auxArrayCiudad = new char[largo];				
		
		for (int i = 0; i< largo ; i++) {			
			auxArrayCiudad[i] = ciudad.charAt(i);			
		}
		
		for (int x = 0; x <largo/2; x++) {
			char j;
			
			j = auxArrayCiudad[x];			
			auxArrayCiudad[x] = auxArrayCiudad[largo - x - 1];
			auxArrayCiudad[largo - x - 1] = j;					
		}		
		
		return auxArrayCiudad;
	}
	
	public static void imprimir(char[] arrayCiudad) {
		for (int i = 0; i< arrayCiudad.length ; i++)	System.out.print( arrayCiudad[i]   );
		System.out.println();
	}

	public static void main(String[] args) {
		String ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6;

		Scanner input = new Scanner(System.in);

		System.out.println("***************INGRESE 6 CIUDADES**************************");
		System.out.println();

		System.out.println("Ingrese la ciudad 1: ");
		ciudad1 = input.nextLine();			   
		char[] arrayCiudad1 = asignarStringAarrayCharYreverso(ciudad1);  // asigno el String ingresado a un array de char y lo invierto		
				
		System.out.println("Ingrese la ciudad 2: ");
		ciudad2 = input.nextLine();	
		char[] arrayCiudad2 = asignarStringAarrayCharYreverso(ciudad2);
		
		System.out.println("Ingrese la ciudad 3: ");
		ciudad3 = input.nextLine();		
		char[] arrayCiudad3 = asignarStringAarrayCharYreverso(ciudad3);
		
		System.out.println("Ingrese la ciudad 4: ");
		ciudad4 = input.nextLine();	
		char[] arrayCiudad4 = asignarStringAarrayCharYreverso(ciudad4);
		
		System.out.println("Ingrese la ciudad 5: ");
		ciudad5 = input.nextLine();
		char[] arrayCiudad5 = asignarStringAarrayCharYreverso(ciudad5);
		
		System.out.println("Ingrese la ciudad 6: ");
		ciudad6 = input.nextLine();
		char[] arrayCiudad6 = asignarStringAarrayCharYreverso(ciudad6);		
		
		
		System.out.println("Las ciudades ingresadas al revez son : ");
		
		imprimir(arrayCiudad1);    
		imprimir(arrayCiudad2);
		imprimir(arrayCiudad3);
		imprimir(arrayCiudad4);
		imprimir(arrayCiudad5);
		imprimir(arrayCiudad6);

	}

}
