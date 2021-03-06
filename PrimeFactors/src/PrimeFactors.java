import java.util.*;

public class PrimeFactors {

	public static List<Integer> generate(int i) {

		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int subject = 2 ; i > 1 ; subject++) {
			for (; i % subject == 0; i /= subject) {
				primes.add(subject);
			}
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}

}
