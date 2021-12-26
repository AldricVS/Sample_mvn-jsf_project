package buisness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {

	@Test
	public void successTest() {
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void catchExceptionTest() throws ArithmeticException {
		int a = 2 / 0;
		int b = 1000;
		assertEquals(1000, b);
	}
}
