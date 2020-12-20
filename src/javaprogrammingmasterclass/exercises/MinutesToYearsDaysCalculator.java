package javaprogrammingmasterclass.exercises;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        double years  = (minutes / 1440) / 365;
        double days = (minutes / 1440) % 365;
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            System.out.println(minutes + " min = " + (int) years + " y and " + (int) days + " d");
        }

    }
}
