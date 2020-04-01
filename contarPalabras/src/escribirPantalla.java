/**
 * Esta clase contiene las variables y los m�todos necesarios para escribir todos
 * los resultados.
 * @author alejandro
 *
 */
public class escribirPantalla {
	
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	final String TEXTO_LETRAS= "Las letras que se repiten son:";
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
	final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
	
	
	/**
	 * Este m�todo se encarga de escribir el n�mero total de caracteres
	 * @param total
	 * @return
	 */
	String textoCaracteresTotal (int total){
		String resultadoletras=TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS;
		return resultadoletras;
	}
	
	/**
	 * Este m�todo se encarga de escribir el n�mero total de palabras
	 * @param total
	 * @return
	 */
	String textoNumeroPalabras (int total) {
		String resultadoPalabras=TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS;
		return resultadoPalabras;
	}

	String textoTodosCaracteres(int [] contador) {
		String resultados="";
		System.out.println(TEXTO_LETRAS);
		for (int i = 0;i<letras.length;i++) { //Recorro el array y muestro todo.
			if (contador[i]>0 && letras[i] != ' ') {
				if (contador[i]==1)
					System.out.println(""+letras[i]+ "-->" + contador[i] + " vez.");
				else
					System.out.println(""+letras[i]+ "-->" + contador[i] + " veces.");
			}
		    resultados=""+letras[i]+ "-->" + contador[i] + " veces.";
		   
		}
		return resultados;
	}
	
}
