package Arr_Ex;

import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (String elementSecondArr : secondArr) {

            for (String elementFirstArr : firstArr) {

                if (elementFirstArr.equals(elementSecondArr)) {
                    System.out.print(elementFirstArr + " ");
                    break;
                }
            }
        }

    }
}
