package modulo2;

import java.util.ArrayList;
import java.util.List;

public class Mod2Nivel1Fase4 {

	public static void main(String[] args) {
		List<String>listNombre = new ArrayList<String>();
        listNombre.add("A");
        listNombre.add("r");
        listNombre.add("i");
        listNombre.add("e");
        listNombre.add("l");    
        List<String>listApellido = new ArrayList<String>();
        listApellido.add("L");
        listApellido.add("i");
        listApellido.add("f");
        listApellido.add("f");
        listApellido.add("s");  
        listApellido.add("c");  
        listApellido.add("h");  
        listApellido.add("i");  
        listApellido.add("t");  
        listApellido.add("z"); 
        List<String>listNombreCompleto = new ArrayList<String>();
        for (String i:listNombre) {
        	listNombreCompleto.add(i);
        }
        listNombreCompleto.add(" ");
        for (String i:listApellido) {
        	listNombreCompleto.add(i);
        }
        System.out.println("El nombre completo es: "+ listNombreCompleto);
	}

}
