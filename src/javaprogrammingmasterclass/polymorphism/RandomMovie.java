package javaprogrammingmasterclass.polymorphism;

public class RandomMovie {




    public Movie getRandomMovie() {

        int randNum = (int) (Math.random() * 5 + 1);
        System.out.println("Random number is: " + randNum);
        switch (randNum) {
            case 1:
                return new IndependenceDay();
            case 2:
                return new Jaws();
            case 3:
                return new PulpFiction();
            case 4:
                return new UsualSuspects();
            case 5:
                return new Leon();
            default:
                return null;
        }
    }


}
