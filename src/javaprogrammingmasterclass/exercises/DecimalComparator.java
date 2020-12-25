package javaprogrammingmasterclass.exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decOne, double decTwo) {
        int decOneToInt = (int) (decOne * 1000);
        int decTwoToInt = (int) (decTwo * 1000);
        if (decOneToInt == decTwoToInt) {
            return true;
        } else
            return false;
    }

}
