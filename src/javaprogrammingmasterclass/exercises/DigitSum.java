package javaprogrammingmasterclass.exercises;

public class DigitSum {
    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum + " sum of digits");
    }
}
