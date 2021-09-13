package com.test.practic.controlador;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OperacionesTest {

	@Test
	void testSuma() {
		
		Operaciones operacioens = new Operaciones();
		operacioens.setValor1(1);
		operacioens.setValor2(5);
		
		Assert.assertTrue(Integer.valueOf("6").equals(operacioens.getSuma()));
		
	}

}
