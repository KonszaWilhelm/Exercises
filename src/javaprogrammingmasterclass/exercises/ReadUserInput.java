package javaprogrammingmasterclass.exercises;

import java.util.Scanner;

public class ReadUserInput {
    public static void readUserInput() {
        int counter = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {

            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                counter++;
                System.out.println("Your num is : " + num);
                sum += num;


            } else {
                scanner.next();
                System.out.println("Invalid number");

            }
//            System.out.println( scanner.nextLine());
        }
        System.out.println("The sum is: " + sum);

    }
}
