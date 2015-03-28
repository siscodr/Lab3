import java.util.*;


public class PrimeFactors {

	public static List<Integer> generate(int i) {

		ArrayList<Integer> primes = new ArrayList<Integer>();
		int subject = 2;
		while (i > 1){
		for(;i % subject == 0; i /= subject){
			primes.add(subject);
		}
		subject ++;
		}
		if(i > 1){
			primes.add(i);
		}
		return primes;
	}

}
