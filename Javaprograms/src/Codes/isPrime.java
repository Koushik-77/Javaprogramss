import java.util.ArrayList;
import java.util.List;

public class isPrime {
    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int limit = 50;
        List<Integer> primeNumbers = generatePrimes(limit);

        System.out.println("Prime numbers up to " + limit + ": " + primeNumbers);
    }
}
