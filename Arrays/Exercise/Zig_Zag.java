package Arr_Ex;

import java.util.Scanner;

public class Zig_Zag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String [] firstArr = new String [rows];
        String [] secondArr = new String[rows];

        for (int i = 1; i <= rows; i++) {

            String [] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];

            if (i % 2 == 0) {
                secondArr[i - 1] = firstNum;
                firstArr[i - 1] = secondNum;
            } else {
                firstArr[i - 1] = firstNum;
                secondArr[i - 1] = secondNum;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
