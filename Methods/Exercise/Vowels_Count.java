package Methods_Exercise;

import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> текст
        String text = scanner.nextLine();
        printVowelsCount(text.toLowerCase());

    }
    public static void printVowelsCount (String text) {

        int count = 0; //брой на гласните букви
        for (char symbol : text.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {

                count++;
            }
        }
        System.out.println(count);
    }
}
