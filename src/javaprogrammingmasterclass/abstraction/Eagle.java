package javaprogrammingmasterclass.abstraction;




public class Eagle extends Bird implements FlyingBirds {


    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly()  {
        System.out.println("Go chicken goooo!");

    }


    public static class Music {


}
}
