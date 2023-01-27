package Arr_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= rotations; rotation++) {
            int firstNum = numbers[0];
            for (int number = 0; number < numbers.length - 1; number++) {
                numbers[number] = numbers[number + 1];
            }

            numbers[numbers.length - 1] = firstNum;

        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
