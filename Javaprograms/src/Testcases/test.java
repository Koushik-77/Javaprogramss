import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Reads the integer
        // Consume the newline character left in the buffer
        scanner.nextLine();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // Reads the string

        System.out.println("Integer: " + num);
        System.out.println("String: " + str);

        scanner.close();

    }
}
