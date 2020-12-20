package javaprogrammingmasterclass.exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        int counter = 0;
        int average = 0;
        int num = 0;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your num: ");
        while (scanner.hasNextInt()) {
            System.out.println("Enter your num: ");
            num = scanner.nextInt();
            counter++;
            sum += num;
            average = (int) Math.round( sum / counter);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
