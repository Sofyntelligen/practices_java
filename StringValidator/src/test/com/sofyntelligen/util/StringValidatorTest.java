package test.com.sofyntelligen.util;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.com.sofyntelligen.util.StringValidator;

class StringValidatorTest {

	@Test
	void testIdValidString() {

		StringValidator stringValidator = new StringValidator();
		
		Assert.assertFalse(stringValidator.idValidString(""));
		Assert.assertTrue(stringValidator.idValidString("{}"));
		Assert.assertTrue(stringValidator.idValidString("([{}])"));
		Assert.assertTrue(stringValidator.idValidString("()[]{}"));
		Assert.assertTrue(stringValidator.idValidString("([{}])()[]{}"));
		Assert.assertTrue(stringValidator.idValidString("({)}"));
		Assert.assertTrue(stringValidator.idValidString("{([{[{)}}])]}"));
		Assert.assertTrue(stringValidator.idValidString("{([{[{)}}])]}([{}])()[]{}([{}])"));
		Assert.assertFalse(stringValidator.idValidString("(((((((((((((("));
		Assert.assertTrue(stringValidator.idValidString("(((((((((((((())))))))))))))"));
	
	}

}
