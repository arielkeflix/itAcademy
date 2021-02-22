package modulo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mod4Nivel1Fase2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		Map< String, Integer> menu = new HashMap<String, Integer>();
		List <String> listComida = new ArrayList<String>();
		
//		int billete100 = 0; no se usan hasta en el nivel 3
//		int billete50 = 0;
//		int billete20 = 0;
//		int billete10 = 0;
//		int billete5 = 0;
//	    int billete1 = 0;
		final int CANTIDAD_PLATOS = 3;
		
		boolean seguir = true;
		
		for(int i = 0 ; i < CANTIDAD_PLATOS; i++) {
			System.out.print("ingrese el nombre del plato "+ (i+1)+" : "  );
			String plato = input.nextLine().toLowerCase();			
			System.out.println("");
			System.out.print("ingrese el precio del plato: " ) ;
			int precio = input.nextInt();
			menu.put(plato, precio);
			input.nextLine();
			System.out.println("");						
		}
		
		
		System.out.println("********Menu del restaurant*********");
		for (String i : menu.keySet()) {
			  System.out.println("plato de "+i + " precio: " + menu.get(i));
			}
		
		while (seguir){
			
			 System.out.print("ingrese el plato elegido :");
			 String auxPlato = input.nextLine().toLowerCase() ;
			 
			 if ( menu.containsKey(auxPlato)) listComida.add (auxPlato);
			 else System.out.println("Lo siento no tenemos ese plato en el menu" );
				 
			 System.out.println("Quiere pedir otro plato ( 'si' o 'no') : ");
			 String auxSeguir = input.nextLine();
			
			 if (auxSeguir.toLowerCase().contentEquals("no") )   seguir=false;				 			 			 
			
		}			
		
		System.out.println("Los platos pedidos son: " );
		for(String i:listComida) System.out.print( i +", ");		
	}
}

