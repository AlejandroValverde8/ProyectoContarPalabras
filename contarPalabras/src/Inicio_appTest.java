import static org.junit.Assert.assertTrue;

import java.nio.channels.NonReadableChannelException;

import org.junit.jupiter.api.Test;

public class Inicio_appTest {
	
	@Test
	void test() {
		
		contar pruebaContar = new contar();
		assertTrue(pruebaContar.contarCaracteresTotal("palabra") == 7);
	}
}
