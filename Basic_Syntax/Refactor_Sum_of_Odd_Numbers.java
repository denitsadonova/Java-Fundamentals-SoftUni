import java.util.Scanner;

public class Refactor_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int k = 2 * i + 1;
            System.out.println(k);

            sum = sum + k;

        }

        System.out.printf("Sum: %d%n", sum);
    }
}
