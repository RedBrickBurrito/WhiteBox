package mx.tec.lab; 
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
public class OddAndEvenEvaluatorTest { 
	OddAndEvenEvaluator evaluator = new OddAndEvenEvaluator();
	@Test public void givenA2B2WhenEvaluateThenCEvenDEven() {
		// Given 
		double a = 2;
		double b = 2; 
		// When 
		String result = evaluator.evaluate(a, b); 
		// Then
		assertEquals("C is even and D is even, c=4.0 and d=0.0", result); 
		} 
	
	@Test public void givenA3B2WhenEvaluateThenCEvenDEven() {
		// Given 
		double a = 3;
		double b = 2; 
		// When 
		String result = evaluator.evaluate(a, b); 
		// Then
		assertEquals("C is even and D is even, c=5.0 and d=1.0", result); 
		} 
	
	@Test public void givenA8B5WhenEvaluateThenCEvenDEven() {
		// Given 
		double a = 8;
		double b = 5; 
		// When 
		String result = evaluator.evaluate(a, b); 
		// Then
		assertEquals("C is even and D is even, c=8.0 and d=5.0", result); 
		} 
	}
