package modulo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mod3Nivel3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 1;
		while (numero != 0) {			
			System.out.println("Ingrese numero entero(cantidad de numeros que tendra la serie) para el calculo de Fibonacci '0' para finalizar. El maximo es 93 numeros");
			 numero = input.nextInt();
			 if (numero==0)break;
			 long num1 = 0;			
			 long num2 = 1;	
			 System.out.print("La serie con " + numero + " numeros es: "+ num1);
			 
			 for (int i = 1; i<numero; i++) {			 				 
				 System.out.print( ", " + num2 );
				 long aux = num2;
				 num2= num1+num2;
				 num1=aux;		 
			 }
			 System.out.println("");
		}
			
	}
}
