import java.util.Scanner;

public class ZigZagtraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < M; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = M - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}