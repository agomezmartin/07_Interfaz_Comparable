package pincipal;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * El método "compareTo()" viene programado
		 * por defecto en la Clase String.
		 * El método .SORT con la Clase String
		 * funciona por defecto.
		 */
		String[] listaNombres = {"Hola", "mundo.", "Esto es una prueba", "de ordenación"};

		Arrays.sort(listaNombres);
		
		for (int i=0; i<listaNombres.length; i++) {
			System.out.println(listaNombres[i]);
		}

		/*
		 * Para que el método .SORT funcione en
		 * clases creadas por el programador,
		 * deberemos programar un método "compareTo()"
		 * en la clase creada.
		 */
		Socio[] listaSocios = { new Socio (1,"Alberto"), new Socio (2,"Flavio")};
		
	}

}
