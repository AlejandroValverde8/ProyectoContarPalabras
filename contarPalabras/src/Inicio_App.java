import java.util.Scanner;

public class Inicio_App {

	
	char [] letras;
	int palabras;
	int numCaracteresSinBlancos = 0;
	final String TEXTO_LETRAS= "Las letras que se repiten son:";
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
	final String TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS= " caracteres(sin contar los blancos).";
	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public Inicio_App(){
		
		letras = new char[65536];
		palabras = 1;
	}
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
	
	String textoCaracteresTotal (int total){
		String resultadoletras=TEXTO_TOTAL_CARACTERES_SIN_BLANCOS + numCaracteresSinBlancos + TEXTO_FINAL_TOTAL_CARACTERES_SIN_BLANCOS;
		return resultadoletras;
	}
	
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
	
	public static void main(String[] args) {
		Inicio_App ia = new Inicio_App();
		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		
		int caracteresTotal 	= ia.contarCaracteresTotal(cadena);
		int palabrasTotal		= ia.contarNumeroPalabras(cadena);
		int [] todosCaracteres 	= ia.contarTodosCaracteres(cadena);
		
		ia.textoCaracteresTotal(caracteresTotal);
		ia.textoNumeroPalabras(palabrasTotal);
		ia.textoTodosCaracteres(todosCaracteres);
		scan.close();
		
	}

}
