import java.util.Scanner;
/**
 * Esta clase es la principal, contiene el método main y va a ser la encargada de coger 
 * los datos por pantalla y aplicar los métodos de las demás clases sobre los objetos
 * creados en ella.
 * @author alejandro
 * version 1.0
 */
public class Inicio_App {


	static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
	
	public static void main(String[] args) {
		
		contar c = new contar();
		escribirPantalla ep = new escribirPantalla();
		
		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine();
		
		int caracteresTotal 	= c.contarCaracteresTotal(cadena);
		int palabrasTotal		= c.contarNumeroPalabras(cadena);
		int [] todosCaracteres 	= c.contarTodosCaracteres(cadena);
		
		ep.textoCaracteresTotal(caracteresTotal);
		ep.textoNumeroPalabras(palabrasTotal);
		ep.textoTodosCaracteres(todosCaracteres);
		scan.close();
		
	}

}
