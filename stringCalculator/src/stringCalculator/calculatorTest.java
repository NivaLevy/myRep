package stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest extends calculator {

	/*public String value1;
	
	public String value2;*/
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testEmpty() {
		int sum=Add("");
		assertEquals(sum, 0);
	}
	
	@Test
	public void testOne() {
		int sum=Add("1");
		assertEquals(sum, 1);
	}
	
	@Test
	public void testTwo() {
		int sum=Add("2");
		assertEquals(sum, 2);
	}
	
	@Test
	public void testAddOfTwoWithComma() {
		int sum=Add("1,2");
		assertEquals(sum, 3);
	}
	
	@Test
	public void testAddOfTwoWithEnter() {
		int sum=Add("1\n2");
		assertEquals(sum, 3);
	}
	
	/*protected void addNegatice() throws Exception {
		if(((int)value1)<0 || value2<0)
			
	}*/
}
