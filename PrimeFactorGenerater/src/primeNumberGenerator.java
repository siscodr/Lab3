import java.util.ArrayList;
import java.util.List;

public class primeNumberGenerator {
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int j = 2; j < i; j++){
			boolean isprime = true;
		      for (int x = 2; x < j; x++) {   //Inspired by the code from Unit - Parameterized Test
		          if (j % x == 0) {
		             isprime =  false;
		          }
		       }
		    if(isprime){
			primes.add(j);
		    }
	}
		return primes;
	}
}
