import java.util.Scanner;

public class Replacestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
            if (t > 0) {
                System.out.println();
            }
        }
        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}