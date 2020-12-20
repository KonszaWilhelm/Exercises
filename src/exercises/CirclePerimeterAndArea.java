package exercises;

public class CirclePerimeterAndArea {

    static String circleAreaPerimeter(double radius) {
        return "Perimeter is " + (2 * Math.PI * radius) + "\n" +
                "Area of the circle is: " + (Math.PI * (Math.pow(radius, 2)));
    }
}
