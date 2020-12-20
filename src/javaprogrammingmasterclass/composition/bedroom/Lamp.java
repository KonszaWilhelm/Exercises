package javaprogrammingmasterclass.composition.bedroom;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public void turOn(){
        System.out.println("The lamp is being turned on.");
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }


}
