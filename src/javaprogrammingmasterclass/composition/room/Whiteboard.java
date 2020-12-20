package javaprogrammingmasterclass.composition.room;

public class Whiteboard extends Board {

    private String markerColor;

    public Whiteboard(String markerColor) {
        super(45, 200);
        this.markerColor = markerColor;
    }

    @Override
    public void write(String text) {
        System.out.println("You wrote on the Whiteboard: " + text + " with a marker of: " + markerColor + " color");
    }


}
