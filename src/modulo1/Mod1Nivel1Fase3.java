package modulo1;

public class Mod1Nivel1Fase3 {
	public static void main(String[] args) {

		final int añoInicio = 1948;
		final int añoNacimiento = 1964;

		int cantBisiestos = 0;
		int bisiestos;
		
		boolean esBisMiNacimiento = false;

		final String fraseSi = "Yo naci en un año bisiesto que es el " + añoNacimiento;
		final String fraseNo = "Yo naci en: " + añoNacimiento + " que no fue un  año bisiesto  ";

		for (int x = añoInicio + 4; x <= añoNacimiento; x = x + 4) {

			System.out.println("años bisiesto  " + x);
			cantBisiestos++;
			if (x == añoNacimiento)
				esBisMiNacimiento = true;
		}
		bisiestos = cantBisiestos;

		System.out.println("La cantidad de bisiestos desde 1948 hasta mi año de nacimiento son: " + bisiestos);
		if (esBisMiNacimiento)
			System.out.println(fraseSi);
		else
			System.out.println(fraseNo);

	}

}
