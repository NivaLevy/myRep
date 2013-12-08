package stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest extends calculator {

	
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

/*	@Test
	public void testEmpty() {
		int sum=0;
		try{
		sum=Add("");}
		catch(Exception e){}
		assertEquals(sum, 0);
	}
	
	@Test
	public void testOne() {
		int sum=0;
		sum=Add("1");
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
	
	@Test
	public void testAddOffewNumbers() {
		int sum=Add("1,2,3,4\n5");
		assertEquals(sum, 15);
	}
	
	@Test
	public void testAddOffewBigNumbers() {
		int sum=Add("11,2,3,4\n5");
		assertEquals(sum, 25);
	}
	
	@Test
	public void testAddCommaThenEnter() {
		int sum=Add("11,2,3,4,\n5");
		assertEquals(sum, 0);
	}
	
	@Test
	public void testAddEnterThenComma() {
		int sum=Add("11,2,3,4\n,5");
		assertEquals(sum, 0);
	}
	*/
	@Test
	public void addNegatice() {
		int sum=0;
		try{sum=Add("-11,2,-3,4,5");}
		catch(Exception e){System.out.println(e.getMessage());}
		assertEquals(sum, 0);			
	}
}
