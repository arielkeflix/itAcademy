package modulo1;

public class Mod1Nivel1Fase4 {

	public static void main(String[] args) {

		final int añoInicio = 1948;
		final int añoNacimiento = 1964;

		boolean esBisMiNacimiento = false;

		final String fraseSi = "Yo naci en un año bisiesto que es el " + añoNacimiento;
		final String fraseNo = "Yo naci en: " + añoNacimiento + " que no fue un  año bisiesto  ";

		final String nombreCompleto = "Ariel Liffschitz Cohan";
		final String fechaNacimiento = "08/10/" + añoNacimiento;

		for (int x = añoInicio + 4; x <= añoNacimiento; x = x + 4) {

			if (x == añoNacimiento)
				esBisMiNacimiento = true;
		}

		System.out.println("Mi nombre es: " + nombreCompleto);
		System.out.println("Mi fecha de nacimiento es: " + fechaNacimiento);
		if (esBisMiNacimiento)
			System.out.println(fraseSi);
		else
			System.out.println(fraseNo);

	}

}
