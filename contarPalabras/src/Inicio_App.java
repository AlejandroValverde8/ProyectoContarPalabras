import java.util.Scanner;

import java.util.Scanner;

public class Inicio_App {


	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public static void main(String[] args) {
		Inicio_App ia = new Inicio_App();
		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		
		/*int caracteresTotal 	= ia.contarCaracteresTotal(cadena);
		int palabrasTotal		= ia.contarNumeroPalabras(cadena);
		int [] todosCaracteres 	= ia.contarTodosCaracteres(cadena);
		
		ia.textoCaracteresTotal(caracteresTotal);
		ia.textoNumeroPalabras(palabrasTotal);
		ia.textoTodosCaracteres(todosCaracteres);
		scan.close();*/
		
	}

}
