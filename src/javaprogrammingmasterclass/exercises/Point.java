package javaprogrammingmasterclass.exercises;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - (double) x, 2) + Math.pow(this.y - (double) y, 2));
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow((double) x - another.getX(), 2) + Math.pow((double) y - another.getY(), 2));
    }
}
