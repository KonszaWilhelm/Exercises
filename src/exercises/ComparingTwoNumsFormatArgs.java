package exercises;

import java.util.Scanner;

public class ComparingTwoNumsFormatArgs {
    static void compareTwoNums() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gi'me ya' fucking number cunt: ");
        int one = scanner.nextInt();
        System.out.println("Gi'me ya' second fucking number you useless bastard: ");
        int two = scanner.nextInt();
        if (one != two) {
            System.out.printf("%d != %d%n", one, two);
        }
        if (one == two) {
            System.out.printf("%d == %d%n", one, two);
        }
        if (one > two) {
            System.out.printf("%d >  %d%n", one, two);
        }
        if (one < two) {
            System.out.printf("%d <  %d%n", one, two);
        }
        if (one >= two) {
            System.out.printf("%d >= %d%n", one, two);
        }
        if (one <= two) {
            System.out.printf("%d <= %d%n", one, two);
        }
    }
}
