package modulo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mod2Nivel1Fase3 {

	public static void main(String[] args) {
		List<String>listNombre = new ArrayList<String>();
		HashMap <String, Integer> mapNombre = new HashMap <String, Integer> ();
		
		// me invento un nombre que tenga 2 letras repetidas para la prueba
        listNombre.add("A");
        listNombre.add("r");
        listNombre.add("r");
        listNombre.add("i");
        listNombre.add("e");
        listNombre.add("e");
        listNombre.add("l");

        for (String i:listNombre) {
        	if( ! mapNombre.containsKey(i) ) {
        		mapNombre.put(i, 1);
        		
        	}
        	else { 
        		Integer aux = mapNombre.get(i);
        		mapNombre.put(i, ++aux);        		        	
        	}
        }
        for (String i: mapNombre.keySet()) {
        	System.out.println("letra: " + i + " repetida: " + mapNombre.get(i)+ " veces");
        }
        	

	}

}
