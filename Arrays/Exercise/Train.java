package Arr_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            System.out.print(num + " ");

        }
        System.out.println();
        System.out.println(sum);
    }

}