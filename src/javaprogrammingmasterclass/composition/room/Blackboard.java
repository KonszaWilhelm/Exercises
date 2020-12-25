package javaprogrammingmasterclass.composition.room;

public class Blackboard extends Board {

    private String chalkColor;

    public Blackboard(String chalkColor) {
        super(90, 200);
        this.chalkColor = chalkColor;
    }

    @Override
    public void write(String text) {
        System.out.println("You've written on the Blackboard: " + text + " with: " + chalkColor + " chalk");
    }

}
