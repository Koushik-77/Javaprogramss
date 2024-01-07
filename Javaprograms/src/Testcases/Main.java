public class Main {
    public static void main(String[] args) {
        int rows = 5; // number of rows for the pyramid

        for(int i = 0; i < rows; i++) {
            // print spaces
            for(int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            // print stars
            for(int j = 0; j <= 2 * i; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}