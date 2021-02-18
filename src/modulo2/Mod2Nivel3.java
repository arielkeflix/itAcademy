package modulo2;

import java.io.IOException;
import java.util.Scanner;

// es un programa hecho en forma "absurda" simplemente para usar bucles, busque como limpiar consola, pero ninguna funcion funciono
// para hacerlo "de verdad" habria que hacerlo con oros recursos

public class Mod2Nivel3 {

	public static void main(String[] args) throws InterruptedException, IOException {	
		
		final int lapsoSegundos = 1; // lapso en milisegundos que ocurre 1 segundo, asignando "1" milisegundos tarda en mi maquina aproximadamente 3 minutos en hacer un dia completo
		
      //giro 24 veces, si al final de este bucle "hora" tiene 23 la vuelvo a 0 asignandole -1 cuando retoma agrega y vuelve a 0
		for (int hora = 0; hora < 24; hora++) {
			
			//giro 60 veces por cada minuto (de 0 a 59)
			for (int minuto = 0; minuto < 60; minuto++) {
				
				//giro 60 veces por cada segundo (de 0 a 59)
				for (int segundo = 0; segundo < 60; segundo++) {
					
                    if (hora< 10)	System.out.print("0"); // si la hora es menor a 10 agrego un 0 adelante
					
					System.out.print(hora + ":");
					
					if (minuto < 10)	System.out.print("0"); // si los minutos es menor a 10 agrego un 0 adelante
					
					System.out.print(minuto + ":");

					if (segundo < 10)	System.out.print("0"); // si los segundos es menor a 10 agrego un 0 adelante

					System.out.print(segundo);					
					
					Thread.sleep(lapsoSegundos); // tiempo de espera para imitar el tiempo de cada segundo

					System.out.println();				
				}

			}
			if (hora==23 ) hora = -1;   //si "hora" tiene 23 la vuelvo a 0 asignandole -1 cuando retoma agrega y vuelve a 0
		}
	}
	

}
