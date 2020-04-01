
public class contar {
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	
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
