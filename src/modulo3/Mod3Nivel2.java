package modulo3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mod3Nivel2 {

	public static void main(String[] args) {		
		
		
		double[][] arrayAlumNota = new double[5][3];
		Scanner input = new Scanner(System.in);
		
		final int notaAprobado = 6; 
		DecimalFormat formato = new DecimalFormat("#.00"); // limito a 2 decimales
		
		System.out.println("Asignacion de 3 notas a 5 alumnos, formato de notas X o  X,X  (ej: 4 5  6  3,2 4,6 5,9.. )") ;
		
		//asigno por teclado a cada alumno 3 notas
		for (int i= 0; i<5; i++){			
			System.out.println("Alumno " + (i+1)) ;
			for (int j = 0; j<3; j++) {
				System.out.print(" Ingrese nota "+ (j+1)+ ": " );
				arrayAlumNota[i][j] = input.nextDouble();	
			}
		}
		// recorro el array en de cada alumno hago el promedio de sus 3 notas
		for (int i= 0; i<5; i++){
			System.out.print("La nota promedio del alumno " + (i+1)+ " es: " );
			int auxNota = 0;
			
			for (int j = 0; j<3; j++) {				
				auxNota += arrayAlumNota[i][j];
			}
			double promedio = (double) auxNota/3;			
			
			System.out.print( formato.format(promedio) );			
			
			if( promedio >= notaAprobado ) System.out.print( " ha aprobado!!!" );   // compruebo si aprovo
			else System.out.print( " ha suspendido" );
			
			System.out.println();
		}			

	}

}
