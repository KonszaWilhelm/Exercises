package javaprogrammingmasterclass.polymorphism;

public class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens try to take over the world";
    }

}

