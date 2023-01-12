import java.util.Scanner;

public class Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            int currentNum = i;

            while (currentNum > 0) {
                sum = sum + currentNum % 10;
                currentNum = currentNum / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }
    }
}
