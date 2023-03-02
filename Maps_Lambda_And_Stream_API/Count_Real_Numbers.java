package Maps_Lambda_And_Stream_API;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int num : numbersArr) {
            countMap.putIfAbsent(num, 0);
            countMap.put(num, countMap.get(num) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}