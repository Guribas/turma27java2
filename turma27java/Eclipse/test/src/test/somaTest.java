package test;

import junit.framework.TestCase;

public class somaTest extends TestCase {

	public void testSomar() {
		
		Soma somador = new Soma();
		assertEquals(30, somador.somar(10,10));
	}

}
