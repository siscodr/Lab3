import java.util.ArrayList;
import java.util.List;

public class primeNumberGenerator {
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int j = 2; j < i; j++){
			if(j % 2 == 1 || j == 2){
			primes.add(j);
			}
	}
		return primes;
	}
}
