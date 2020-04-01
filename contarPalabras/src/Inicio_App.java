import java.util.Scanner;

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
