package javaprogrammingmasterclass.exercises;

public class AreaOfCircle {
    public static double circleArea(double r) {
        if (r < 0) {
            return -1;
        }
        double area = Math.pow(r, 2) * Math.PI;
        return area;
    }

    public static double circleArea(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        double area = x * y;
        return area;
    }
}
