package Data_Types_Excercise;

import java.util.Scanner;

public class Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = "";
        int countKegs = Integer.parseInt(scanner.nextLine());
        for (int keg = 0; keg < countKegs; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModelKeg = model;
            }
        }
        System.out.println(maxModelKeg);
    }
}
