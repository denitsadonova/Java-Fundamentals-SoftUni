package Data_Types_Excercise;

import java.util.Scanner;

public class Sum_Of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int) symbol;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
