package javaprogrammingmasterclass.exercises;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour * 0.62137119223733);

        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h");
    }
}
