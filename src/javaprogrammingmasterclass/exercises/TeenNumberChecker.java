package javaprogrammingmasterclass.exercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        if (checkNum(firstValue) || checkNum(secondValue) || checkNum(thirdValue))
            return true;
        else
            return false;
    }

    public static boolean checkNum(int num) {
        if (num >= 13 || num <= 19)
            return true;
        else
            return false;

    }
}
