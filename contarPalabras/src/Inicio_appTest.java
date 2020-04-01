import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.nio.channels.NonReadableChannelException;

import org.junit.jupiter.api.Test;

public class Inicio_appTest {
	
	@Test
	void test() {
		
		contar pruebaContar = new contar();
		assertTrue(pruebaContar.contarCaracteresTotal("palabra") == 7);
		
		assertTrue(pruebaContar.contarNumeroPalabras("esto es una cadena") == 4);
		
		
		
		escribirPantalla pruebaEscribir = new escribirPantalla();
		assertFalse(pruebaEscribir.textoCaracteresTotal(7) == "Esto es una prueba");
		
		assertFalse(pruebaEscribir.textoNumeroPalabras(3) == "Esto es una prueba");
		
		
	}
}
