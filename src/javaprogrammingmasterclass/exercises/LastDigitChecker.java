package javaprogrammingmasterclass.exercises;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (!isValid(one) || !isValid(two) || !isValid(three))
            return false;
        if (one % 10 == two % 10 || one % 10 == three % 10 || two % 10 == three % 10)
            return true;
        else
            return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else
            return true;
    }
}
