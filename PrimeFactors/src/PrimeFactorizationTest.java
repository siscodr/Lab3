import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;


public class PrimeFactorizationTest {

	private List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}
	
	@Test
	public void testone() {
		assertEquals(list(),PrimeFactors.generate(1));
	}
	
	@Test
	public void testtwo() throws Exception {
		assertEquals(list(2),PrimeFactors.generate(2));
	}
}
