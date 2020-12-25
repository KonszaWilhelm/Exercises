package exercises;

public class AreaOfHexagon {
    static void areaOfHexagon(int side) {
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println(area);
    }
}
