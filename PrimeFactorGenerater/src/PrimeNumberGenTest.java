import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberGenTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 1, list() },
                 { 2, list() },
                 { 3, list(2) },
                 { 4, list(2,3)},
                 { 6, list(2,3,5)},
                 { 8, list(2,3,5,7)}
                 });
    }

    private int nInput;

    private List pExpected;

    public PrimeNumberGenTest(int input, List expected) {
        nInput= input;
        pExpected= expected;
    }

	private static List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
	}
	
    @Test
    public void test() {
    	System.out.println("Input: " + pExpected + " Result: " + primeNumberGenerator.generate(nInput) );
        assertEquals(pExpected, primeNumberGenerator.generate(nInput));
    }
}