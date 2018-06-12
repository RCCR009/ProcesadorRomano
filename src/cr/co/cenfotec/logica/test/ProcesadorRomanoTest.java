package cr.co.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cr.co.cenfotec.logica.ProcesadorRomano;

public class ProcesadorRomanoTest {
	
	ProcesadorRomano procesadorRomano;
	
	@Before
	public void init() {
		procesadorRomano = new ProcesadorRomano();
	}

	@Test
	public void StringVacio() {
		assertEquals(0, procesadorRomano.convierte(""));
	}

}
