package Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int wagonToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(wagonToAdd);
            } else {
                int peopleToAdd = Integer.parseInt(command);
                for (int i = 0; i < numbers.size(); i++) {
                    if (peopleToAdd + numbers.get(i) <= maxCapacity) {
                        int people = numbers.get(i);
                        numbers.set(i, peopleToAdd + people);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

}
