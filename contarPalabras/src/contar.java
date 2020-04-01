/**
 * Esta clase llamada contar va a contener los m�todos relacionados con 
 * contar numero de letras, palabras y veces que se repite una letra.
 * @author alejandro
 * version 1.0
 */
public class contar {
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	/**
	 * Este m�todo se encarga de obtener el n�mero de caracteres que tiene
	 * el string que le pasamos por par�metro.
	 * @param cadena
	 * @return
	 */
	int contarCaracteresTotal(String cadena) {
		int contadorCaracteres=0;
		for (int i = 0;i<cadena.length();i++){ 
			char car = cadena.charAt(i);
			contadorCaracteres++;
		}
		return contadorCaracteres;
	}
	
	/**
	 * Este m�todo se encarga de obtener el n�mero de palabras del string que 
	 * le pasamos por par�metro
	 * @param cadena
	 * @return
	 */
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
	
	/**
	 * Este m�todo se encarga de contar las veces que se repite el mismo caracter en la cadena
	 * @param cadena
	 * @return
	 */
	
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
