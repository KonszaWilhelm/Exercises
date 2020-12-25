package javaprogrammingmasterclass.polymorphism;

public class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a bunch of ppl with small peepees";
    }

}
