package modulo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod3Nivel1Fase3 {

	public static void main(String[] args) {
		String[] arrayCiudades = new String[6];
		String[] arrayCiudadesModificadas = new String[6];
		
		Scanner input = new Scanner(System.in);
		
		String ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6;

		

		System.out.println("***************INGRESE 6 CIUDADES (todo letra minuscula)**************************");
		System.out.println();

		System.out.println("Ingrese la ciudad 1: ");
		arrayCiudades[0] = ciudad1 = input.nextLine();
		 //String str2 = arrayCiudades[0].replaceAll("a", "4");
		
		// arrayCiudadesModificadas[0] =arrayCiudades[0] ;
		// String str2 =arrayCiudadesModificadas[0].replaceAll("a", "4");
		//	System.out.println("con el cambio: " +arrayCiudadesModificadas[0]);
		
		System.out.println("Ingrese la ciudad 2: ");
		arrayCiudades[1] = ciudad2 = input.nextLine();
		
		System.out.println("Ingrese la ciudad 3: ");
		arrayCiudades[2] = ciudad3 = input.nextLine();
		
		System.out.println("Ingrese la ciudad 4: ");
		arrayCiudades[3] = ciudad4 = input.nextLine();
		
		System.out.println("Ingrese la ciudad 5: ");
		arrayCiudades[4] = ciudad5 = input.nextLine();
		
		System.out.println("Ingrese la ciudad 6: ");
		arrayCiudades[5] = ciudad6 = input.nextLine();
		
		for(int i=0; i<6 ;i++ ) {
			 arrayCiudadesModificadas[i] =arrayCiudades[i].replaceAll("a", "4") ;						
		}		
		
		String aux; 
        for(int i=1; i<=arrayCiudades.length; i++) {  
            for(int j=0; j<arrayCiudades.length-i; j++) { 
                if( arrayCiudades[j].compareTo( arrayCiudades[j+1] ) > 0 ) { 
                    aux   = arrayCiudades[j]; 
                    arrayCiudades[j]  = arrayCiudades[j+1]; 
                    arrayCiudades[j+1]= aux; 
                }    
            } 
        }
        System.out.println("Las 6 ciudades ingresadas en orden alfabetico  son: ");
        		
		for(int i=0; i<6 ;i++ ) {	
			System.out.println(arrayCiudades[i]);
			
		}	
		 for(int i=1; i<= arrayCiudadesModificadas.length; i++) {  
	            for(int j=0; j< arrayCiudadesModificadas.length-i; j++) { 
	                if(  arrayCiudadesModificadas[j].compareTo(  arrayCiudadesModificadas[j+1] ) > 0 ) { 
	                    aux   =  arrayCiudadesModificadas[j]; 
	                     arrayCiudadesModificadas[j]  =  arrayCiudadesModificadas[j+1]; 
	                     arrayCiudadesModificadas[j+1]= aux; 
	                }    
	            } 
	        }
	        System.out.println("Las 6 ciudades ingresadas modificadas las 'a' por un '4' en orden alfabetico son: ");
	        		
			for(int i=0; i<6 ;i++ ) {	
				System.out.println( arrayCiudadesModificadas[i]);
				
			}			
		
	
	}

}
