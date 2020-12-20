package javaprogrammingmasterclass.composition.room;

public class Board {

    private int height;
    private int width;


    public void write(String text) {
        System.out.println("You've written the following on the board: " + text);
    }

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
