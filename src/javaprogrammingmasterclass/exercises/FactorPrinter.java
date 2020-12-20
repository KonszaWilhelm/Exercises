package javaprogrammingmasterclass.exercises;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number >= 1) {
            // factors of a number are the nums that divide it without remainder

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        }else
            System.out.println("Invalid Value");
    }
}
