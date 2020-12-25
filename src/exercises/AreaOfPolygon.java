package exercises;

public class AreaOfPolygon {
    static void areOfPolygon (int numOfSide, int sideLength) {
       double Area = (numOfSide * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / numOfSide)));
        System.out.println(Area);
    }
}
