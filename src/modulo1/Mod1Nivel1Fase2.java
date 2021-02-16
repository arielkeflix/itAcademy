package modulo1;

public class Mod1Nivel1Fase2 {
	public static void main(String[] args) {

		final int añoInicio = 1948;
		int cantBisiestos = 0;
		int bisiestos;

		for (int x = añoInicio; x < 1964;) {
			x = x + 4;			
			cantBisiestos++;
		}
		bisiestos = cantBisiestos;

		System.out.println("La cantidad de bisiestos desde 1948 hasta mi año de nacimiento son:" + bisiestos);

	}

}
