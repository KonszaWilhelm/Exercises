package javaprogrammingmasterclass.exercises;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        int digitSum = 0;
        if (number < 0)
            return -1;
        else {
            int lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;

            }
            int firstDigit = number % 10;
            digitSum = firstDigit + lastDigit;
            return digitSum;
        }

    }
}
