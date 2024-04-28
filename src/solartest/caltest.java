package solartest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import solarcalulator.Calculator;
public class caltest {
	@Test
	public void Testsum()
	{
		assertEquals(50,Calculator.add(20,30));
	}
	@Test
	public void Testsubstract()
	{
		assertEquals(30,Calculator.substract(50,20));
	}
	@Test
	public void Testmultiply()
	{
		assertEquals(20,Calculator.multiply(2,10));
	}
	@Test
	public void Testdivide()
	{
		assertEquals(5,Calculator.divide(50,10));
	}
}
