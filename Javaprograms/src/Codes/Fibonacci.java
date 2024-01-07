import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int N) {
        if (N <= 1) {
            return N;
        } else {
            return fibonacci(N - 1) + fibonacci(N - 2);
        }
    }
}