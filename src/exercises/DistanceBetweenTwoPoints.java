package exercises;

public class DistanceBetweenTwoPoints {
    static void distanceBetweenTwoPointsOnEarth (double x1, double y1, double x2, double y2) {
        //Distance between the two points [ (x1,y1) & (x2,y2)]
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        //Radius of the earth r = 6371.01 Kilometers
        double r = 6371.01  ;
        double distance = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1));
        System.out.println(distance);
    }
}
