package javaprogrammingmasterclass.composition.pc;

public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(15,5,"white");
        System.out.println(motherboard.getManufacturer());
    }



    @Override
    public String toString() {
        return "Pc{" +
                "theCase=" + theCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }
}
