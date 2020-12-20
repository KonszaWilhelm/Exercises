package javaprogrammingmasterclass.exercises;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        // perfect numbers a positive integer which is equal to the sum of its proper positive divisors

            int divisor = 0;
            if (number > 1) {
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        divisor += i;
                    }
                }
            }else
                return false;


            return (divisor == number);
        }
}
