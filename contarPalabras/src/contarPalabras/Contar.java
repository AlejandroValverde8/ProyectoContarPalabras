package contarPalabras;

public class Contar {
	
		char [] letras;
		int palabras;
		int numCaracteresSinBlancos = 0;
		final String TEXTO_LETRAS= "Las letras que se repiten son:";
		final String TEXTO_PALABRAS= "Se han ingresado ";
		final String TEXTO_FINAL_PALABRAS= " palabras.";
		final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
		final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
		static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
		
		
		

	int contarCaracteresTotal(String cadena) {
		int contadorCaracteres=0;
		for (int i = 0;i<cadena.length();i++){ 
			char car = cadena.charAt(i);
			contadorCaracteres++;
		}
		return contadorCaracteres;
	}
	
	int contarNumeroPalabras(String cadena) {
		char car2=' ';
		for (int i=0;i<cadena.length();i++) {
			char car = cadena.charAt(i);
			if (car != ' ') numCaracteresSinBlancos++; //Aumento el contador de caracteres no blancos
			if (car == ' ' && car2!=' ') { // Aumento el contador de palabras
				palabras++;
			}
			car2=car;
		}
		return palabras;
	}
	
	int [] contarTodosCaracteres(String cadena) {
		int [] contador = new int[65536];
		for (int i=0;i<cadena.length();i++) {
			char car = cadena.charAt(i);
			int ascii = car; 
			contador[ascii]++; 
		//	letras[ascii] = car;
		}
		return contador;
	}
	
}
