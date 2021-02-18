package modulo2;

import java.util.ArrayList;
import java.util.List;

public class Mod2Nivel1Fase2 {

	public static void main(String[] args) {
		List<String>listNombre = new ArrayList<String>();
        listNombre.add("A");
        listNombre.add("r");
        listNombre.add("i");
        listNombre.add("e");
        listNombre.add("l");
        listNombre.add("2");
        for (String i:listNombre) {
        	try {
        		System.out.println(Integer.parseInt(i) +"  es un numero, los nombres de las personas no contienen numeros");
			} catch (Exception e) {
				if(i=="a"||i=="e"||i=="i"||i=="o"||i=="u"||i=="A"||i=="E"||i=="I"||i=="O"||i=="U" )
	        		System.out.println(i +" es una vocal");
	        	else 
	        		System.out.println(i +" es una consonante");
			}       	        	
        }                       
	}

}
